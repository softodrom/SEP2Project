package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import program.Event;


public class EditEvent extends JFrame
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
   private JTextField name;
   private JTextField department;
   private JComboBox<Integer> startDay;
   private JComboBox<Integer> startMonth;
   private JComboBox<Integer> startHour;
   private JComboBox<Integer> startMinute;
   
   private JLabel slash1;
   private JLabel slash2;
   private JComboBox<Integer> finishDay;
   private JComboBox<Integer> finishMonth;
   private JComboBox<Integer> finishHour;
   private JComboBox<Integer> finishMinute;
   private JButton edit;
   private JButton delete;
   
   private Integer[] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,
         25,26,27,28,29,30,31};
   private Integer[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
   private Integer[] hours = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
   private Integer[] minutes = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,
         25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59};
   private JPanel addParticipantsPanel;
   private JButton addParticipants;
   
   public EditEvent()
   {
      super("Edit an event");
      
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
      
      addParticipantsPanel = new JPanel();
      addParticipantsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      addParticipants = new JButton("Add a participant");
      addParticipants.addActionListener(new AddParticipants());
      addParticipants.setPreferredSize(new Dimension(150,20));
      addParticipantsPanel.add(addParticipants);
      
      startPanel = new JPanel();
      startLabel = new JLabel("Start");
      startDay = new JComboBox<Integer>(days);
      slash1 = new JLabel("/");
      startMonth = new JComboBox<Integer>(months);
      startHour = new JComboBox<Integer>(hours);
      slash2 = new JLabel(":");
      startMinute = new JComboBox<Integer>(minutes);
      startPanel.add(startLabel);
      startPanel.add(startDay);
      startPanel.add(slash1);
      startPanel.add(startMonth);
      startPanel.add(startHour);
      startPanel.add(slash2);
      startPanel.add(startMinute);
      
      finishPanel = new JPanel();
      finishLabel = new JLabel("End");
      finishDay = new JComboBox<Integer>(days);
      slash1 = new JLabel("/");
      finishMonth = new JComboBox<Integer>(months);
      finishHour = new JComboBox<Integer>(hours);
      slash2 = new JLabel(":");
      finishMinute = new JComboBox<Integer>(minutes);
      finishPanel.add(finishLabel);
      finishPanel.add(finishDay);
      finishPanel.add(slash1);
      finishPanel.add(finishMonth);
      finishPanel.add(finishHour);
      finishPanel.add(slash2);
      finishPanel.add(finishMinute);
      
      buttonsPanel = new JPanel();
      buttonsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      edit = new JButton("EDIT");
      edit.addActionListener(new Edit());
      edit.setPreferredSize(new Dimension(80,30));
      delete = new JButton("DELETE");
      delete.addActionListener(new Delete());
      delete.setPreferredSize(new Dimension(80,30));
      buttonsPanel.add(edit);
      buttonsPanel.add(delete);
      
      
      panel.add(namePanel);
      panel.add(departmentPanel);
      panel.add(addParticipants);
      panel.add(startPanel);  
      panel.add(finishPanel);
      panel.add(buttonsPanel);
      
      add(panel);
      setSize(250,255);
      setVisible(true);
      setLocationRelativeTo(null);
      setResizable(false);
   }
   
   public class AddParticipants implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         AddParticipant addParticipant = new AddParticipant();
      }
   }
   
   public class Edit implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String departmentText = department.getText();
         int startDayText = Integer.parseInt(startDay.getSelectedItem().toString());
         int startMonthText = Integer.parseInt(startMonth.getSelectedItem().toString());
         int startHourText = Integer.parseInt(startHour.getSelectedItem().toString());
         int startMinuteText = Integer.parseInt(startMinute.getSelectedItem().toString());
         int finishDayText = Integer.parseInt(finishDay.getSelectedItem().toString());
         int finishMonthText = Integer.parseInt(finishMonth.getSelectedItem().toString());
         int finishHourText = Integer.parseInt(finishHour.getSelectedItem().toString());
         int finishMinuteText = Integer.parseInt(finishMinute.getSelectedItem().toString());
         Event ev = new Event(name.getText()).setDepartment(departmentText).setStartDate(startDayText).setStartMonth(startMonthText).setStartHour(startHourText).setStartMinute(startMinuteText).setEndDate(finishDayText).setEndMonth(finishMonthText).setEndHour(finishHourText).setEndMinute(finishMinuteText);
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
      EditEvent editEvent = new EditEvent();
   }

}
