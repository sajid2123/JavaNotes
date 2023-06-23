package interfazGrafica;

import javax.swing.*;
import java.awt.*;
public class TestGridLayout extends JFrame{
	public static void main(String[] args) {
		TestGridLayout frame = new TestGridLayout();
		Container container = frame.getContentPane();
		int X = 3;
		int Y = 3;
		container.setLayout(new GridLayout(X, Y));
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				container.add(new JButton(i + "x" + j));
			}

		}
		frame.setSize(350, 250);
		frame.setTitle("Prueba de BorderLayoutLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
