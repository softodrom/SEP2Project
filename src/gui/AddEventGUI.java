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


public class AddEventGUI extends JFrame
{
   private JPanel panel;
   private JPanel namePanel;
   private JPanel departmentPanel;
   private JPanel startPanel;
   private JPanel finishPanel;
   private JPanel buttonsPanel;
   
   private JLabel nameLabel;
   private JLabel departmentLabel;
   private JLabel startLabel;
   private JLabel finishLabel;
   private JLabel buttonsLabel;
   
   private JTextField name;
   private JTextField department;
   private JComboBox startDay;
   private JComboBox startMonth;
   private JComboBox startHour;
   private JComboBox startMinute;
   
   private JLabel slash1;
   private JLabel slash2;
   private JLabel slash3;
   private JComboBox finishDay;
   private JComboBox finishMonth;
   private JComboBox finishHour;
   private JComboBox finishMinute;
   private JButton add;
   
   public AddEventGUI()
   {
      super("Add a department");
      
      panel = new JPanel();
      
      namePanel = new JPanel();
      nameLabel = new JLabel("Name           ");
      name = new JTextField(10);
      namePanel.add(nameLabel);
      namePanel.add(name);
      
      departmentPanel = new JPanel();
      departmentLabel = new JLabel("Department");
      department = new JTextField(10);
      departmentPanel.add(departmentLabel);
      departmentPanel.add(department);
      
      startPanel = new JPanel();
      startLabel = new JLabel("Start");
      startDay = new JComboBox();
      slash1 = new JLabel("/");
      startMonth = new JComboBox();
      startHour = new JComboBox();
      slash2 = new JLabel(":");
      startMinute = new JComboBox();
      startPanel.add(startLabel);
      startPanel.add(startDay);
      startPanel.add(slash1);
      startPanel.add(startMonth);
      startPanel.add(startHour);
      startPanel.add(slash2);
      startPanel.add(startMinute);
      
      finishPanel = new JPanel();
      finishLabel = new JLabel("End");
      finishDay = new JComboBox();
      slash1 = new JLabel("/");
      finishMonth = new JComboBox();
      finishHour = new JComboBox();
      slash2 = new JLabel(":");
      finishMinute = new JComboBox();
      finishPanel.add(finishLabel);
      finishPanel.add(finishDay);
      finishPanel.add(slash1);
      finishPanel.add(finishMonth);
      finishPanel.add(finishHour);
      finishPanel.add(slash2);
      finishPanel.add(finishMinute);
      
      buttonsPanel = new JPanel();
      add = new JButton("ADD");
      add.addActionListener(new Close());
      buttonsPanel.add(add);
      
      
      panel.add(namePanel);
      panel.add(departmentPanel);
      panel.add(startPanel);  
      panel.add(finishPanel);
      panel.add(buttonsPanel);
      
      add(panel);
      setSize(250,230);
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
      AddEventGUI addEvent = new AddEventGUI();
   }

}
