package Vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Tablero extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton boton[][];
	public int filas = 11;
	public int columnas = 9; 
		
	public Panel_Tablero() {
		
		setLayout(new GridLayout());
		cargarTablero();
		setVisible(true);
		
	}

	public void cargarTablero() {

		setLayout(new GridLayout(filas, columnas));

		boton = new JButton[filas][columnas];
		boton.clone();
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				boton[i][j] = new JButton();
				add(boton[i][j]);
			}
		}
		validate();
		repaint();
	}

}
