package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SignInGUI extends JFrame
{
   private JPanel north;
   private JPanel center;
   private JPanel south;
   
   private JPanel mainLeft;
   private JPanel mainCenter;
   private JPanel mainRight;
   
   private ImageIcon icon;
   private JLabel iconLabel;
   
   private JPanel usernamePanel;
   private JPanel passwordPanel;
   private JPanel signInPanel;
   
   private JLabel usernameLabel;
   private JLabel passwordLabel;
   private JTextField username;
   private JPasswordField password;
   
   private JButton signIn;
   
   
   public SignInGUI()
   {
      super("WGYM BANK");
      
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
      
      
      
      add(north, BorderLayout.NORTH);
      add(center, BorderLayout.CENTER);
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
         WelcomeGUI welcome = new WelcomeGUI();
         dispose();
      }
   }
   
   public static void main(String[] args)
   {
      SignInGUI signInPage = new SignInGUI();
   }

}
