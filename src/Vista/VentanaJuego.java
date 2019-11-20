package Vista;

import java.awt.Color;
import javax.swing.JFrame;

public class VentanaJuego extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public tablero panel2;

	public VentanaJuego() {

		setSize(600,500);
		setTitle("Juego Serpientes y Escaleras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		this.setExtendedState(MAXIMIZED_BOTH);

		inicializarVentana();

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