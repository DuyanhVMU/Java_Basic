package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Random;
import java.awt.Color;

public class vidu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel resultLabel;
	private JLabel resultLabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vidu frame = new vidu();
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
	
	
	private void displayResult() {
		Random rand = new Random();
        int d1 = rand.nextInt(6) + 1;
        int d2 = rand.nextInt(6) + 1;
        int d3 = rand.nextInt(6) + 1;
		int total=d1+d2+d3;
		resultLabel.setText("Kết quả: "+d1+" - "+d2+" - "+d3);
		resultLabel_1.setText("Tổng: " + total);
        if (total == 3 || total == 18) {
            JOptionPane.showMessageDialog(this, "Nhà cái ăn hết, bạn đã thua");
        } else if(total>=4 && total<=10){
            JOptionPane.showMessageDialog(this, "Xỉu!");
        }
        else {
        	JOptionPane.showMessageDialog(this, "Tài!");
        }
    }
	public vidu() {
		super("Tài Xỉu FB88");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 10, 878, 459);
	    setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Tài");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnNewButton.setBounds(173, 274, 186, 57);
		contentPane.add(btnNewButton);
		
		JButton btnXu = new JButton("Xỉu");
		btnXu.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnXu.setBounds(502, 274, 186, 57);
		contentPane.add(btnXu);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		btnRoll.setBounds(333, 341, 186, 57);
		contentPane.add(btnRoll);
		
		resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		resultLabel.setBounds(300, 40, 270, 83);
		contentPane.add(resultLabel);
		
		resultLabel_1 = new JLabel("");
		resultLabel_1.setForeground(Color.DARK_GRAY);
		resultLabel_1.setBackground(Color.GRAY);
		resultLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		resultLabel_1.setBounds(300, 104, 270, 83);
		contentPane.add(resultLabel_1);
		btnRoll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayResult();
            }
        });
	}
}
