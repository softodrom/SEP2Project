package GUI;

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

import program.Department;


public class EditDepartment extends JFrame
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
   private JPanel editPanel;
   private JButton edit;
   private JButton delete;
   
   public EditDepartment()
   {
      super("Edit a department");
      
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
      
      editPanel = new JPanel();
      editPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      edit = new JButton("EDIT");
      edit.setPreferredSize(new Dimension(80,30));
      edit.addActionListener(new Edit());
      delete = new JButton("DELETE");
      delete.addActionListener(new Delete());
      delete.setPreferredSize(new Dimension(80,30));
      editPanel.add(edit);
      editPanel.add(delete);
      
      depInfo.add(nrPanel);
      depInfo.add(namePanel);
      depInfo.add(capacityPanel);
      depInfo.add(cityPanel);
      depInfo.add(countryPanel);
      depInfo.add(editPanel);
      
      panel.add(depInfo);
      
      add(panel);
      setSize(210,230);
      setVisible(true);
      setLocationRelativeTo(null);
      setResizable(false);
   }
   
   public class Edit implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         Department dep = new Department(Integer.parseInt(capacity.getText()));
         int nrText = Integer.parseInt(nr.getText());
         dep.setDepNumber(nrText);
         String nameText = name.getText();
         dep.setDepName(nameText);
         String cityText = city.getText();
         dep.setDepCity(cityText);
         String countryText = country.getText();
         dep.setDepCountry(countryText);
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
      EditDepartment addDepartment = new EditDepartment();
   }

}
