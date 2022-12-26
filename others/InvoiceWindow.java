package others;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InvoiceWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvoiceWindow frame = new InvoiceWindow();
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
	public InvoiceWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 110, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Invoice");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Nunito Medium", Font.PLAIN, 35));
		lblNewLabel.setBounds(287, 10, 140, 54);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calculate Price\r\n");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton.setBounds(0, 426, 684, 47);
		contentPane.add(btnNewButton);
		
		JButton btnGenreDiscountPrice = new JButton("Genre Discount Price");
		btnGenreDiscountPrice.setForeground(Color.WHITE);
		btnGenreDiscountPrice.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnGenreDiscountPrice.setBackground(Color.MAGENTA);
		btnGenreDiscountPrice.setBounds(0, 381, 684, 47);
		contentPane.add(btnGenreDiscountPrice);
		
		JButton btnNewButton_1_1 = new JButton("Book Discount Price");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton_1_1.setBackground(Color.MAGENTA);
		btnNewButton_1_1.setBounds(0, 336, 684, 47);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Author Discount Price\r\n");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton_1_1_1.setBackground(Color.MAGENTA);
		btnNewButton_1_1_1.setBounds(0, 290, 684, 47);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Final Price");
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.setFont(new Font("Nunito Medium", Font.PLAIN, 25));
		btnNewButton_1_1_2.setBackground(Color.MAGENTA);
		btnNewButton_1_1_2.setBounds(0, 245, 684, 47);
		contentPane.add(btnNewButton_1_1_2);
		
		
	}

}