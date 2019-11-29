package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Imagnes2 extends JFrame {

	public Panelcolor2 panel1;
	public PanelIma2 panel2;
	
	
	public Ventana_Imagnes2() {

		setTitle("Información Jugador 2");
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
		panel1 = new Panelcolor2();
		panel1.setBounds(200, 10, 185, 350);
		panel1.setBackground(Color.gray);
		getContentPane().add(panel1);
		
		panel2 = new PanelIma2();
		panel2.setBounds(10, 10, 190, 350);
		add(panel2);
	}

}
