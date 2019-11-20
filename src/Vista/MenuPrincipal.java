package Vista;

import java.awt.Color;

import javax.swing.JFrame;


public class MenuPrincipal extends JFrame {

	
	private static final long serialVersionUID = 1L;
	public PanelOpcionesMenuPrincipal panel1; 


	public MenuPrincipal() {

		setSize(500,400);
		setTitle("ESCALERAS Y SERPIENTES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);

		inicializarVentana();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void inicializarVentana() {
		
		panel1 = new PanelOpcionesMenuPrincipal();
		panel1.setBounds(8,8,465,345);
		panel1.setBackground(Color.gray);
		add(panel1);

	}

}