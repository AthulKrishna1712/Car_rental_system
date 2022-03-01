import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class carlogin implements ActionListener
{
String username,password;
JFrame f1,f2;
JButton b1,b2;
JLabel l,l1,l2;
JTextField t1;
JPasswordField p1;
carlogin()
{
f1 = new JFrame("CAR RENTAL SYSTEM LOGIN");
f1.setSize(1000,900);
f1.setLocationRelativeTo(null);
l=new JLabel("CAR RENTAL SYSTEM",SwingConstants.CENTER);    
l.setFont(new Font("San-Serif", Font.PLAIN, 50));
l.setForeground(Color.white);
f1.setContentPane(new JLabel(new ImageIcon("lambo.jpg")));
//f1.getContentPane().setBackground(Color.CYAN);
b1 = new JButton("LOGIN");
b2 = new JButton("REGISTER");
l1 = new JLabel("USERNAME : ");
l2 = new JLabel("PASSWORD : ");
t1 = new JTextField(15);
p1 = new JPasswordField(15);
l1.setForeground(Color.white);
l2.setForeground(Color.white);
b1.setBounds(300,440,100,40);
b2.setBounds(550,440,100,40);
l1.setBounds(300,290,100,40);
t1.setBounds(400,290,250,40);
l2.setBounds(300,360,100,40);
p1.setBounds(400,360,250,40);
l.setBounds(210,5,550,200);
f1.add(l);
f1.add(b1);
f1.add(b2);
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(p1);
b1.addActionListener(this);
b2.addActionListener(this);
f1.setLayout(null);
f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
f1.setVisible(true);
}
public void actionPerformed(ActionEvent a)
{
String s = a.getActionCommand();
String sql = new String();
Boolean b=true;
try
{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String username = "xe";
    String password = "xe";
    Connection con= DriverManager.getConnection(url, username, password);
Statement st = con.createStatement();
ResultSet r;
int p;
if(s.equals("LOGIN"))
{
username = t1.getText();
char[]pass= p1.getPassword();
password=new String(pass);
r = st.executeQuery("select password from log where username='" + username + "'");
if(r.next())
{
String pa = r.getString("PASSWORD");
pa = pa.trim();
if(password.equals(pa))
{
b = false;
}
}
if(b)
{
JOptionPane.showMessageDialog(null,"INVALID USERNAME OR PASSWORD...TRY AGAIN");
}
else
{
JOptionPane.showMessageDialog(null,"SUCCESSFULLY LOGGED IN");
new Pro1();
}
t1.setText("");
p1.setText("");
}
else if(s.equals("REGISTER"))
{
username = t1.getText();
char[]pass= p1.getPassword();
password=new String(pass);
r = st.executeQuery("select username from log where username='" + username + "'");
if(r.next())
{
b=false;
}
if(b)
{
sql ="insert into log values('"+ username +"','"+password+"');";
p = st.executeUpdate(sql);
new Pro1();
JOptionPane.showMessageDialog(null,"SUCCESSFULLY REGISTERED AND LOGGED IN");
}
else
{
JOptionPane.showMessageDialog(null,"THIS USERNAME IS ALREADY REGISTERED...TRY ANOTHER");
}
t1.setText("");
p1.setText("");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
