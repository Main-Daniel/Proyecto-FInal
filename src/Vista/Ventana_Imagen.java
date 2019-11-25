package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Imagen extends JFrame{
	
	public Panel_Imagen panel1;
	
	public Ventana_Imagen() {

		setTitle("Imagenes");
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
		panel1 = new Panel_Imagen();
		panel1.setBounds(10, 10, 370, 350);
		panel1.setBackground(Color.gray);
		add(panel1);
	}

}
