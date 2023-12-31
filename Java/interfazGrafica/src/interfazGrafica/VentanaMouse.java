package interfazGrafica;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class VentanaMouse extends JFrame{
	public VentanaMouse(){
		setTitle("Evento Mouse");
		setSize(new Dimension(250, 150));
		setLocationRelativeTo(null);
		final JPanel panel1=new JPanel();
		panel1.setBackground(Color.gray);
		final JButton boton =new JButton("Boton");
		boton.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				boton.setCursor(new Cursor(Cursor.MOVE_CURSOR));
			}
		});
		panel1.add(boton);
		panel1.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				panel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		this.add(panel1);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setVisible(true);
}
	public static void main(String[] args) {
		new VentanaMouse();
	}
}

