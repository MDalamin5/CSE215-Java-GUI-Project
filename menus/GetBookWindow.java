package menus;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import source.Book;
import source.BookCollection;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class GetBookWindow extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetBookWindow frame = new GetBookWindow(null);
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
	public GetBookWindow(BookCollection B) {
		Book[] book = B.getBookCollection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 68, 738, 605);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 15));
		textArea.setBackground(Color.CYAN);
		
		JLabel lblNewLabel = new JLabel("Books");
		lblNewLabel.setFont(new Font("Nunito Medium", Font.PLAIN, 35));
		lblNewLabel.setBounds(276, 0, 108, 58);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBooks ab = new AddBooks();
				ab.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Nunito Medium", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(254, 222, 190));
		btnNewButton_1.setBounds(0, 23, 85, 27);
		contentPane.add(btnNewButton_1);
		
		
		for (int i = 0; i < B.getNumberOfBooks(); i++) {
			textArea.append("\n"+book[i].toString()+"\n");
		}
		
		
		
	}
}