import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class returncar implements ActionListener
{
String username,model;
JFrame f;
JButton b1,b2;
JLabel l,l1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4,t5;
returncar()
{
f = new JFrame("RETURN CAR");
f.setSize(1000,900);
f.setLocationRelativeTo(null);
l=new JLabel("RETURNING THE CAR",SwingConstants.CENTER);    
l.setFont(new Font("San-Serif", Font.PLAIN, 50));
l.setForeground(Color.white);
f.setContentPane(new JLabel(new ImageIcon("rollsroyce.jpg")));
//f.getContentPane().setBackground(Color.CYAN);
b1 = new JButton("RETURN");
b2 = new JButton("OTHER DETAILS");
l1 = new JLabel("USERNAME : ");
l2 = new JLabel("NAME OF THE CAR YOU RENTED : ");
l3 = new JLabel("BRAND : ");
l4 = new JLabel("REG NO :");
l5 = new JLabel("ADDRESS FOR PICKUP : ");
t1 = new JTextField(15);
t2 = new JTextField(15);
t3 = new JTextField(15);
t4 = new JTextField(15);
t5 = new JTextField(15);
l1.setForeground(Color.white);
l2.setForeground(Color.white);
l3.setForeground(Color.white);
l4.setForeground(Color.white);
l5.setForeground(Color.white);
b2.setBackground(Color.black);
b2.setForeground(Color.white);
b1.setBounds(550,650,100,40);
b2.setBounds(700,340,200,40);
l1.setBounds(300,270,100,40);
t1.setBounds(400,270,250,40);
l2.setBounds(165,340,400,40);
t2.setBounds(400,340,250,40);
l3.setBounds(330,410,100,40);
t3.setBounds(400,410,250,40);
l4.setBounds(325,480,100,40);
t4.setBounds(400,480,250,40);
l5.setBounds(220,550,300,40);
t5.setBounds(400,550,250,70);
l.setBounds(220,5,550,200);
f.add(l);
f.add(b1);
f.add(b2);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(l4);
f.add(t4);
f.add(l5);
f.add(t5);
b1.addActionListener(this);
b2.addActionListener(this);
b2.setOpaque(false);
b2.setBorderPainted(false);
f.setLayout(null);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setVisible(true);
}
public void actionPerformed(ActionEvent a)
{
String s = a.getActionCommand();
//String p = new String();
try
{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String username = "xe";
    String password = "xe";
    Connection con= DriverManager.getConnection(url, username, password);
Statement st = con.createStatement();
ResultSet r;
if(s.equals("OTHER DETAILS"))
{
model = t2.getText();
model=model.toUpperCase();
r = st.executeQuery("select brand from car where model='" + model + "'");
if(r.next())
{
String p=r.getString("brand");
t3.setText(p);
}
r = st.executeQuery("select regno from car where model='" + model + "'");
if(r.next())
{
String p=r.getString("regno");
t4.setText(p);
}
}
if(s.equals("RETURN"))
{
JOptionPane.showMessageDialog(null,"OUR AGENT WILL COME TO PICKUP THE CAR TO GIVEN ADDRESS");
JOptionPane.showMessageDialog(null,"THANK YOU FOR USING OUR SERVICE...\n               HAVE A NICE DAY...");
}
f.dispose();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
