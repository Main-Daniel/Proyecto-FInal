package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Juego extends JFrame{

	public Tablero tablero;

	public Juego() {
	
		setTitle("Juego Serpientes y Escaleras");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}
	
	public void inicilizarVaribles() {
		tablero = new Tablero();
		tablero.setBackground(Color.GRAY);
		add(tablero);
	}

}