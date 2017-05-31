package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddEmployeeGUI extends JFrame
{
   private JPanel panel;
   private JPanel main;
   private JPanel south;
   private JPanel cprPanel;
   private JPanel namePanel;
   private JPanel usernamePanel;
   private JPanel emailPanel;
   private JPanel positionPanel;
   private JPanel departmentPanel;
   private JPanel wagesPanel;
   private JPanel addPanel;
   private JPanel birthdayPanel;
   
   private JLabel cprLabel;
   private JLabel nameLabel;
   private JLabel usernameLabel;
   private JLabel emailLabel;
   private JLabel positionLabel;
   private JLabel departmentLabel;
   private JLabel wagesLabel;
   private JLabel birthdayLabel;
   private JLabel slash1;
   private JLabel slash2;
   
   private JTextField cpr;
   private JTextField name;
   private JTextField username;
   private JTextField email;
   private JTextField position;
   private JTextField department;
   private JTextField wages;
   private JTextField day;
   private JTextField month;
   private JTextField year;
   
   private JButton add;
   
   public AddEmployeeGUI()
   {
      super("Add an employee");
      
      panel = new JPanel();
      
      main = new JPanel();
      main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
      
      cprPanel = new JPanel();
      cprPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      cprLabel = new JLabel("CPR              ");
      cpr = new JTextField(10);
      cprPanel.add(cprLabel);
      cprPanel.add(cpr);
      
      namePanel = new JPanel();
      namePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      nameLabel = new JLabel("Name           ");
      name = new JTextField(10);
      namePanel.add(nameLabel);
      namePanel.add(name);
      
      usernamePanel = new JPanel();
      usernamePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      usernameLabel = new JLabel("Username  ");
      username = new JTextField(10);
      usernamePanel.add(usernameLabel);
      usernamePanel.add(username);
      
      birthdayPanel = new JPanel();
      birthdayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      birthdayLabel = new JLabel("Birthday       ");
      day = new JTextField(2);
      slash1 = new JLabel("/");
      month = new JTextField(2);
      slash2 = new JLabel("/");
      year = new JTextField(3);
      birthdayPanel.add(birthdayLabel);
      birthdayPanel.add(day);
      birthdayPanel.add(slash1);
      birthdayPanel.add(month);
      birthdayPanel.add(slash2);
      birthdayPanel.add(year);
      
      emailPanel = new JPanel();
      emailPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      emailLabel = new JLabel("Email            ");
      email = new JTextField(10);
      emailPanel.add(emailLabel);
      emailPanel.add(email);
      
      departmentPanel = new JPanel();
      departmentPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      departmentLabel = new JLabel("Department");
      department = new JTextField(10);
      departmentPanel.add(departmentLabel);
      departmentPanel.add(department);
      
      positionPanel = new JPanel();
      positionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      positionLabel = new JLabel("Role              ");
      position = new JTextField(10);
      positionPanel.add(positionLabel);
      positionPanel.add(position);
      
      wagesPanel = new JPanel();
      wagesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      wagesLabel = new JLabel("Wages         ");
      wages = new JTextField(10);
      wagesPanel.add(wagesLabel);
      wagesPanel.add(wages);
      
      addPanel = new JPanel();
      add = new JButton("ADD");
      add.setPreferredSize(new Dimension(80,30));
      add.addActionListener(new Close());
      addPanel.add(add);
      
      main.add(cprPanel);
      main.add(usernamePanel);
      main.add(namePanel);
      main.add(birthdayPanel);
      main.add(emailPanel);
      main.add(departmentPanel);
      main.add(positionPanel);
      main.add(wagesPanel);
      main.add(addPanel);
      
      
      panel.add(main);
      
      add(panel);
      setSize(230,320);
      setVisible(true);
      setLocationRelativeTo(null);
      setResizable(false);
   }
   
   public class Close implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         dispose();
      }
   }
   
   public static void main(String[] args)
   {
      AddEmployeeGUI addEmployee = new AddEmployeeGUI();
   }

}
