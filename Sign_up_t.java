package virtuall_classroom;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Sign_up_t extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField tf1, tf2, tf5, tf6, tf7;
    JButton btn1, btn2;
    JPasswordField p1, p2;

    // JDBC connection parameters
    String jdbcUrl = "jdbc:mysql://localhost:3306/shashi";
    String jdbcUser = "root";
    String jdbcPassword = "TS06en1899@";
    void addData(String usr, String pswd, String mail, String con, String state, String Phn) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the MySQL database
            try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword)) {
                // Prepare the SQL statement
                String sql = "INSERT INTO users (username, password, email, country, state, phone) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, usr);
                    preparedStatement.setString(2, pswd);
                    preparedStatement.setString(3, mail);
                    preparedStatement.setString(4, con);
                    preparedStatement.setString(5, state);
                    preparedStatement.setString(6, Phn);

                    // Execute the SQL statement
                    preparedStatement.executeUpdate();

                    JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");
                    dispose();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(btn1, "Error saving data to the database");
        }
    }
   

    Sign_up_t() {
    	getContentPane().setBackground(new Color(32, 178, 170));  
        setVisible(true);  
        setSize(627, 559); 
        getContentPane().setLayout(null); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        setTitle("Registration Form in Java");  
        l1 = new JLabel("Sign_Up");  
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Name:");  
        l2.setFont(new Font("Tahoma", Font.BOLD, 10));
        l3 = new JLabel("Email-ID:");  
        l3.setFont(new Font("Tahoma", Font.BOLD, 10));
        l4 = new JLabel("Create Passowrd:");  
        l4.setFont(new Font("Tahoma", Font.BOLD, 10));
        l5 = new JLabel("Confirm Password:");  
        l5.setFont(new Font("Tahoma", Font.BOLD, 10));
        l6 = new JLabel("Country:");  
        l6.setFont(new Font("Tahoma", Font.BOLD, 10));
        l7 = new JLabel("State:");  
        l7.setFont(new Font("Tahoma", Font.BOLD, 10));
        l8 = new JLabel("Phone No:");   
        l8.setFont(new Font("Tahoma", Font.BOLD, 10));
        tf1 = new JTextField();  
        tf2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();  
        tf5 = new JTextField();  
        tf6 = new JTextField();  
        tf7 = new JTextField();  
        btn1 = new JButton("Submit");  
        btn1.setBackground(new Color(128, 0, 0));
        btn1.setForeground(new Color(255, 255, 255));
        btn2 = new JButton("Clear");  
        btn2.setBackground(new Color(95, 158, 160));
        btn2.setForeground(new Color(255, 255, 255));  
        l1.setBounds(25, 10, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        l6.setBounds(80, 230, 200, 30);  
        l7.setBounds(80, 270, 200, 30);  
        l8.setBounds(80, 310, 200, 30);  
        tf1.setBounds(300, 70, 200, 30);  
        tf2.setBounds(300, 110, 200, 30);  
        p1.setBounds(300, 150, 200, 30);  
        p2.setBounds(300, 190, 200, 30);  
        tf5.setBounds(300, 230, 200, 30);  
        tf6.setBounds(300, 270, 200, 30);  
        tf7.setBounds(300, 310, 200, 30);  
        btn1.setBounds(400, 416, 100, 30);  
        btn2.setBounds(80, 416, 100, 30);  
        getContentPane().add(l1);  
        getContentPane().add(l2);  
        getContentPane().add(tf1);  
        getContentPane().add(l3);  
        getContentPane().add(tf2);  
        getContentPane().add(l4);  
        getContentPane().add(p1);  
        getContentPane().add(l5);  
        getContentPane().add(p2);  
        getContentPane().add(l6);  
        getContentPane().add(tf5);  
        getContentPane().add(l7);  
        getContentPane().add(tf6);  
        getContentPane().add(l8);  
        getContentPane().add(tf7);  
        getContentPane().add(btn1);  
        getContentPane().add(btn2); 

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == btn1)  
        {  
           String s1 = tf1.getText();  
           String s2 = tf2.getText();  
           char[] s3 = p1.getPassword();  
           char[] s4 = p2.getPassword();   
           String s8 = new String(s3);  
           String s9 = new String(s4);  
           String s5 = tf5.getText();  
           String s6 = tf6.getText();  
           String s7 = tf7.getText();  
           if (s8.equals(s9))  
           {  
               try  
               {  
                  addData(s1,s8,s2,s5,s6,s7);
                      
                    
                       JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");   
                       dispose();
               }  
               catch (Exception ex)   
               {  
                   System.out.println(ex);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(btn1, "Password Does Not Match");  
           }   
         }   
         else  
         {  
           tf1.setText("");  
           tf2.setText("");  
           p1.setText("");  
           p2.setText("");  
           tf5.setText("");  
           tf6.setText("");  
           tf7.setText("");  
         }  
    }

    public static void main(String args[]) {
        new Sign_up_t();
    }
}
