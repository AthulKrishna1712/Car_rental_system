import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Pro implements ActionListener
{
  String name,username,password;
  JFrame f1;
  JButton b2;
  JLabel l2,l3;
  
  Pro()
  {
    f1 = new JFrame();
    f1.setSize(1000,900);
   f1.setLocationRelativeTo(null);
    b2 = new JButton("LOGIN");
    
    
    l2 = new JLabel("Car Rental ",SwingConstants.CENTER);
    l3 = new JLabel("Don't Dream It,Drive It!",SwingConstants.CENTER);
    l2.setFont(new Font("TimesRoman",Font.PLAIN|Font.ITALIC,60));
    l3.setFont(new Font("TimesRoman",Font.PLAIN|Font.ITALIC,20));
    b2.setFont(new Font("TimesRoman",Font.PLAIN,30));
    l2.setForeground(Color.red);
    l3.setForeground(Color.red);
    b2.setForeground(Color.white);
    b2.setBackground(Color.white);

    
    b2.setBounds(420,300,150,40);
   
    
    l2.setBounds(180,20,650,200);
    
    l3.setBounds(270,70,650,200);
   
    
    f1.setContentPane(new JLabel(new ImageIcon("lambo2.jpg")));
    
    f1.add(b2);
    
    
    f1.add(l2);
    
    f1.add(l3);
    
    
    b2.addActionListener(this);
    
    

    f1.setLayout(null);
    

    f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);

    b2.setOpaque(false);
    b2.setBorderPainted(false);
    f1.setVisible(true);
  }
  public void actionPerformed(ActionEvent a)
  {
    String s = a.getActionCommand();
   if(s.equals("LOGIN"))
   {
   new carlogin();
  }
  }
  public static void main(String[] args)
  {
      new Pro();
  }
}
