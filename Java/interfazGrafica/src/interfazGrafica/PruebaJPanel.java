package interfazGrafica;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class PruebaJPanel extends JFrame {
	public PruebaJPanel(){
		setTitle("Hola!!!");
		setSize(300,200);
		//Le pido al JFrame su objeto contenedor
		Container contentpane = getContentPane();
		//Creo un objeto de tipo JPanel
		JPanel panel = new JPanel();
		//Añado el panel en el objeto contenedor del frame
		contentpane.add(panel);
		//Pongo el color de fondo del panel de color rojo
		panel.setBackground(Color.blue);
		panel.add(new JButton("Click aquí"));
		setVisible(true);
	}
public static void main(String[] args) {
	new PruebaJPanel();
}
}