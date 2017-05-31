package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EditEmployeeGUI extends JFrame
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
   private JPanel editPanel;
   
   private JLabel cprLabel;
   private JLabel nameLabel;
   private JLabel usernameLabel;
   private JLabel emailLabel;
   private JLabel positionLabel;
   private JLabel departmentLabel;
   private JLabel wagesLabel;
   
   private JTextField cpr;
   private JTextField name;
   private JTextField username;
   private JTextField email;
   private JTextField position;
   private JTextField department;
   private JTextField wages;
   
   private JButton edit;
   private JButton delete;
   
   private JLabel space;
   
   public EditEmployeeGUI()
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
      positionLabel = new JLabel("Position       ");
      position = new JTextField(10);
      positionPanel.add(positionLabel);
      positionPanel.add(position);
      
      wagesPanel = new JPanel();
      wagesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      wagesLabel = new JLabel("Wages         ");
      wages = new JTextField(10);
      wagesPanel.add(wagesLabel);
      wagesPanel.add(wages);
      
      editPanel = new JPanel();
      editPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      space = new JLabel("  ");
      edit = new JButton("EDIT");
      edit.setPreferredSize(new Dimension(80,30));
      edit.addActionListener(new Close());
      delete = new JButton("DELETE");
      delete.setPreferredSize(new Dimension(80,30));
      delete.addActionListener(new Delete());
      editPanel.add(space);
      editPanel.add(edit);
      editPanel.add(delete);
      
      main.add(cprPanel);
      main.add(usernamePanel);
      main.add(namePanel);
      main.add(emailPanel);
      main.add(departmentPanel);
      main.add(positionPanel);
      main.add(wagesPanel);
      main.add(editPanel);
      
      
      panel.add(main);
      
      add(panel);
      setSize(230,290);
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
   
   public class Delete implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         dispose();
      }
   }
   
   public static void main(String[] args)
   {
      EditEmployeeGUI addEmployee = new EditEmployeeGUI();
   }

}
