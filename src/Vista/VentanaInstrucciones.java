package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaInstrucciones extends JFrame{
	
	public Mostrar_Instrucciones instru;
	
	public VentanaInstrucciones() {
		
		setTitle("Instrucciones");
		setSize(600,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		inicializarVentana();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

		
	}
	
	public void inicializarVentana() {
		
		instru = new Mostrar_Instrucciones();
		instru.setBounds(10, 10, 575, 650);
		instru.setBackground(Color.gray);
		add(instru);
	}

}
