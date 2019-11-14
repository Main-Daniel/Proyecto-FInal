package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;


public class MenuPrincipal extends JFrame {
	
	public Escoger_Opcion panel1; 
	
	
	public MenuPrincipal() {
		
		setSize(500,400);
		setTitle("ESCALERAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.cyan);
		
		inicializarVentana();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarVentana() {
		
		panel1 = new Escoger_Opcion();
		panel1.setBounds(8,8,475,355 );
		panel1.setBackground(Color.gray);
		add(panel1);
		
		
	}
	
}
