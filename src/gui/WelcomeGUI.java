package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class WelcomeGUI extends JFrame
{
   private JPanel north;
   private JPanel center;
   private JPanel south;
   
   private JPanel mainLeft;
   private JPanel mainCenter;
   private JPanel mainRight;
   
   private JPanel employees;
   private JPanel offices;
   private JPanel events;
   
   private ImageIcon icon;
   private JLabel iconLabel;
   
   private JButton employeesButton;
   private JButton officesButton;
   private JButton eventsButton;
   
   public WelcomeGUI()
   {
      super("WGYM BANK");
      
      //logo
      north = new JPanel();
      icon = new ImageIcon("wgym1.png");
      iconLabel = new JLabel(icon);
      north.add(iconLabel);
      
      //buttons
      center = new JPanel();
      mainCenter = new JPanel();
      mainCenter.setLayout(new BoxLayout(mainCenter, BoxLayout.Y_AXIS));
      
      employees = new JPanel();
      employeesButton = new JButton("Employees");
      employeesButton.addActionListener(new GoToEmployees());
      employeesButton.setPreferredSize(new Dimension(250,50));
      employees.add(employeesButton);
      
      offices = new JPanel();
      officesButton = new JButton("Departments");
      officesButton.addActionListener(new GoToDepartments());
      officesButton.setPreferredSize(new Dimension(250,50));
      offices.add(officesButton);
      
      events = new JPanel();
      eventsButton = new JButton("Events");
      eventsButton.addActionListener(new GoToEvents());
      eventsButton.setPreferredSize(new Dimension(250,50));
      events.add(eventsButton);
      
      mainCenter.add(employees);
      mainCenter.add(offices);
      mainCenter.add(events);
      center.add(mainCenter);
      
      
      add(north, BorderLayout.NORTH);
      add(center, BorderLayout.CENTER);
      setSize(1000,700);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
   }
   

   public class GoToEmployees implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         EmployeesGUI employees = new EmployeesGUI();
         dispose();
      }
   }
   
   public class GoToDepartments implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         DepartmentsGUI officePage = new DepartmentsGUI();
         dispose();
      }
   }
   
   public class GoToEvents implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         EventsGUI eventPage = new EventsGUI();
         dispose();
      }
   }
   
   public static void main(String[] args)
   {
      WelcomeGUI welcomePage = new WelcomeGUI();
   }

}
