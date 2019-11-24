package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.Ventana_Juego;
import Vista.MenuPrincipal;
import Vista.Ventana_Instrucciones;
import Vista.Ventana_Numero_Jugadores;

public class Controlador implements ActionListener {

	public MenuPrincipal ventanaMenu;
	public Ventana_Instrucciones ventanainstru;
	public Ventana_Numero_Jugadores ventanaNjugadores;
	public Ventana_Juego ventanajuego;

	public Controlador() {

		ventanaMenu = new MenuPrincipal();	
		ventanaMenu.panel1.boton.addActionListener(this);

	}



	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("1. Jugar")){

			ventanainstru = new Ventana_Instrucciones();
			ventanainstru.toFront();
			ventanainstru.instru.botonsiguiente.addActionListener(this);

		}
		
		if(e.getActionCommand().equals("SIGUIENTE")) {
			
			ventanainstru.dispose();
			ventanaNjugadores = new Ventana_Numero_Jugadores();
			ventanaNjugadores.panel1.b2.addActionListener(this);
			ventanaNjugadores.panel1.b3.addActionListener(this);
			ventanaNjugadores.panel1.b4.addActionListener(this);
			
		}
		
		if(e.getActionCommand().equals("2")) {
			
			ventanaNjugadores.panel2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta1.setVisible(true);
			ventanaNjugadores.panel2.nombre1.setVisible(true);
			ventanaNjugadores.panel2.etiqueta2.setVisible(true);
			ventanaNjugadores.panel2.nombre2.setVisible(true);
			ventanaNjugadores.panel2.b_aceptar.addActionListener(this);
			
		}
		
		if(e.getActionCommand().equals("3")) {
			
			ventanaNjugadores.panel2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta1.setVisible(true);
			ventanaNjugadores.panel2.nombre1.setVisible(true);
			ventanaNjugadores.panel2.etiqueta2.setVisible(true);
			ventanaNjugadores.panel2.nombre2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta3.setVisible(true);
			ventanaNjugadores.panel2.nombre3.setVisible(true);
			ventanaNjugadores.panel2.b_aceptar.addActionListener(this);
			
		}
		
		if(e.getActionCommand().equals("4")) {
			
			ventanaNjugadores.panel2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta1.setVisible(true);
			ventanaNjugadores.panel2.nombre1.setVisible(true);
			ventanaNjugadores.panel2.etiqueta2.setVisible(true);
			ventanaNjugadores.panel2.nombre2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta3.setVisible(true);
			ventanaNjugadores.panel2.nombre3.setVisible(true);
			ventanaNjugadores.panel2.etiqueta4.setVisible(true);
			ventanaNjugadores.panel2.nombre4.setVisible(true);
			ventanaNjugadores.panel2.b_aceptar.addActionListener(this);
			
		}
		
		if(e.getActionCommand().equals("Aceptar")) {
			
			ventanaNjugadores.dispose();
			ventanajuego = new Ventana_Juego();
			
		}
		
	}
}