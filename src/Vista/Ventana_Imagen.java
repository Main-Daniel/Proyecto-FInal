package Vista;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Imagen extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panel_Colores panel1;
	public Panel_Imagenes panel2;
	
	
	public Ventana_Imagen() {

		setTitle("Imagenes");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);
		
		inicializarPanel();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);


	}
	
	public void inicializarPanel() {
		
		panel1 = new Panel_Colores();
		panel1.setBounds(200, 10, 185, 350);
		panel1.setBackground(Color.gray);
		getContentPane().add(panel1);
		

		panel2 = new Panel_Imagenes();
		panel2.setBounds(10, 10, 190, 350);
		add(panel2);
		
	}

}
