package Controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Vista.MenuPrincipal;
import Vista.Ventana_Jugador;
import Vista.Ventana_Instrucciones;
import Vista.Ventana_Juego;
import Vista.Ventana_Numero_Jugadores;

public class Controlador implements ActionListener {
	
	public MenuPrincipal ventanaMenu;
	public Ventana_Instrucciones ventanainstru;
	public Ventana_Jugador ventanajugadores;
	public Ventana_Numero_Jugadores ventanaNjugadores;
	public Ventana_Juego ventanajuego;
	ImageIcon imagenfichas, imagencolores, imagenfichas2, imagencolores2, dado;
	Icon iconofichas, iconocolores, iconofichas2, iconocolores2, dadonum;
	
	
	public Controlador() {
		
		ventanaMenu = new MenuPrincipal();	
		ventanaMenu.panel1.boton.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "1. Jugar":
			
			ventanainstru = new Ventana_Instrucciones();
			ventanainstru.toFront();
			ventanainstru.instru.botonsiguiente.addActionListener(this);
			break;
			
		case "SIGUIENTE":
			
			ventanainstru.dispose();
			ventanaNjugadores = new Ventana_Numero_Jugadores();
			ventanaNjugadores.panel1.b2.addActionListener(this);
			break;
			
		case "2":
			
			ventanainstru.dispose();
			ventanajugadores = new Ventana_Jugador("Jugador 1", "Jugador 2");
			ventanajugadores.panel1.bver.addActionListener(this);
			
			if(ventanajugadores.panel1.lista.getSelectedItem().equals("Azul") && e.getActionCommand().equals("Ver")) {

				 
				imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
				iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
				ventanajugadores.panel2.etiquetaimagen.setIcon(iconofichas);
				
		 }else if(ventanajugadores.panel1.lista.getSelectedItem().equals("Rojo") && e.getActionCommand().equals("Ver")) {

				imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 2.png"));
				iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
				ventanajugadores.panel2.etiquetaimagen.setIcon(iconofichas);
				
				
				
		 }else if(ventanajugadores.panel1.lista.getSelectedItem().equals("Verde") && e.getActionCommand().equals("Ver")) {

				imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 3.png"));
				iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
				ventanajugadores.panel2.etiquetaimagen.setIcon(iconofichas);
				
		 }else if(ventanajugadores.panel1.lista.getSelectedItem().equals("Amarillo") && e.getActionCommand().equals("Ver")) {

				imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 4.png"));
				iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
				ventanajugadores.panel2.etiquetaimagen.setIcon(iconofichas);
		 }else 
			 
			 if(ventanajugadores.panel3.lista.getSelectedItem().equals("Azul") && e.getActionCommand().equals("Ver")) {

				 
					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanajugadores.panel4.etiquetaimagen.setIcon(iconofichas);
					
			 }else if(ventanajugadores.panel3.lista.getSelectedItem().equals("Rojo") && e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 2.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanajugadores.panel4.etiquetaimagen.setIcon(iconofichas);
					
					
					
			 }else if(ventanajugadores.panel3.lista.getSelectedItem().equals("Verde") && e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 3.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanajugadores.panel4.etiquetaimagen.setIcon(iconofichas);
					
			 }else if(ventanajugadores.panel3.lista.getSelectedItem().equals("Amarillo") && e.getActionCommand().equals("Ver")) {

					imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 4.png"));
					iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
					ventanajugadores.panel4.etiquetaimagen.setIcon(iconofichas);
			 }
			
			ventanajugadores.panel1.bguardarjugador.addActionListener(this);
			ventanajugadores.panel3.bguardarjugador.addActionListener(this);
			break;
			
		case "Guardar Jugadores":
			
			ventanajugadores.dispose();
			ventanajuego = new Ventana_Juego();
			break;
		
		case "Tirar Dado":
			
			LanzarDados();
			break;
			
		}
		
	}
	
	public void LanzarDados() {
		
		int i = (int)(Math.random()*6+1);
		
		if(i == 1 ) {

			dado = new ImageIcon(getClass().getResource("/Modelo/dado1.jpg"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dados.etiquetadado.setIcon(dadonum);	
	 	}else if(i == 2 ) {

			dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 2.jpg"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dados.etiquetadado.setIcon(dadonum);	
	 	}else if(i == 3 ) {

			dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 3.jpg"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dados.etiquetadado.setIcon(dadonum);	
	 	}else if(i == 4 ) {

			dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 4.jpg"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dados.etiquetadado.setIcon(dadonum);	
	 	}else if(i == 5 ) {

			dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 5.jpg"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dados.etiquetadado.setIcon(dadonum);	
			
	 	}else if(i == 6 ) {

			dado = new ImageIcon(getClass().getResource("/Modelo/Dado - 6.jpg"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dados.etiquetadado.setIcon(dadonum);	
	 		 	
	 }
		
	}
	
}