package interfazGrafica;

import javax.swing.*;

public class EjemploJDialog extends JFrame{
	
	public EjemploJDialog() {
		setTitle("Ejemplo venta con dialog enfrente");
		setSize(300,200);
		setVisible(true);
		JDialog cuadroDialog = new JDialog(this,true);
		cuadroDialog.setSize(100,100);
		cuadroDialog.setVisible(true);
		
	}
	public static void main(String []args) {
		new EjemploJDialog();
	}
}
