package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaOpciones extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public VentanaOpciones_NJugadores njugadores;
	
	public VentanaOpciones() {
		setTitle("Opciones");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		inicializarVentana();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarVentana() {
		
		njugadores = new VentanaOpciones_NJugadores();
		njugadores.setBounds(10, 10, 220, 450);
		njugadores.setBackground(Color.gray);
		add(njugadores);
		
	}

}
