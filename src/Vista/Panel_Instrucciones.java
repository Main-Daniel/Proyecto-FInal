package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Instrucciones extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton botonsiguiente;
	public JTextField texto;
	public JLabel etiqueta;

	public Panel_Instrucciones() {

		setLayout(null);

		inicializarComponentes();

		setVisible(true);

	}

	public void inicializarComponentes() {
		botonsiguiente = new JButton("SIGUIENTE");
		botonsiguiente.setBounds(220, 570, 130, 60);
		botonsiguiente.setBackground(Color.cyan);
		botonsiguiente.setFont(new Font("forte",Font.ROMAN_BASELINE,16));
		add(botonsiguiente);

		texto = new JTextField();
		texto.setBounds(20, 80,535,450);
		texto.setEnabled(false);
		add(texto);

		etiqueta = new JLabel("Como Jugar");
		etiqueta.setBounds(10, 10, 300, 50);
		etiqueta.setFont(new Font("forte",Font.ROMAN_BASELINE,40));
		etiqueta.setForeground(Color.orange);
		add(etiqueta);
	}

}