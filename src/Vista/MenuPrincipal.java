package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;


public class MenuPrincipal extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JList <String> ListaMenu;
	public String OpcionesMenu[] = {"Jugar", " Como Jugar", "Historial", "Salir"};
	public JButton boton;
	
	public MenuPrincipal() {
		
		setSize(340,340);
		setTitle("ESCALERAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		

		
		ListaMenu = new JList <String> (OpcionesMenu);
		ListaMenu.setBounds(50, 150, 50,160);
		add(ListaMenu);
		
		boton = new JButton("Seleccionar");
		boton.setBounds(140, 200,	60, 50);
		add(boton);
		
	}
	
}
