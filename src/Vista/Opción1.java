package Vista;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Opción1 extends JPanel{
	
	public JLabel etiqueta; 
	public JButton b; 
	
	public Opción1() {
		
		setLayout(new GridLayout (4,5));
		
		b = new JButton("1");
		add(b);
		
		b = new JButton("2");
		add(b);
		
		b = new JButton("3");
		add(b);
		
		b = new JButton("4");
		add(b);
		
		etiqueta = new JLabel("¿Cuantos van a jugar?");
		etiqueta.setBounds(10, 10, 100, 200);
		add(etiqueta);
	
	}
	
	public JButton getB() {
		return b;
	}

}
