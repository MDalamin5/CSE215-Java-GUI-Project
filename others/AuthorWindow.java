package others;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class AuthorWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthorWindow frame = new AuthorWindow();
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
	public AuthorWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Author");
		lblNewLabel.setFont(new Font("Nunito Medium", Font.PLAIN, 35));
		lblNewLabel.setBounds(565, 10, 133, 65);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(106, 188, 390, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 325, 390, 53);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 449, 390, 53);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(106, 586, 390, 53);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Name\r\n");
		lblNewLabel_1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(106, 136, 232, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email ID");
		lblNewLabel_1_1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(106, 276, 232, 39);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Age\r\n");
		lblNewLabel_1_1_1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(106, 400, 232, 39);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(106, 537, 232, 39);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setFont(new Font("Nunito Medium", Font.PLAIN, 20));
		textPane.setBounds(574, 188, 654, 314);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("ADD !");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton.setBounds(574, 581, 124, 53);
		contentPane.add(btnNewButton);
		
		JButton btnShowAuthor = new JButton("Show Author");
		btnShowAuthor.setForeground(Color.WHITE);
		btnShowAuthor.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnShowAuthor.setBackground(Color.BLUE);
		btnShowAuthor.setBounds(1021, 581, 207, 53);
		contentPane.add(btnShowAuthor);
		
		

	}

}