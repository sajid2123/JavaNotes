package interfazGrafica;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class PruebaJTextField extends JFrame {
	public PruebaJTextField() {
		setTitle("DATOS");
		setSize(300, 200);
		JLabel lbl1 = new JLabel("Nombre");
		JTextField txt1 = new JTextField(25);
		JLabel lbl2 = new JLabel("Edad");
		JTextField txt2 = new JTextField(25);
		JLabel lbl3 = new JLabel("Pwd");
		JTextField txt3 = new JPasswordField(25);
		JButton t=new JButton("Derecha");
		Container contentpane = getContentPane();
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.add(lbl1);
		panel.add(txt1);
		panel.add(lbl2);
		panel.add(txt2);
		panel.add(lbl3);
		panel.add(txt3);
		panel.add(new JButton("Click aquí"));
		panel.add(t);
		contentpane.add(panel);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new PruebaJTextField();
	}
}
