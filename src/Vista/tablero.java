package Vista;

import javax.swing.JPanel;

public class tablero extends JPanel {

	public int matriz[][];
	public int columnas; 
	public int filas;

	public tablero() {

		columnas = 20;
		filas = 5;
		matriz = new int[filas][columnas];
		
		setVisible(true); 
		imprimir();
		setLayout(null);

	}

	public void imprimir() {
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
			}
			
		}
		
		System.out.println();
	}
}