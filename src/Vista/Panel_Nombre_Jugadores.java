package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Nombre_Jugadores extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField nombre1, nombre2, nombre3, nombre4;	
	public JLabel etiqueta, etiqueta1, etiqueta2,
	etiqueta3, etiqueta4;
	public JButton b_aceptar;

	public Panel_Nombre_Jugadores() {

		setLayout(null);

		inicializarComponentes();

		setVisible(false);

	}

	public void inicializarComponentes() {

		etiqueta = new JLabel("¿Nombre de");
		etiqueta.setBounds(25, 5, 200, 50);
		etiqueta.setFont(new Font("forte",Font.ROMAN_BASELINE,34));
		add(etiqueta);

		etiqueta = new JLabel("Jugador?");
		etiqueta.setBounds(25, 20, 200, 80);
		etiqueta.setFont(new Font("forte",Font.ROMAN_BASELINE,34));
		add(etiqueta);

		etiqueta1 = new JLabel("Jugador 1:");
		etiqueta1.setBounds(25, 55, 200, 100);
		etiqueta1.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,28));
		etiqueta1.setForeground(Color.ORANGE);
		etiqueta1.setVisible(false);
		add(etiqueta1);

		nombre1 = new JTextField();
		nombre1.setBounds(30, 120, 200, 30);
		nombre1.setVisible(false);
		add(nombre1);

		etiqueta2 = new JLabel("Jugador 2:");
		etiqueta2.setBounds(25, 165, 200, 100);
		etiqueta2.setForeground(Color.ORANGE);
		etiqueta2.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,28));
		etiqueta2.setVisible(false);
		add(etiqueta2);

		nombre2 = new JTextField();
		nombre2.setBounds(30, 230, 200, 30);
		nombre2.setVisible(false);
		add(nombre2);

		etiqueta3 = new JLabel("Jugador 3:");
		etiqueta3.setBounds(25, 275, 200, 100);
		etiqueta3.setForeground(Color.ORANGE);
		etiqueta3.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,28));
		etiqueta3.setVisible(false);
		add(etiqueta3);

		nombre3 = new JTextField();
		nombre3.setBounds(30, 340, 200, 30);
		nombre3.setVisible(false);
		add(nombre3);

		etiqueta4 = new JLabel("Jugador 4:");
		etiqueta4.setBounds(25, 385, 200, 100);
		etiqueta4.setForeground(Color.ORANGE);
		etiqueta4.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,28));
		etiqueta4.setVisible(false);
		add(etiqueta4);

		nombre4 = new JTextField();
		nombre4.setBounds(30, 450, 200, 30);
		nombre4.setVisible(false);
		add(nombre4);

		b_aceptar = new JButton("Aceptar");
		b_aceptar.setBounds(70, 500, 100, 40);
		b_aceptar.setFont(new Font("forte",Font.ROMAN_BASELINE,14));
		add(b_aceptar);

	}

}

