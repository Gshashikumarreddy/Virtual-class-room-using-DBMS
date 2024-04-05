package virtuall_classroom;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class content {
		public static void main(String[] args) {
			showWindow();
		}

	public static void showWindow() {
		JFrame frame = new JFrame("VIRTUAL CLASSROOM BY G SHASHI KUMAR REDDY");
		frame.getContentPane().setForeground(new Color(102, 205, 170));
		frame.getContentPane().setBackground(new Color(147, 112, 219));
		frame.setBounds(100,100,853,542);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Video");
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

        			if ((new File("C:\\Users\\Abhinav D\\Desktop\\my_pro\\pdf_t\\1.mp4")).exists()) {

        				Process p = Runtime
        				   .getRuntime()
        				   .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\Abhinav D\\Desktop\\my_pro\\pdf_t\\1.mp4");
        				p.waitFor();
        					
        			} else {

        				System.out.println("File is not exists");

        			}

        			System.out.println("Done");

        	  	  } catch (Exception ex) {
        			ex.printStackTrace();
        		  }
			}
		});
		btnNewButton.setBounds(75, 166, 287, 121);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPdf = new JButton("PDF");
		btnPdf.setBackground(new Color(255, 235, 205));
		btnPdf.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

        			if ((new File("C:\\Users\\Shashi\\Documents\\DBMS\\DBMS_M1_SN.pdf")).exists()) {

        				Process p = Runtime
        				   .getRuntime()
        				   .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\Shashi\\Documents\\DBMS\\DBMS_M1_SN.pdf");
        				p.waitFor();
        					
        			} else {

        				System.out.println("File is not exists");

        			}

        			System.out.println("Done");

        	  	  } catch (Exception ex) {
        			ex.printStackTrace();
        		  }
			}
		});
		btnPdf.setBounds(475, 166, 287, 121);
		frame.getContentPane().add(btnPdf);
		frame.setVisible(true);
	}}