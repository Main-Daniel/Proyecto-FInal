package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana_Juego extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Panel_Juego_Tablero tablero;
	public Panel_Dado dados;
	public JButton lanzar;
	

	
	
	public Ventana_Juego() {
		
		setSize(950,700);
		setTitle("Juego Serpientes Y Escaleras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.cyan);
		setLayout(null);
		
		
		inicializarPaneles();
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarPaneles() {
		
		tablero = new Panel_Juego_Tablero();
		tablero.setBounds(10, 10, 500, 540);
		add(tablero);
		
		dados = new Panel_Dado();
		dados.setBounds(520, 400, 250, 300);
		add(dados);
		
		lanzar = new JButton("Tirar Dado");
		lanzar.setBounds(570,350,150,40);
		add(lanzar);
	

    
}
	
	}

