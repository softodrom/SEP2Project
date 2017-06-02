package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SignIn extends JFrame
{
   private JPanel north;
   private JPanel center;
   private JPanel south;
   
   private JPanel mainCenter;
   private ImageIcon icon;
   private ImageIcon icon2;
   private JLabel iconLabel;
   private JLabel iconLabel2;
   
   private JPanel usernamePanel;
   private JPanel passwordPanel;
   private JPanel signInPanel;
   
   private JLabel usernameLabel;
   private JLabel passwordLabel;
   private JTextField username;
   private JPasswordField password;
   
   private JButton signIn;
   
   private Controller controller;
   
   public SignIn(Controller controller)
   {
      super("WGYM BANK");
      
      this.controller = controller;
      
      //logo
      north = new JPanel();
      icon = new ImageIcon("wgym1.png");
      iconLabel = new JLabel(icon);
      north.add(iconLabel);
      
      //signIn
      center = new JPanel();
      mainCenter = new JPanel();
      mainCenter.setLayout(new BoxLayout(mainCenter, BoxLayout.Y_AXIS));
      
      usernamePanel = new JPanel();
      usernamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      usernameLabel = new JLabel("Username");
      username = new JTextField(10);
      usernamePanel.add(usernameLabel);
      usernamePanel.add(username);
      
      passwordPanel = new JPanel();
      passwordPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      passwordLabel = new JLabel("Password");
      password = new JPasswordField(10);
      passwordPanel.add(passwordLabel);
      passwordPanel.add(password);
      
      signInPanel = new JPanel();
      signIn = new JButton("SIGN IN");
      signIn.addActionListener(new Next());
      signInPanel.add(signIn);
      
      mainCenter.add(usernamePanel);
      mainCenter.add(passwordPanel);
      mainCenter.add(signInPanel);
      center.add(mainCenter);
      
      south = new JPanel();
      icon2 = new ImageIcon("money.png");
      iconLabel2 = new JLabel(icon2);
      south.add(iconLabel2);
      
      add(north, BorderLayout.NORTH);
      add(center, BorderLayout.CENTER);
      add(south, BorderLayout.SOUTH);
      setSize(1000,700);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
   }
   
   public class Next implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String usernameText = username.getText();
         String passwordText = password.getText();
         
         if (!controller.existentUser(usernameText)) {

            JOptionPane.showMessageDialog(null, "The username or password is incorrect. Try again!", "Error", JOptionPane.ERROR_MESSAGE);
            
         } else
         if (controller.getUserPassword(usernameText).equals(passwordText))
         {
            Welcome welcome = new Welcome(controller);       
         }
         else
         {
            JOptionPane.showMessageDialog(null, "The username or password is incorrect. Try again!", "Error", JOptionPane.ERROR_MESSAGE);
         }
      }
   }

}
