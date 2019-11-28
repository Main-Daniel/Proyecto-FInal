package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Numero_Jugadores extends JFrame{


	public Panel_Numero_Jugadores panel1;
	public panel_Boton panel2;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana_Numero_Jugadores() {
		
		setTitle("Jugadores");
		setSize(245,600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		inicializarVentana();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void inicializarVentana() {

		panel1 = new Panel_Numero_Jugadores();
		panel1.setBounds(10, 10, 220, 550);
		panel1.setBackground(Color.gray);
		add(panel1);

		panel2 = new panel_Boton();
		panel2.setBounds(10, 30, 180, 500);
		add(panel2);
	}

}