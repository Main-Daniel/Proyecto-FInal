package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Imagen3 extends JFrame {
	
	public Panelcolor3 panel1;
	public panelimagen3 panel2;
	
	
	public Ventana_Imagen3() {

		setTitle("Informaci�n Jugador 3");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);
		
		inicializarPanel();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);


	}
	
	public void inicializarPanel() {
		panel1 = new Panelcolor3();
		panel1.setBounds(200, 10, 185, 350);
		panel1.setBackground(Color.gray);
		getContentPane().add(panel1);
		
		panel2 = new panelimagen3();
		panel2.setBounds(10, 10, 190, 350);
		add(panel2);
	}

}
