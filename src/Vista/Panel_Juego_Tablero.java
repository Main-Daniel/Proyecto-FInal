package Vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Juego_Tablero extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel boton[][];
	public int filas = 8;
	public int columnas = 8; 

	public Panel_Juego_Tablero() {

		setLayout(new FlowLayout());
		cargarTablero();
		setVisible(true);

	}

	public void cargarTablero() {

		setLayout(new GridLayout(filas,columnas));

		boton = new JLabel[filas][columnas];
		boton.clone();


		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				boton[i][j] = new JLabel("" + i + j);
				add(boton[i][j]);
			}
		}

		validate();
		repaint();

	}

}