package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
		this.setTitle("Tai xiu FB88");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		FlowLayout flow = new FlowLayout();
		JButton jb1 = new JButton("1");
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyWindow();
		
	}
}
