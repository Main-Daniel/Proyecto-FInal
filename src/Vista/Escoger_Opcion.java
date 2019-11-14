package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class Escoger_Opcion extends  JPanel {
	
	public JList <String> ListaMenu;
	public String OpcionesMenu[] = {"1. Jugar", "2. Como Jugar", "3. Historial", "4. Salir"};
	public JButton boton;
	public JLabel titulo;
	public JLabel integrantes;
	public JLabel escoger;
	
	public Escoger_Opcion() {
		
		inicializarComponentes();
	     setLayout(null);
	     setVisible(true);  
	   
	}
	     
	public void inicializarComponentes() {
	     
	ListaMenu = new JList <String> (OpcionesMenu);
	ListaMenu.setBounds(15, 155 , 150,150);
	ListaMenu.setBackground(Color.gray);
	ListaMenu.setForeground(Color.WHITE);
	ListaMenu.setFont(new Font("ink free",Font.TRUETYPE_FONT,24));
	add(ListaMenu);
	
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
	
	boton = new JButton("Aceptar");
	boton.setBounds(160,300,150,40);
	boton.setFont(new Font("forte",Font.TRUETYPE_FONT,26));
	boton.setBackground(Color.cyan);
	boton.setForeground(Color.orange);
	add(boton);
	
	escoger = new JLabel("Escoja la opción que desea y oprima Aceptar: ");
	escoger.setBounds(10, 80, 400, 80);
	escoger.setForeground(Color.white);
	escoger.setFont(new Font("ink free",Font.TRUETYPE_FONT,20));
	add(escoger);
	
	
	
	
	
	}

}

