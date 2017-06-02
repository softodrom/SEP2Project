package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class ViewParticipants extends JFrame
{
   private JPanel tablePanel;
   private JPanel buttonPanel;
   
   private JTable table;
   private JButton button;
   
   public ViewParticipants()
   {
      super("View participants at the event");
      
      tablePanel = new JPanel();
      String[] columnNames = {"CPR","Username","Name","Birthday","Email","Department","Role","Wages"};
      Object[][] data = {{"0312972255","stremehard","Oleg Eni","03/12/1997","eocm1997@gmail.com","Money","Director","10000"}};
      table = new JTable(data,columnNames);
      table.setPreferredScrollableViewportSize(new Dimension(700,290));
      table.setFillsViewportHeight(true);
      JScrollPane scrollPane = new JScrollPane(table);
      tablePanel.add(scrollPane);
      
      buttonPanel = new JPanel();
      button = new JButton("CLOSE");
      button.addActionListener(new Add());
      buttonPanel.add(button);
      
      add(tablePanel, BorderLayout.NORTH);
      add(buttonPanel, BorderLayout.SOUTH);
      setSize(720,400);
      setVisible(true);
      setLocationRelativeTo(null);
      setResizable(false);
   }
   
   public class Add implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         dispose();
      }
   }
   
   public static void main(String[] args)
   {
      ViewParticipants viewParticipants = new ViewParticipants();
   }

}
