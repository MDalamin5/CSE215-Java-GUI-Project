package menus;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import others.InvoiceWindow;
import source.BookCollection;

public class Sort extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sort frame = new Sort(null);
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
	public Sort(BookCollection B) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 239, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 78, 684, 265);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		textArea.setBackground(Color.CYAN);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setForeground(Color.DARK_GRAY);
		txtpnLogin.setEditable(false);
		txtpnLogin.setBackground(new Color(243, 239, 224));
		txtpnLogin.setFont(new Font("Nunito ExtraBold", Font.BOLD, 45));
		txtpnLogin.setText("Sort By");
		txtpnLogin.setBounds(250, 0, 186, 68);
		contentPane.add(txtpnLogin);
		
		JButton btnNewButton = new JButton("Year Of Publish");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B.sortByYearOfPublish();
				textArea.setText(B.toString());
			}
		});
		btnNewButton.setBackground(new Color(67, 66, 66));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton.setBounds(0, 341, 684, 47);
		contentPane.add(btnNewButton);
		
		JButton btnRemoveBook = new JButton("ISBN\r\n");
		btnRemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B.sortByIsbn();
				textArea.setText(B.toString());
			}
		});
		btnRemoveBook.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnRemoveBook.setForeground(Color.WHITE);
		btnRemoveBook.setBackground(new Color(34, 163, 159));
		btnRemoveBook.setBounds(0, 426, 684, 47);
		contentPane.add(btnRemoveBook);
		
		JButton btnBookInformation = new JButton("Price");
		btnBookInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B.sortByPrice();
				textArea.setText(B.toString());
			}
		});
		btnBookInformation.setForeground(Color.WHITE);
		btnBookInformation.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnBookInformation.setBackground(new Color(34, 34, 34));
		btnBookInformation.setBounds(0, 382, 684, 47);
		contentPane.add(btnBookInformation);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBooks ad = new AddBooks();
				ad.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Nunito Medium", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(254, 222, 190));
		btnNewButton_1.setBounds(0, 20, 85, 27);
		contentPane.add(btnNewButton_1);
	}

}