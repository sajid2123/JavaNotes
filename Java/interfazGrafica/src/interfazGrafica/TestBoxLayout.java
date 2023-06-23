package interfazGrafica;

import java.awt.*;
import javax.swing.*;
public class TestBoxLayout extends JFrame {
	public static void main(String[] args) {
		TestBoxLayout f = new TestBoxLayout();
		Container container = f.getContentPane();
		container.setLayout(new BoxLayout(container,BoxLayout.X_AXIS));//Orient. Horiz.
		((JPanel) container).setBorder(
				BorderFactory.createTitledBorder("Demo BoxLayout")); //Creamos un borde
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Panel1"));//Creamos un borde
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));//Orientac. vertical
		JPanel panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createTitledBorder("Panel2"));//Creamos un borde
	
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));//Orientac. vertical
		for (int i = 0; i < 3; i++) {
			panel1.add(new JButton("Botón número " + i));
			panel2.add(new JButton("Botón número " + i));
		}
		container.add(panel1);
		container.add(panel2);
		f.setSize(350, 300);
		f.setTitle("Demo BoxLayout");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
