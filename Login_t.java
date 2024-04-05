package virtuall_classroom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_t extends JFrame implements ActionListener {

    JLabel l1, l2, l3;

    JTextField tf1;

    JButton btn1;

    JPasswordField p1;


    void logic(String usr, String pswd) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set your MySQL database connection details
            String jdbcUrl = "jdbc:mysql://localhost:3306/shashi";
            String jdbcUser = "root";
            String jdbcPassword = "TS06en1899@";

            // Connect to the MySQL database
            try (Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword)) {
                // Query the database for login information
                String query = "SELECT * FROM users WHERE username = ? AND password = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, usr);
                    preparedStatement.setString(2, pswd);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successfully!!");
                        dispose();
                        study_mat.main(null);
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect username/password");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database");
        }
    }

    Login_t() {
        getContentPane().setBackground(new Color(210, 180, 140));

        setTitle("VIRTUAL CLASSROOM BY G SHASHI KUMAR REDDY");

        setVisible(true);

        setSize(690, 351);

        getContentPane().setLayout(null);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        l1 = new JLabel("Sign_In");

        l1.setForeground(Color.blue);

        l1.setFont(new Font("Serif", Font.BOLD, 20));

        l2 = new JLabel("Enter Email:");
        l2.setFont(new Font("Tahoma", Font.BOLD, 10));

        l3 = new JLabel("Enter Password:");
        l3.setFont(new Font("Tahoma", Font.BOLD, 10));

        tf1 = new JTextField();

        p1 = new JPasswordField();

        btn1 = new JButton("Submit");
        btn1.setForeground(new Color(255, 255, 255));
        btn1.setBackground(new Color(210, 105, 30));

        l1.setBounds(20, 10, 400, 30);

        l2.setBounds(80, 70, 200, 30);

        l3.setBounds(80, 110, 200, 30);

        tf1.setBounds(300, 70, 200, 30);

        p1.setBounds(300, 110, 200, 30);

        btn1.setBounds(400, 195, 100, 30);

        getContentPane().add(l1);

        getContentPane().add(l2);

        getContentPane().add(tf1);

        getContentPane().add(l3);

        getContentPane().add(p1);

        getContentPane().add(btn1);

        btn1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        showData();
    }

    public void showData() {
        String str1 = tf1.getText();
        char[] p = p1.getPassword();
        String str2 = new String(p);

        try {
            logic(str1, str2);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String arr[]) {
        new Login_t();
    }
}
