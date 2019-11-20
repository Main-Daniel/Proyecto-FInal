package Vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MenuPrincipal Panel1;
	
	public VentanaPrincipal() {
		
		setSize(800,700);
		setTitle("Juego Serpientes y Escaleras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		

		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
		
	}
	

		

	
}
