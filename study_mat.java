package virtuall_classroom;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

import virtuall_classroom.ChatClient;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class study_mat {
	public static void main(String[] args) {
		showWindow();
	}

public static void showWindow() {
	JFrame frame = new JFrame("VIRTUAL CLASSROOM BY G SHASHI KUMAR REDDY");
	frame.getContentPane().setForeground(new Color(102, 205, 170));
	frame.getContentPane().setBackground(new Color(240, 128, 128));
	frame.setBounds(100,100,870,638);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Reference Materials");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
	lblNewLabel.setBounds(234, 24, 432, 65);
	frame.getContentPane().add(lblNewLabel);
	
	JButton btnNewButton = new JButton("Doubt corner");
	btnNewButton.setForeground(new Color(255, 255, 255));
	btnNewButton.setBackground(new Color(255, 0, 0));
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ChatClient.main(null);
		}
	});
	btnNewButton.setBounds(615, 523, 190, 38);
	frame.getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Module 1");
	btnNewButton_1.setForeground(new Color(255, 250, 250));
	btnNewButton_1.setBackground(new Color(153, 50, 204));
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			content.main(null);
		}
	});
	btnNewButton_1.setBounds(53, 145, 272, 65);
	frame.getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_1_1 = new JButton("Module 2");
	btnNewButton_1_1.setBackground(new Color(160, 82, 45));
	btnNewButton_1_1.setForeground(new Color(255, 250, 250));
	btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
	btnNewButton_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			content.main(null);
		}
	});
	btnNewButton_1_1.setBounds(533, 145, 272, 65);
	frame.getContentPane().add(btnNewButton_1_1);
	
	JButton btnNewButton_1_2 = new JButton("Module 3");
	btnNewButton_1_2.setBackground(new Color(72, 61, 139));
	btnNewButton_1_2.setForeground(new Color(255, 250, 250));
	btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
	btnNewButton_1_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			content.main(null);
		}
	});
	btnNewButton_1_2.setBounds(53, 316, 272, 65);
	frame.getContentPane().add(btnNewButton_1_2);
	
	JButton btnNewButton_1_3 = new JButton("Module 4");
	btnNewButton_1_3.setBackground(new Color(0, 0, 128));
	btnNewButton_1_3.setForeground(new Color(255, 250, 250));
	btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 28));
	btnNewButton_1_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			content.main(null);
		}
	});
	btnNewButton_1_3.setBounds(533, 316, 272, 65);
	frame.getContentPane().add(btnNewButton_1_3);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);

}
}
