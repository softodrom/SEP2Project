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
import javax.swing.JTable;
import javax.swing.JTextField;


public class EmployeesGUI extends JFrame
{
   private JPanel north;
   private JPanel center;
   private JPanel south;
   
   private JPanel mainLeft;
   private JPanel mainCenter;
   private JPanel mainRight;
   
   private ImageIcon icon;
   private JLabel iconLabel;
   
   private JPanel tablePanel;
   private JTable table;
   
   private JPanel addEmpPanel;
   private JPanel editEmpPanel;
   private JPanel searchEmpPanel;
   
   private JButton addEmp;
   private JButton editEmp;
   private JButton searchEmp;
   private JPanel backPanel;
   private JButton back;
   
   
   public EmployeesGUI()
   {
      super("WGYM BANK");
      
      //logo
      north = new JPanel();
      icon = new ImageIcon("wgym1.png");
      iconLabel = new JLabel(icon);
      north.add(iconLabel);
      
      center = new JPanel();
      center.setLayout(new BorderLayout());
      
      //mainLeft
      mainLeft = new JPanel();
      mainLeft.setLayout(new BoxLayout(mainLeft, BoxLayout.Y_AXIS));
      
      addEmpPanel = new JPanel();
      addEmp = new JButton("Add an employee");
      addEmp.addActionListener(new AddEmp());
      addEmp.setPreferredSize(new Dimension(250,50));
      addEmpPanel.add(addEmp);
      
      editEmpPanel = new JPanel();
      editEmp = new JButton("Edit an employee");
      editEmp.addActionListener(new EditEmp());
      editEmp.setPreferredSize(new Dimension(250,50));
      editEmpPanel.add(editEmp);
      
      searchEmpPanel = new JPanel();
      searchEmp = new JButton("Search an employee");
      searchEmp.addActionListener(new SearchEmp());
      searchEmp.setPreferredSize(new Dimension(250,50));
      searchEmpPanel.add(searchEmp);
      
      mainLeft.add(addEmpPanel);
      mainLeft.add(editEmpPanel);
      mainLeft.add(searchEmpPanel);
      
      //mainCenter
      mainCenter = new JPanel();
      
      tablePanel = new JPanel();
      table = new JTable(20,7);
      tablePanel.add(table);
      
      mainCenter.add(tablePanel);
      
      center.add(mainLeft, BorderLayout.WEST);
      center.add(mainCenter, BorderLayout.CENTER);
      
      //south
      south = new JPanel();
      backPanel = new JPanel();
      back = new JButton("BACK");
      back.setPreferredSize(new Dimension(100,30));
      back.addActionListener(new Back());
      backPanel.add(back);
      south.add(backPanel);
      
      
      
      
      
      add(north, BorderLayout.NORTH);
      add(center, BorderLayout.CENTER);
      add(south, BorderLayout.SOUTH);
      setSize(1000,700);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
   }
   
   public class AddEmp implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         AddEmployeeGUI addEmployee = new AddEmployeeGUI();
      }
   }
   
   public class EditEmp implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         EditEmployeeGUI editEmployee = new EditEmployeeGUI();
      }
   }
   
   public class SearchEmp implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         SearchEmployee searchEmployee = new SearchEmployee();
      }
   }
   
   public class Back implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         WelcomeGUI welcome = new WelcomeGUI();
         dispose();
      }
   }
   
   public static void main(String[] args)
   {
      EmployeesGUI employeePage = new EmployeesGUI();
   }

}
