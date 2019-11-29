package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Juego extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panel_Juego_Tablero panel1;
	public Panel_Dado dado;
	
	
	public Ventana_Juego() {
		
		setSize(950,700);
		setTitle("Juego Serpientes Y Escaleras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.cyan);
		setLayout(null);
		
		
		inicializarPaneles();
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarPaneles() {
		
		panel1 = new Panel_Juego_Tablero();
		panel1.setBounds(10, 10, 640, 640);
		add(panel1);
		
		dado = new Panel_Dado();
		dado.setBounds(700,450,200,250);
		add(dado);
		
	}
	
}
