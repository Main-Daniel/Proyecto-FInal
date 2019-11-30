package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Juego extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panel_Juego_Tablero tablero;
	public Panel_Fondo fondotablero;
	public Panel_Dado dado;
	
	
	public Ventana_Juego() {
		
		setSize(950,700);
		setTitle("Juego Serpientes Y Escaleras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.cyan);
		setLayout(null);
		
		
		inicializarPaneles();
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarPaneles() {
		
		tablero = new Panel_Juego_Tablero();
		tablero.setBounds(10, 10, 640, 640);
		add(tablero);
		
		dado = new Panel_Dado();
		dado.setBounds(700,490,200,160);
		dado.setOpaque(true);
		dado.setBackground(Color.DARK_GRAY);
		add(dado);
		
	}
	
}