package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Jugador2 extends JFrame{

	public Panel_Imagenes panel1;
	public Panel_Colores panel2;
	public Panel_Imagen2 panel3;
	public Panel_Colores panel4;
	
	
	public Jugador2() {
		
		setTitle("Jugadores");
		setSize(800,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		inicializarVentana();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void inicializarVentana() {

		panel1 = new Panel_Imagenes();
		panel1.setBounds(10, 10, 220, 500);
		add(panel1);

		panel2 = new Panel_Colores();
		panel2.setBounds(190, 10, 190, 350);
		panel2.setBackground(Color.GRAY);
		add(panel2);


		panel3 = new Panel_Imagen2();
		panel3.setBounds(350, 10, 220, 500);
		add(panel3);

		panel4 = new Panel_Colores();
		panel4.setBounds(540, 10, 240, 350);
		panel4.setBackground(Color.GRAY);
		add(panel4);

	}
	
}
