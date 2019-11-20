package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaOpciones extends JFrame{
	
	public Opción1 opcion;
	
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
		opcion = new Opción1();
		opcion.setBounds(10, 10, 220, 750);
		opcion.setBackground(Color.gray);
		add(opcion);
	}

}
