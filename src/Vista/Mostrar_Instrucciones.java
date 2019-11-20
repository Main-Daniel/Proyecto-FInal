package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mostrar_Instrucciones extends JPanel {
	
	public JButton siguiente;
	public JTextField texto;
	public JLabel etiqueta;

	public Mostrar_Instrucciones() {
		
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		siguiente = new JButton("SIGUIENTE");
		siguiente.setBounds(220, 570, 130, 60);
		siguiente.setBackground(Color.cyan);
		siguiente.setFont(new Font("forte",Font.ROMAN_BASELINE,16));
		add(siguiente);
		
		texto = new JTextField();
		texto.setBounds(20, 80,535,450);
		texto.setEnabled(false);
		add(texto);
		
		etiqueta = new JLabel("¿Cómo Jugar?");
		etiqueta.setBounds(10, 10, 300, 50);
		etiqueta.setFont(new Font("forte",Font.ROMAN_BASELINE,40));
		etiqueta.setForeground(Color.orange);
		add(etiqueta);
		
	}
	
}
