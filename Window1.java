package virtuall_classroom;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class Window1 {
	public static void main(String[] args) {
		showWindow();
	}

public static void showWindow() {
	JFrame frame = new JFrame("VIRTUAL CLASSROOM BY G SHASHI KUMAR REDDY");
	frame.getContentPane().setForeground(new Color(102, 205, 170));
	frame.getContentPane().setBackground(new Color(112, 128, 144));
	frame.setBounds(100,100,870,638);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	frame.setLocationRelativeTo(null); 
	
	JButton btnNewButton = new JButton("STUDENT");
	btnNewButton.setForeground(new Color(255, 255, 255));
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Student.main(null);
			
		}
	});
	btnNewButton.setBackground(new Color(255, 140, 0));
	btnNewButton.setBounds(94, 154, 275, 120);
	frame.getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("FACULTY");
	btnNewButton_1.setForeground(new Color(255, 255, 255));
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
	btnNewButton_1.setBackground(new Color(47, 79, 79));
	btnNewButton_1.setBounds(471, 154, 275, 120);
	frame.getContentPane().add(btnNewButton_1);
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
			Teacher.main(null);
		}
	});
	
	JButton btnNewButton_2 = new JButton("QUIZ");
	btnNewButton_2.setForeground(new Color(255, 255, 255));
	btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
	btnNewButton_2.setBackground(new Color(139, 0, 0));
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			OnlineTest.main(null);
			
			
		}
	});
	btnNewButton_2.setBounds(95, 346, 274, 120);
	frame.getContentPane().add(btnNewButton_2);
	
	JButton btnNewButton_3 = new JButton("EXIT");
	btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
	btnNewButton_3.setForeground(new Color(0, 0, 0));
	btnNewButton_3.setBackground(new Color(135, 206, 250));
	btnNewButton_3.setBounds(471, 346, 275, 120);
	frame.getContentPane().add(btnNewButton_3);
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}
	});
	
	JButton btnNewButton_4 = new JButton("VIRTUAL CLASSROOM");
	btnNewButton_4.setBackground(new Color(72, 61, 139));
	btnNewButton_4.setForeground(new Color(255, 255, 255));
	btnNewButton_4.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 33));
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Info.main(null);
			
		}
	});
	btnNewButton_4.setBounds(10, 10, 836, 108);
	frame.getContentPane().add(btnNewButton_4);
	
	JButton btnNewButton_5 = new JButton("Help");
	btnNewButton_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Help.main(null);
			
		}
	});
	btnNewButton_5.setBackground(new Color(240, 255, 240));
	btnNewButton_5.setBounds(761, 570, 85, 21);
	frame.getContentPane().add(btnNewButton_5);;
	frame.setVisible(true);
	}
}