package Vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Juego_Tablero extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton boton[][];
	public int filas = 8;
	public int columnas = 8; 

	public Panel_Juego_Tablero() {

		setLayout(new FlowLayout());
		
		cargarTablero();
		
		setVisible(true);

	}

	public void cargarTablero() {

		setLayout(new GridLayout(filas,columnas));

		boton = new JButton[filas][columnas];
		boton.clone();
		int n = 1;


		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				boton[i][j] = new JButton("" + n++);
				boton[i][j].setOpaque(true);
				boton[i][j].setBackground(Color.ORANGE);
				boton[i][j].setEnabled(false);
				add(boton[i][j]);
				
			}
		}
		
		validate();
		repaint();

	}
	
}