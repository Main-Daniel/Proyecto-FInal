package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class MenuPrincipal_PanelOpciones extends  JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton boton;
	public JButton boton2;
	public JButton boton3;
	public JLabel titulo;
	public JLabel integrantes;
	public JLabel escoger;

	public MenuPrincipal_PanelOpciones() {

		setLayout(null);

		inicializarComponentes();

		setVisible(true);  

	}

	public void inicializarComponentes() {

		titulo = new JLabel("ESCALERAS & SERPIENTES");
		titulo.setBounds(20, 10,450, 50);
		titulo.setFont(new Font("forte",Font.TRUETYPE_FONT,35));
		titulo.setForeground(Color.ORANGE);
		add(titulo);

		integrantes = new JLabel("HECHO POR: Carlos Cabrera, Daniel Ortiz y John Romo ");
		integrantes.setBounds(40, 40,450, 50);
		integrantes.setFont(new Font("forte",Font.TRUETYPE_FONT,16));
		integrantes.setForeground(Color.CYAN);
		add(integrantes);

		escoger = new JLabel("Escoja la opción que desea ");
		escoger.setBounds(45, 80, 400, 80);
		escoger.setForeground(Color.white);
		escoger.setFont(new Font("ink free",Font.TRUETYPE_FONT,20));
		add(escoger);

		boton = new JButton("1. Jugar");
		boton.setBounds(160,150,150,40);
		boton.setFont(new Font("Freestyle Script",Font.TRUETYPE_FONT,38));
		boton.setBackground(Color.gray);
		boton.setForeground(Color.orange);
		boton.setBorderPainted(false);
		add(boton);
		

		boton2 = new JButton("2. Historial");
		boton2.setBounds(160,210,170,40);
		boton2.setFont(new Font("Freestyle Script",Font.TRUETYPE_FONT,38));
		boton2.setBackground(Color.gray);
		boton2.setForeground(Color.orange);
		boton2.setBorderPainted(false);
		add(boton2);
		

		boton3 = new JButton("3. Salir");
		boton3.setBounds(160,270,150,40);
		boton3.setFont(new Font("Freestyle Script",Font.TRUETYPE_FONT,38));
		boton3.setBackground(Color.gray);
		boton3.setForeground(Color.orange);
		boton3.setBorderPainted(false);
		add(boton3);
		
		
	}

}