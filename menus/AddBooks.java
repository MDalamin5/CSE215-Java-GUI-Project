package menus;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import others.InvoiceWindow;
import others.ShowInvoice;
import source.Author;
import source.BookCollection;
import source.Fiction;
import source.Book;
import source.Genre;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class AddBooks extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton;
	protected Component frame;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBooks frame = new AddBooks();
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
	public AddBooks() {
		
		Book[] bookArray = new Book[10000];
		BookCollection bc = new BookCollection();
		
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
		
		textField = new JTextField();
		textField.setBounds(34, 147, 268, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(34, 244, 268, 47);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(34, 341, 268, 47);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(34, 438, 268, 47);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(312, 147, 268, 47);
		contentPane.add(textField_4);
		
		lblNewLabel_1 = new JLabel("Name\r\n");
		lblNewLabel_1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(34, 107, 163, 30);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Writer");
		lblNewLabel_2.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(34, 204, 163, 30);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Genre");
		lblNewLabel_3.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(34, 301, 163, 30);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("ISBN");
		lblNewLabel_4.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(34, 398, 163, 30);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Year Of Publish");
		lblNewLabel_5.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(312, 107, 163, 30);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(312, 244, 268, 47);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(312, 341, 268, 47);
		contentPane.add(textField_6);
		
		lblNewLabel_6 = new JLabel("Price\r\n");
		lblNewLabel_6.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(312, 204, 163, 30);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Percentage Of Discount");
		lblNewLabel_7.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(312, 301, 211, 30);
		contentPane.add(lblNewLabel_7);
		
		
		btnNewButton = new JButton("ADD !\r\n");
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
				bc.addBook(bookArray[i]);
				i++;
				bc.getBookCollection();
				textArea.setText(bc.toString());
				JOptionPane.showMessageDialog(frame,b.toString());
				break;
				}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 30));
		btnNewButton.setBounds(34, 513, 268, 47);
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
		
		JButton btnNewButton_1_2 = new JButton("Get Book\r\n");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetBookWindow gbw = new GetBookWindow(bc);
				gbw.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton_1_2.setBackground(new Color(252, 222, 192));
		btnNewButton_1_2.setBounds(34, 559, 268, 47);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnRemoveBook = new JButton("Reset Books\r\n");
		btnRemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bc.resetBooks();
				textArea.setText(bc.toString());
			}
		});
		btnRemoveBook.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnRemoveBook.setForeground(Color.WHITE);
		btnRemoveBook.setBackground(new Color(121, 135, 119));
		btnRemoveBook.setBounds(300, 559, 259, 47);
		contentPane.add(btnRemoveBook);
		
		JButton btnNewButton_1_2_1 = new JButton("Remove Book\r\n");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(textField_7.getText());
				bc.removeBook(i);
				textArea.setText(bc.toString());
			}
		});
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton_1_2_1.setBackground(new Color(162, 178, 159));
		btnNewButton_1_2_1.setBounds(300, 514, 259, 47);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton = new JButton("Sort Books");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sort sort = new Sort(bc);
				sort.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(229, 178, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton.setBounds(34, 603, 268, 47);
		contentPane.add(btnNewButton);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(312, 438, 259, 47);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_4_1 = new JLabel("Remove Index");
		lblNewLabel_4_1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(312, 398, 163, 30);
		contentPane.add(lblNewLabel_4_1);
		
		
		
	}
}