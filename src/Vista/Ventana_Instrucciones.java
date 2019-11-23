package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Instrucciones extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Panel_Instrucciones instru;

	public Ventana_Instrucciones() {

		setTitle("Instrucciones");
		setSize(600,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dispose();
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		inicializarPanel();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);


	}

	public void inicializarPanel() {

		instru = new Panel_Instrucciones();
		instru.setBounds(10, 10, 575, 650);
		instru.setBackground(Color.gray);
		add(instru);

	}

}