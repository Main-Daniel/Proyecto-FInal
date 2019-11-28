package Vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Tablero extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel boton[][];
	public int filas = 10;
	public int columnas = 10; 
	

	public Panel_Tablero() {
		
		setLayout(new FlowLayout());
		cargarTablero();
		setVisible(true);
		
	}

	public void cargarTablero() {

		setLayout(new GridLayout(filas,columnas));

		boton = new JLabel [filas][columnas];
		boton.clone();

				
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				boton[i][j] = new JLabel("1");
				
				add(boton[i][j]);
			}
		}
		validate();
		repaint();
		
	}

}