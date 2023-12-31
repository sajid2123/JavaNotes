package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
public class TestBorderLayout extends JFrame{
	public static void main(String[] args) {
		TestBorderLayout frame = new TestBorderLayout ();
		Container panel = frame.getContentPane();
		JButton norte = new JButton("Norte");
		JButton sur = new JButton("Sur");
		JButton este = new JButton("Este");
		JButton oeste = new JButton("Oeste");
		JButton centro = new JButton("Centro");
		panel.add(norte, BorderLayout.NORTH);
		panel.add(sur, BorderLayout.SOUTH);
		panel.add(este, BorderLayout.EAST);
		panel.add(oeste, BorderLayout.WEST);
		panel.add(centro, BorderLayout.CENTER);
		frame.setSize(350, 250);
		frame.setTitle("Prueba de BorderLayoutLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

