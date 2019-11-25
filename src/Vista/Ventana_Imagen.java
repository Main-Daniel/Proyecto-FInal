package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Imagen extends JFrame{
	
	public Ventana_Imagen() {

		setTitle("Instrucciones");
		setSize(600,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);


	}

}
