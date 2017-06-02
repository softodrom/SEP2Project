package GUI;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Events extends JFrame
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
   
   private JPanel addEventPanel;
   private JPanel editEventPanel;
   private JPanel searchEventPanel;
   private JPanel viewParticipantsPanel;
   
   private JButton addEvent;
   private JButton editEvent;
   private JButton searchEvent;
   private JPanel backPanel;
   private JButton back;
   private JButton viewParticipants;
   
   private Controller controller;
   
   public Events(Controller controller)
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
      
      addEventPanel = new JPanel();
      addEvent = new JButton("Add an event");
      addEvent.addActionListener(new AddEvents());
      addEvent.setPreferredSize(new Dimension(250,50));
      addEventPanel.add(addEvent);
      
      viewParticipantsPanel = new JPanel();
      viewParticipants = new JButton("View participants");
      viewParticipants.setPreferredSize(new Dimension(250,50));
      viewParticipants.addActionListener(new ViewParticipantsList());
      viewParticipantsPanel.add(viewParticipants);
      
      editEventPanel = new JPanel();
      editEvent = new JButton("Edit an event");
      editEvent.addActionListener(new EditEvents());
      editEvent.setPreferredSize(new Dimension(250,50));
      editEventPanel.add(editEvent);
      
      searchEventPanel = new JPanel();
      searchEvent = new JButton("Search an event");
      searchEvent.addActionListener(new SearchEvents());
      searchEvent.setPreferredSize(new Dimension(250,50));
      searchEventPanel.add(searchEvent);
      
      mainLeft.add(addEventPanel);
      mainLeft.add(viewParticipantsPanel);
      mainLeft.add(editEventPanel);
      mainLeft.add(searchEventPanel);
      
      //mainCenter
      mainCenter = new JPanel();
      
      tablePanel = new JPanel();
      String[] columnNames = {"Name","Department","Start Date","Start Time","End Date", "End Time"};
      Object[][] data = {{"Salary Day","Money","31/05","10:00","31/05","22:00"}};
      table = new JTable(data,columnNames);
      table.setPreferredScrollableViewportSize(new Dimension(600,310));
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
   
   public class AddEvents implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         AddEvent addEvent = new AddEvent();
      }
   }
   
   public class ViewParticipantsList implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         ViewParticipants a = new ViewParticipants();
      }
   }
   
   public class EditEvents implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         EditEvent editEvent = new EditEvent();
      }
   }
   
   public class SearchEvents implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         SearchEvent editEvent = new SearchEvent();
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
