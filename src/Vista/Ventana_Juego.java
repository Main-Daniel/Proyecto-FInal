package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Juego extends JFrame{

	public Panel_Tablero tablero;

	public Ventana_Juego() {
	
		setTitle("Juego Serpientes y Escaleras");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}
	
	public void inicilizarVaribles() {
		
		tablero = new Panel_Tablero();
		tablero.setBackground(Color.GRAY);
		add(tablero);
		
	}

}