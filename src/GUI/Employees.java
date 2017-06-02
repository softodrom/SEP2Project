package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import program.Department;
import program.Employee;


public class Employees extends JFrame
{
   private JPanel north;
   private JPanel center;
   private JPanel south;
   
   private JPanel mainLeft;
   private JPanel mainCenter;
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
   
   private Controller controller;

   public String toString(int x)
   {
      if (x < 10) return "0" + x; else
         return x + "";
   }
   
   public Employees(Controller controller)
   {
      super("WGYM BANK");
      
      this.controller = controller;
      
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
      Employee emp = new Employee();
      tablePanel = new JPanel();
      String[] columnNames = {"CPR","Username","Name","Birthday","Email","Department","Role","Wages"};
      
      EmployeeList list = controller.getEmployeesList();
      
      String[][] data = new String[list.getSize()][8];
      
      for (int i = 0; i < list.getSize(); i++) {
         
         data[i][0] = list.getEmployee(i).getCpr();
         data[i][1] = list.getEmployee(i).getUserName();
         data[i][2] = list.getEmployee(i).getName();
         data[i][3] = toString(list.getEmployee(i).getBirthDate()) + "-" + toString(list.getEmployee(i).getBirthMonth()) + "-" + list.getEmployee(i).getBirthYear();
         data[i][4] = list.getEmployee(i).getEmail();
         data[i][5] = list.getEmployee(i).getDepartment();
         data[i][6] = list.getEmployee(i).getRole();
         data[i][7] = list.getEmployee(i).getWages() + " DKK";
         
      }
      
      table = new JTable(data,columnNames);
      table.setPreferredScrollableViewportSize(new Dimension(700,280));
      table.setFillsViewportHeight(true);
      JScrollPane scrollPane = new JScrollPane(table);
      
      tablePanel.add(scrollPane);
      
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
         AddEmployee addEmployee = new AddEmployee(controller);
      }
   }
   
   public class EditEmp implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         EditEmployee editEmployee = new EditEmployee();
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
         Welcome welcome = new Welcome(controller);
         dispose();
      }
   }

}
