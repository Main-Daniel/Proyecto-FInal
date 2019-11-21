package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaOpciones extends JFrame{

	
	public Panel_Opción1 opcion;
	public Panel_Opcion2 opcion2;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public VentanaOpciones_NJugadores njugadores;

	
	public VentanaOpciones() {
		setTitle("Jugadores");
		setSize(505,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		inicializarVentana();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	public void inicializarVentana() {

		opcion = new Panel_Opción1();
		opcion.setBounds(10, 10, 220, 550);
		opcion.setBackground(Color.gray);
		add(opcion);
		
		opcion2 = new Panel_Opcion2();
		opcion2.setBounds(240, 10, 250, 550);
		opcion2.setBackground(Color.GRAY);
		add(opcion2);
	
		njugadores = new VentanaOpciones_NJugadores();
		njugadores.setBounds(10, 10, 220, 450);
		njugadores.setBackground(Color.gray);
		add(njugadores);
		
	}

}
