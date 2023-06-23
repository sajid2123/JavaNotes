package interfazGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class EjemploFlowLayout extends JFrame{
	public static void main(String[] args) {
		EjemploFlowLayout frame = new EjemploFlowLayout();
		JPanel panel = new JPanel();
		JButton boton1 = new JButton("botón 1");
		JButton boton2 = new JButton("Este es el botón 2");
		JButton boton3 = new JButton("botón 3");
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		frame.setContentPane(panel);
		frame.setSize(400, 150);
		frame.setTitle("Prueba de FlowLayout");
		//Operacion al pulsar la X
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
}
}
