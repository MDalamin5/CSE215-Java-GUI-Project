package others;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowInvoice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowInvoice frame = new ShowInvoice();
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
	public ShowInvoice() {
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
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 15));
		textPane.setBounds(0, 74, 684, 399);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InvoiceWindow iw = new InvoiceWindow();
				iw.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Nunito Medium", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(254, 222, 190));
		btnNewButton.setBounds(45, 21, 85, 27);
		contentPane.add(btnNewButton);
	}

}