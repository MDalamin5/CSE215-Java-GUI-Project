package login_page;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import menus.Menu1;
import others.InvoiceWindow;

import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class AdminLogWindow extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	protected Component frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogWindow frame = new AdminLogWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminLogWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 252, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setEditable(false);
		txtpnLogin.setBackground(new Color(255, 252, 0));
		txtpnLogin.setFont(new Font("Nunito ExtraBold", Font.BOLD, 45));
		txtpnLogin.setText("Admin");
		txtpnLogin.setBounds(266, 30, 166, 82);
		contentPane.add(txtpnLogin);
		
		JFormattedTextField frmtdtxtfldUsername = new JFormattedTextField();
		frmtdtxtfldUsername.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
		frmtdtxtfldUsername.setBackground(Color.WHITE);
		frmtdtxtfldUsername.setBounds(0, 163, 684, 45);
		contentPane.add(frmtdtxtfldUsername);
		
		JLabel lblNewLabel = new JLabel("UserID");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 123, 172, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(SystemColor.activeCaption);
		lblPassword.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		lblPassword.setBounds(0, 218, 172, 30);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
		passwordField.setBounds(0, 258, 684, 45);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				      File myObj = new File("D:\\Codes\\Eclipse_Java\\InventoryManagementAndBilling\\src\\login_page\\password.txt");
				      Scanner myReader = new Scanner(myObj);
				   
				      String userN = myReader.next();
				      String password = myReader.next();
				      //System.out.println(password);
				      //System.out.println(userN);
				      myReader.close();
				      //System.out.println(passwordField.getText());
				      if(frmtdtxtfldUsername.getText().equals(userN)  && passwordField.getText().equals(password)) {
				    	  Menu1 m1 = new Menu1();
				    	  m1.setVisible(true);
				    	  dispose();
				      }
				      else {
				    	  JOptionPane.showMessageDialog(frame, "Username or Password is Invalid");
				      }
				
				    } catch (FileNotFoundException e1) {
				      System.out.println("An error occurred.");
				      e1.printStackTrace();
				    }
				
			}
		});
		btnNewButton.setFont(new Font("Nunito SemiBold", Font.PLAIN, 30));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(0, 384, 684, 45);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmtdtxtfldUsername.setText(null);
				passwordField.setText(null);
				
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Nunito SemiBold", Font.PLAIN, 30));
		btnClear.setBackground(Color.RED);
		btnClear.setBounds(0, 428, 684, 45);
		contentPane.add(btnClear);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin al = new AdminLogin();
				al.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Nunito Medium", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(254, 222, 190));
		btnNewButton_1.setBounds(0, 52, 85, 27);
		contentPane.add(btnNewButton_1);
		
		
	}
}