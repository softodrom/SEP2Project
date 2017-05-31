package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddDepartmentGUI extends JFrame
{
   private JPanel panel;
   private JPanel depInfo;
   private JPanel nrPanel;
   private JPanel namePanel;
   private JPanel capacityPanel;
   private JPanel cityPanel;
   private JPanel countryPanel;
   private JLabel nrLabel;
   private JTextField nr;
   private JLabel nameLabel;
   private JTextField name;
   private JLabel capacityLabel;
   private JTextField capacity;
   private JLabel cityLabel;
   private JTextField city;
   private JLabel countryLabel;
   private JTextField country;
   private JPanel addPanel;
   private JButton add;
   
   public AddDepartmentGUI()
   {
      super("Add a department");
      
      panel = new JPanel();
      
      depInfo = new JPanel();
      depInfo.setLayout(new BoxLayout(depInfo, BoxLayout.Y_AXIS));
      
      nrPanel = new JPanel();
      nrPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      nrLabel = new JLabel("Nr            ");
      nr = new JTextField(10);
      nrPanel.add(nrLabel);
      nrPanel.add(nr);
      
      namePanel = new JPanel();
      namePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      nameLabel = new JLabel("Name     ");
      name = new JTextField(10);
      namePanel.add(nameLabel);
      namePanel.add(name);
      
      capacityPanel = new JPanel();
      capacityPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      capacityLabel = new JLabel("Capacity");
      capacity = new JTextField(10);
      capacityPanel.add(capacityLabel);
      capacityPanel.add(capacity);
      
      cityPanel = new JPanel();
      cityPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      cityLabel = new JLabel("City         ");
      city = new JTextField(10);
      cityPanel.add(cityLabel);
      cityPanel.add(city);
      
      countryPanel = new JPanel();
      countryPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      countryLabel = new JLabel("Country ");
      country = new JTextField(10);
      countryPanel.add(countryLabel);
      countryPanel.add(country);
      
      addPanel = new JPanel();
      add = new JButton("ADD");
      add.addActionListener(new Close());
      addPanel.add(add);
      
      depInfo.add(nrPanel);
      depInfo.add(namePanel);
      depInfo.add(capacityPanel);
      depInfo.add(cityPanel);
      depInfo.add(countryPanel);
      depInfo.add(addPanel);
      
      panel.add(depInfo);
      
      add(panel);
      setSize(210,230);
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
      AddDepartmentGUI addDepartment = new AddDepartmentGUI();
   }

}
