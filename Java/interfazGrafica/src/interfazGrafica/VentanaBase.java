package interfazGrafica;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class VentanaBase extends JFrame {
	public VentanaBase() {
		setTitle("Evento WindowClosing");
		setSize(new Dimension(300, 200));
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null,"El programa"
						+ " finalizara cuando pulse Aceptar");
				System.exit(0);
			}
		});

		/*codigo JButton*/
		JPanel panel = new JPanel();
		JButton salir = new JButton("Salir");
		panel.add(salir);
		this.setContentPane(panel);
		salir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int opc=JOptionPane.showConfirmDialog(null,"Esta "
						+ "seguro de cerrar la Ventana");
				if(opc==0){
					System.exit(0);
				}
			}
		});
	}
	public static void main(String[] args) {
		new VentanaBase().setVisible(true);
}
}