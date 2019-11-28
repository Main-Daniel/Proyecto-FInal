package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Jugador extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panel_ColorFicha panel1, panel3;
	public Panel_ImagenFicha panel2, panel4;


	public Ventana_Jugador(String jugador1, String jugador2) {

		setTitle("Jugador 1 y Jugador 2");
		setSize(820,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		inicializarPanel(jugador1, jugador2);

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void inicializarPanel(String jugador1, String jugador2) {
		
		panel1 = new Panel_ColorFicha(jugador1);
		panel1.setBounds(10, 240, 350, 80);
		panel1.setBackground(Color.gray);
		getContentPane().add(panel1);
		
		panel2 = new Panel_ImagenFicha();
		panel2.setBounds(10, 10, 350, 200);
		add(panel2);
		
		panel3 = new Panel_ColorFicha(jugador2);
		panel3.setBounds(450, 240, 350, 80);
		panel3.setBackground(Color.gray);
		getContentPane().add(panel3);
		add(panel3);
		
		panel4 = new Panel_ImagenFicha();
		panel4.setBounds(450, 10, 350, 200);
		add(panel4);

	}

}