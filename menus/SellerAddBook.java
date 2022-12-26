package menus;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import source.Author;
import source.Book;
import source.Fiction;
import source.Invoice;

public class SellerAddBook extends JFrame {

	private JPanel contentPane;
	private Component frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellerAddBook frame = new SellerAddBook();
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
	public SellerAddBook() {
		
		Invoice invoice = new Invoice();
		Book[] bookArray = new Book[10000];
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(620, 107, 636, 543);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		textArea.setBackground(Color.CYAN);
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel = new JLabel("Add Book\r\n");
		lblNewLabel.setFont(new Font("Nunito Medium", Font.PLAIN, 35));
		lblNewLabel.setBounds(556, 10, 171, 65);
		contentPane.add(lblNewLabel);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
		textField.setBounds(34, 147, 268, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
		textField_1.setToolTipText("Name,Email,Age,Gender");
		textField_1.setColumns(10);
		textField_1.setBounds(34, 244, 268, 47);
		contentPane.add(textField_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(34, 341, 268, 47);
		contentPane.add(textField_2);
		
		JTextField textField_3 = new JTextField();
		textField_3.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(34, 438, 268, 47);
		contentPane.add(textField_3);
		
		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(312, 147, 268, 47);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Name\r\n");
		lblNewLabel_1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(34, 107, 163, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Writer");
		lblNewLabel_2.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(34, 204, 163, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Genre");
		lblNewLabel_3.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(34, 301, 163, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ISBN");
		lblNewLabel_4.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(34, 398, 163, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Year Of Publish");
		lblNewLabel_5.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(312, 107, 163, 30);
		contentPane.add(lblNewLabel_5);
		
		JTextField textField_5 = new JTextField();
		textField_5.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(312, 244, 268, 47);
		contentPane.add(textField_5);
		
		JTextField textField_6 = new JTextField();
		textField_6.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
		textField_6.setColumns(10);
		textField_6.setBounds(312, 341, 268, 47);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_6 = new JLabel("Price\r\n");
		lblNewLabel_6.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(312, 204, 163, 30);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Percentage Of Discount");
		lblNewLabel_7.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(312, 301, 211, 30);
		contentPane.add(lblNewLabel_7);
		
		
		JButton btnNewButton = new JButton("ADD !\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			//TODO : Needs Work
			public void actionPerformed(ActionEvent e) {
				
				int i=0;
				while (e.getSource() == btnNewButton ) {
					
				String name = textField.getText();  
			    String s = textField_1.getText();
			    String[] str = s.split(",");
			    String AuthorName = str[0];
			    String emailId = str[1];
			    int age = Integer.parseInt(str[2]);
			    String gender = str[3];
			    Author writer = new Author(AuthorName, emailId, age, gender);
			    String genre = textField_2.getText();
			    String isbn =textField_3.getText();
			    int yearOfPublish = Integer.parseInt(textField_4.getText());
			    double price = Double.parseDouble(textField_5.getText());
			    double percentageDiscount = Double.parseDouble(textField_6.getText());
				Book b = new Book(name, price, writer, percentageDiscount, new Fiction(genre), isbn, yearOfPublish);
				
				
				bookArray[i]  = b;
				invoice.addBook(bookArray[i]);
				i++;
				invoice.getBook();
				textArea.setText(invoice.toString());
				
				JOptionPane.showMessageDialog(frame,b.toString());
				break;
				}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 30));
		btnNewButton.setBounds(300, 501, 268, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu1 m1 = new Menu1();
				m1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Nunito Medium", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(254, 222, 190));
		btnNewButton_1.setBounds(0, 52, 85, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnCalculatePrice = new JButton("Calculate Price");
		btnCalculatePrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Price :"+invoice.calculatePrice());
			}
		});
		btnCalculatePrice.setForeground(Color.WHITE);
		btnCalculatePrice.setFont(new Font("Nunito Medium", Font.PLAIN, 30));
		btnCalculatePrice.setBackground(Color.BLUE);
		btnCalculatePrice.setBounds(34, 501, 268, 47);
		contentPane.add(btnCalculatePrice);
		
		JButton btnFinalPrice = new JButton("Final Price");
		btnFinalPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Final Price :"+invoice.getFinalPrice());
			}
		});
		btnFinalPrice.setForeground(Color.WHITE);
		btnFinalPrice.setFont(new Font("Nunito Medium", Font.PLAIN, 30));
		btnFinalPrice.setBackground(Color.BLUE);
		btnFinalPrice.setBounds(34, 546, 268, 47);
		contentPane.add(btnFinalPrice);
		
		JButton btnBookDiscountPrice = new JButton("Book Discount Price");
		btnBookDiscountPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("Final Price :"+invoice.calculateBookDiscountPrice());
			}
		});
		btnBookDiscountPrice.setForeground(Color.WHITE);
		btnBookDiscountPrice.setFont(new Font("Nunito Medium", Font.PLAIN, 30));
		btnBookDiscountPrice.setBackground(Color.BLUE);
		btnBookDiscountPrice.setBounds(300, 546, 268, 47);
		contentPane.add(btnBookDiscountPrice);
	}

}