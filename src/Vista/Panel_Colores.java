package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Colores extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton botonselec;
	public JButton color1; 
	public JButton color2; 
	public JButton color3; 
	public JButton color4; 
	public JLabel nombre;
	public Ventana_Numero_Jugadores panel3;

	
	
	public Panel_Colores() {
		
		setLayout(null);
		
		inicializarComponentes();
		
		setVisible(true);
		
	}

	public void inicializarComponentes() {
		
		nombre = new JLabel("Jugador 1 Color: ");
		nombre.setBounds(40, 30, 120, 60);
		add(nombre);
		
		color1 = new JButton("Azul");
		color1.setBounds(50, 70, 100, 40);
		color1.setBackground(Color.cyan);
		add(color1);
		
		color2 = new JButton("Rojo");
		color2.setBounds(50, 120,100,40);
		color2.setBackground(Color.red);
		add(color2);
		
		color3 = new JButton("Verde");
		color3.setBounds(50,170,100,40);
		color3.setBackground(Color.green);
		add(color3);
		
		color4 = new JButton("Amarillo");
		color4.setBounds(50,220,100,40);
		color4.setBackground(Color.yellow);
		add(color4);
		
		botonselec = new JButton("SELECCIONAR");
		botonselec.setBounds(60, 300, 110, 40);
		add(botonselec);
		
	}

}
