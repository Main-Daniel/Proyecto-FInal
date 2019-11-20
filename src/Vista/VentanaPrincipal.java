package Vista;

import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	public tablero panel2;
	
	public VentanaPrincipal() {
		setTitle("Juego Serpientes y Escaleras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void inicializarVentana() {
		panel2 = new tablero();
		panel2.setBounds(10, 10, 600, 500);
		panel2.setBackground(Color.black);
		add(panel2);
		
	}
	
	
	

		

	
}
