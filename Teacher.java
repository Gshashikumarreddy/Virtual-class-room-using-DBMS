package virtuall_classroom;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teacher {

		public static void main(String[] args) {
			showWindow();
		}

	public static void showWindow() {
		JFrame frame = new JFrame("VIRTUAL CLASSROOM BY G SHASHI KUMAR REDDY");
		frame.getContentPane().setForeground(new Color(102, 205, 170));
		frame.getContentPane().setBackground(new Color(189, 183, 107));
		frame.setBounds(100,100,870,457);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME FACULTY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(190, 53, 515, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SIGN_IN");
		btnNewButton.setBackground(new Color(255, 20, 147));
		btnNewButton.setForeground(new Color(255, 250, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Login.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(85, 215, 270, 63);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSignup = new JButton("SIGN_UP");
		btnSignup.setBackground(new Color(205, 92, 92));
		btnSignup.setForeground(new Color(255, 250, 250));
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SignUp.main(null);
			}
		});
		btnSignup.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSignup.setBounds(474, 215, 270, 63);
		frame.getContentPane().add(btnSignup);
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true);

	}
	}

