package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SearchEmployee extends JFrame
{
   private JPanel panel;
   private JPanel centre;
   private JPanel namePanel;
   private JPanel searchPanel;
   private JLabel nameLabel;
   private JTextField name;
   private JButton search;
   
   public SearchEmployee()
   {
      super("Search an employee");
      
      panel = new JPanel();
      centre = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      namePanel = new JPanel();
      namePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      nameLabel = new JLabel("Name:");
      name = new JTextField(15);
      namePanel.add(nameLabel);
      namePanel.add(name);
      centre.add(namePanel);
      
      searchPanel = new JPanel();
      search = new JButton("SEARCH");
      search.addActionListener(new Close());
      searchPanel.add(search);
      
      panel.add(centre);
      panel.add(searchPanel);
      
      add(panel);
      setSize(300,110);
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
      SearchEmployee searchEmployee = new SearchEmployee();
   }

}
