import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

class Customer implements ActionListener
{
  JFrame f1,f2,f3;									//Disclaimer -> before this frame connect the main rent return frame
  JLabel l,l1,l2,l3,l4,l5,l6,l7,L6,a,r,br,mo,ra;
  JTextField t1,t2,t3,t4,t5,t6,b;
  JButton b1,b2,b3,b4,b5;
  
  Customer()
  {
    f1=new JFrame();//customer frame
    f1.setSize(1000,900);
    f2=new JFrame();//car deatils price frame
    f2.setSize(1300,900);
    f3=new JFrame();//available cars frame
    f3.setSize(1100,800);
    
    f1.setLocationRelativeTo(null);
    f2.setLocationRelativeTo(null);
   
   
    l=new JLabel(" Customer Details ",SwingConstants.CENTER);
    l.setFont(new Font("Serif", Font.PLAIN, 50));
    l.setForeground(Color.white);
    l6=new JLabel(" Car Details & Price ",SwingConstants.CENTER);         //the main headings in the 3 frames
    l6.setFont(new Font("TimesRoman", Font.PLAIN|Font.ITALIC, 60));
    l6.setForeground(Color.white);
    L6=new JLabel(" Available Cars ",SwingConstants.CENTER);
    L6.setFont(new Font("Arial", Font.PLAIN|Font.ITALIC, 50));
    L6.setForeground(Color.black);
    
    f1.setContentPane(new JLabel(new ImageIcon("mat.jpg")));
    f2.setContentPane(new JLabel(new ImageIcon("sprt.jpg")));             //the background imgs of the 3 frames
    f3.setContentPane(new JLabel(new ImageIcon("er.jpg")));
    
    l1=new JLabel("USERNAME : ");
    l2=new JLabel("NAME : ");
    l3=new JLabel("PHONE : ");		//frame 1 labels
    l4=new JLabel("ADDRESS : ");
    
    l5=new JLabel("CAR NAME : ");
    l7=new JLabel("NO OF DAYs : ");		//frame 2 labels
     a=new JLabel("TOTAL PRICE : ");
    
     r=new JLabel("REG NO");
    br=new JLabel("BRAND");
    mo=new JLabel("MODEL");
    ra=new JLabel("RATE/DAY");			//frame 3 labels
    
    t1= new JTextField(15);
    t2= new JTextField(15);	//frame1 txtflds
    t3= new JTextField(15);
    t4= new JTextField(15);
   
    t5= new JTextField(15);
    t6= new JTextField(10);	//frame2 txtflds
     b= new JTextField(15);
    
    b1 =new JButton(" SUBMIT ");	//frme1 button
    
    b2 =new JButton(" View Car ");
    b3 =new JButton(" NEXT>> ");		//frm2 buttons
    b4 =new JButton(" PAY ");
    
    b5 =new JButton(" BACK ");	//frme3 buttons
    
    b1.setFont(new Font("TimesRoman", Font.PLAIN|Font.ITALIC, 20));
    b1.setBackground(Color.black);
    b1.setForeground(Color.white);
    b1.setOpaque(true);
    b1.setBorderPainted(false);							//button styling and fonts
    b2.setFont(new Font("TimesRoman", Font.PLAIN|Font.ITALIC, 20));
    b2.setOpaque(true);
    b2.setBorderPainted(true);
    b3.setFont(new Font("Serif", Font.PLAIN|Font.ITALIC, 20));
    b3.setOpaque(true);
    b3.setBorderPainted(true);
    b4.setFont(new Font("Serif", Font.PLAIN|Font.ITALIC, 20));
    b4.setOpaque(true);
    b4.setBorderPainted(true);
    b5.setFont(new Font("Serif", Font.PLAIN|Font.ITALIC, 20));
    b5.setOpaque(true);
    b5.setBorderPainted(true);
    	
    	
 	
 	 l.setBounds(180,20,650,200);
 	 l6.setBounds(250,20,650,200);
 	 L6.setBounds(200,10,650,200);
 	
 	 l1.setForeground(Color.white);
 	 l2.setForeground(Color.white);
 	 l3.setForeground(Color.white);
 	 l4.setForeground(Color.white);
 	 l5.setForeground(Color.white);
 	 l7.setForeground(Color.white);
 	  a.setForeground(Color.white);
 	  a.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, 20));
 	  r.setForeground(Color.black);
 	 br.setForeground(Color.black);
 	 mo.setForeground(Color.black);
 	 ra.setForeground(Color.black);
 	
 	 l1.setBounds(290,240,100,40);
 	 t1.setBounds(390,240,250,40);
	 l2.setBounds(290,320,100,40);
 	 t2.setBounds(390,320,250,40);
 	 l3.setBounds(290,400,100,40);
 	 t3.setBounds(390,400,250,40);
 	 l4.setBounds(290,480,100,40);					//setbounds of each element in frame
 	 t4.setBounds(390,480,250,40); 
 	 b1.setBounds(415,545,200,50); 
 	 l5.setBounds(290,240,100,40);
 	 t5.setBounds(390,240,250,40);
         b2.setBounds(690,250,150,30);
 	 l7.setBounds(290,300,100,40);
 	 t6.setBounds(390,300,250,40);
 	 b3.setBounds(430,370,150,30);
 	  a.setBounds(170,430,230,50); 
 	 b.setBounds(320,430,200,40); 
 	 b4.setBounds(400,520,200,50);
 	 
 	 	r.setBounds(340,140,650,200);
 	  	br.setBounds(450,140,650,200);
 	   	mo.setBounds(580,140,650,200); 
 	  	ra.setBounds(740,140,650,200);
 	  	b5.setBounds(490,440,150,30);
 	  	
 	  f1.add(l);
 	  f1.add(l1);
 	  f1.add(t1);
 	  f1.add(l2);
 	  f1.add(t2);
 	  f1.add(l3);
 	  f1.add(t3);
 	  f1.add(l4);
 	  f1.add(t4);
 	  f1.add(b1);
 	  
 	  f2.add(l6);
 	  f2.add(l5);
 	  f2.add(t5);
 	  f2.add(b2);
 	  f2.add(l7);
 	  f2.add(t6);
 	  f2.add(b3);
 	  
 	  f3.add(L6);
 	  f3.add(r);
 	  f3.add(br);
 	  f3.add(mo);
 	  f3.add(ra);
 	  f3.add(b5);
 	  
 	t1.addActionListener(this);
 	b1.addActionListener(this);
  	b2.addActionListener(this); 
  	t6.addActionListener(this); 
  	b3.addActionListener(this);
  	b4.addActionListener(this); 
  	b5.addActionListener(this);
  	 
  	  f1.setLayout(null);
  	  f1.setVisible(true);
  	  f2.setVisible(false);
  	  f3.setVisible(false);
 	  f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	  f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 public void actionPerformed(ActionEvent e)
{
 //t1.setText("NAME");
 String s1=e.getActionCommand();
 String sq=new String();
 int rate;
 try
{
  Class.forName("org.postgresql.Driver");
  Connection con=DriverManager.getConnection("jdbc:postgresql://rogue.db.elephantsql.com:5432/umgkbxqj","umgkbxqj","JHnsOPCq9Z7EuXbw7YWOScKRhmPTAZMZ");
  Statement st=con.createStatement();
  ResultSet r;
  
 if(s1.equals(" SUBMIT "))
 {
 f1.dispose();
 f2.setVisible(true);
 }
 
 if(s1.equals(" View Car "))
 {
 f3.setVisible(true);
 JTable t=TableExample();
 t.setBounds(320,250,500,165);
 f3.add(t);
 }
 if(s1.equals(" BACK "))
 f3.dispose();
 
 
 if(s1.equals(" NEXT>> "))
 {
  
 String car=t5.getText().toUpperCase();
 int day=Integer.parseInt(t6.getText()); 
 r=st.executeQuery("SELECT RATE from CAR WHERE MODEL= '"+car+"';");
	 if(r.next())
	 {
	 rate=r.getInt("RATE");
 	rate=rate*day;
 	String s2=String.valueOf(rate);
       b.setText(s2);
 	f2.add(a);
 	f2.add(b);
 	f2.add(b4);
 	}
 	else
 	 JOptionPane.showMessageDialog(f2,"NO CAR FOUND","Alert",JOptionPane.WARNING_MESSAGE);
 	
 
  
 }
 if(s1.equals(" PAY "))
 JOptionPane.showMessageDialog(f2,"PAYMENT SUCCESSFUL","Alert",JOptionPane.WARNING_MESSAGE);   //when u press the ok in alert box go to the main return rent frame.....
 }
 catch(Exception j){
  System.out.println(j);
  }
}
 
 
 public static void main(String [] args)
 {
  new Customer();
 }
 
 JTable TableExample()
   {								//frame 3 jtable function..... dont skip
    
    		JTable table;
        //headers for the table
        String[] columns = new String[] 
        {
           "RegNo", "Brand", "Model", "Rate" 
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] 
        {
           {"KL001", "MARUTHI SUZUKI","SWIFT", 1000 },{"KL002", "TOYOTA", "INNOVA", 2000 },{"KL003", "HYUNDAI","i20", 1200 },
            {"KL004", "HYUNDAI", "i10", 1000 },
            {"KL005", "HYUNDAI","CRETA", 2000 },
            {"KL006", "TATA","TIAGO", 1000 },
            {"KL007", "TATA","ALTROZ", 1200  },
            {"KL008", "TATA", "HARRIER", 2000 },
            {"KL009", "FORD","ENDEAVOUR", 2500 },
            {"KL010", "HONDA", "AMAZE", 1500}
        };
         
        final Class[] columnClass = new Class[] 
        {
            String.class, String.class, String.class, Integer.class
        };
        //create table model with data
        DefaultTableModel model = new DefaultTableModel(data, columns) 
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            @Override
            public Class<?> getColumnClass(int columnIndex)
            {
                return columnClass[columnIndex];
            }
        };
         
       table = new JTable(model);
         
       
        return table;
    }
     
  }
    
