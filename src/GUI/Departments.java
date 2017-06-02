package GUI;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Departments extends JFrame
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
   
   private JPanel addOfficePanel;
   private JPanel editOfficePanel;
   
   private JButton addOffice;
   private JButton editOffice;
   private JPanel backPanel;
   private JButton back;
   
   private Controller controller;
   
   public Departments(Controller controller)
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
      
      addOfficePanel = new JPanel();
      addOffice = new JButton("Add a department");
      addOffice.setPreferredSize(new Dimension(250,50));
      addOffice.addActionListener(new AddDepartments());
      addOfficePanel.add(addOffice);
      
      editOfficePanel = new JPanel();
      editOffice = new JButton("Edit a department");
      editOffice.setPreferredSize(new Dimension(250,50));
      editOffice.addActionListener(new EditDepartments());
      editOfficePanel.add(editOffice);
      
      mainLeft.add(addOfficePanel);
      mainLeft.add(editOfficePanel);
      
      //mainCenter
      mainCenter = new JPanel();
      
      tablePanel = new JPanel();
      String[] columnNames = {"Nr","Name","Capacity","City","Country"};
      Object[][] data = {{"1","Money","100","Horsens","Denmark"}};
      table = new JTable(data, columnNames);
      table.setPreferredScrollableViewportSize(new Dimension(600,220));
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
      back.addActionListener(new Back1());
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
   
   public class AddDepartments implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         AddDepartment addDepartment = new AddDepartment();
      }
   }
   
   public class EditDepartments implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         EditDepartment editDepartment = new EditDepartment();
      }
   }
   
   public class Back1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         Welcome welcome = new Welcome(controller);
         dispose();
      }
   }

}
