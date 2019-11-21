package Vista;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaOpciones_NJugadores extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel etiqueta; 
	public JButton b; 
	
	public VentanaOpciones_NJugadores() {
		
		setLayout(new GridLayout (5,1));
		
		etiqueta = new JLabel("¿Cuantos van a jugar?");
		etiqueta.setFont(new Font("arial",Font.CENTER_BASELINE,20));
		add(etiqueta);
		
		b = new JButton("1");
		b.setFont(new Font("arial",Font.CENTER_BASELINE,40));
		add(b);
		
		b = new JButton("2");
		b.setFont(new Font("arial",Font.CENTER_BASELINE,40));
		add(b);
		
		b = new JButton("3");
		b.setFont(new Font("arial",Font.CENTER_BASELINE,40));
		add(b);
		
		b = new JButton("4");
		b.setFont(new Font("arial",Font.CENTER_BASELINE,40));
		add(b);
	
	}
	
	public JButton getB() {
		return b;
	}

}
