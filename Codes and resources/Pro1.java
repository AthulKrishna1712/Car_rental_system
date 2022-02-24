import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Pro1 implements ActionListener
{
  String name,username,password;
  JFrame f1;
  JButton b2,b1,b3;
  
  Pro1()
  {
    f1 = new JFrame();
    f1.setSize(1000,900);
    f1.setLocationRelativeTo(null);
    b1 = new JButton("RENT A CAR");
    b2 = new JButton("RETURN THE CAR");
    b3 = new JButton("LOGOUT");
    b1.setForeground(Color.white);
    b2.setForeground(Color.white);
    b3.setForeground(Color.white);
    b1.setBackground(Color.black);
    b2.setBackground(Color.black);
    b3.setBackground(Color.black);
    b1.setFont(new Font("TimesRoman",Font.PLAIN,20));
    b2.setFont(new Font("TimesRoman",Font.PLAIN,20));
    b3.setFont(new Font("TimesRoman",Font.PLAIN,20));
    b1.setBounds(380,300,250,40);
   
    b2.setBounds(380,350,250,40);
    
    b3.setBounds(400,600,200,40);
    
    f1.setContentPane(new JLabel(new ImageIcon("maserati.jpg")));
    
    f1.add(b1);
    

    
    f1.add(b2);
    
    f1.add(b3);
    
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    f1.setLayout(null);
    

    f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);

    b1.setOpaque(false);
    b1.setBorderPainted(false);
    b2.setOpaque(false);
    b2.setBorderPainted(false);
    b3.setOpaque(false);
    b3.setBorderPainted(false);  
    f1.setVisible(true);
  }
  public void actionPerformed(ActionEvent a)
  {
    String s = a.getActionCommand();
    if(s.equals("RENT A CAR"))
    {
    new Customer();
 }
 else if(s.equals("RETURN THE CAR"))
    {
    new returncar();
 }
 else
 {
 new Pro();
 }
 }
 public static void main(String args[])
 {
 new Pro1();
 }
}
