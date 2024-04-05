package virtuall_classroom;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Help {
	static JLabel jLabel1;
	public static void main(String[] args) {
		show();
	}
	public static void show() {
		JFrame frame = new JFrame("Help");
		frame.getContentPane().setForeground(new Color(102, 205, 170));
		frame.getContentPane().setBackground(new Color(0, 100, 0));
		frame.setBounds(100,100,870,638);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reach us at gounishashi@gmail.com");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(277, 150, 277, 77);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contact number: 973216548");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(277, 275, 277, 77);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("-G SHASHI KUMAR REDDY");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(691, 514, 277, 77);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setVisible(true);
	}
}
