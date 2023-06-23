package interfazGrafica;

import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaCombo extends JFrame {
	public PruebaCombo() {
		setTitle("Selector!!!");
		setSize(300, 200);
		String[] opciones = {"Arriba", "Abajo", "Derecha",
				"Izquierda", "Todas las direcciones"};
		JComboBox cmbLista = new JComboBox(opciones);
		JCheckBox checkbox=new JCheckBox("Check 1");

		Container contentpane = getContentPane();
		JPanel panel = new JPanel();
		panel.add(cmbLista);
		panel.add(checkbox);
		contentpane.add(panel);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PruebaCombo();
	}
}
