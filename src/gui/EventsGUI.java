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


public class EventsGUI extends JFrame
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
   
   private JPanel addEventPanel;
   private JPanel editEventPanel;
   private JPanel searchEventPanel;
   
   private JButton addEvent;
   private JButton editEvent;
   private JButton searchEvent;
   private JPanel backPanel;
   private JButton back;
   
   
   public EventsGUI()
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
      mainLeft.add(editEventPanel);
      mainLeft.add(searchEventPanel);
      
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
         AddEventGUI addEvent = new AddEventGUI();
      }
   }
   
   public class EditEvents implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         EditEventGUI editEvent = new EditEventGUI();
      }
   }
   
   public class SearchEvents implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         SearchEventGUI editEvent = new SearchEventGUI();
      }
   }
   
   public class Back1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         WelcomeGUI welcome = new WelcomeGUI();
         dispose();
      }
   }
   
   public static void main(String[] args)
   {
      EventsGUI eventPage = new EventsGUI();
   }

}
