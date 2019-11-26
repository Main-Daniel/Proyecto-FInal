package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Juego extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panel_Tablero tablero;

	public Ventana_Juego() {
	
		setTitle("Juego Serpientes y Escaleras");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		inicializarPaneles();

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}
	
	public void inicializarPaneles() {
		
		tablero = new Panel_Tablero();
		tablero.setBackground(Color.GRAY);
		add(tablero);
		
	}

}