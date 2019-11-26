package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Juego extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panel_Tablero tablero;
	public Panel_Musica musica;

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
		tablero.setBounds(10, 10, 500, 540);
		tablero.setBackground(Color.GRAY);
		add(tablero);
		
		musica = new Panel_Musica();
		musica.setBounds(540, 10, 230, 80);
		add(musica);
		
	}

}