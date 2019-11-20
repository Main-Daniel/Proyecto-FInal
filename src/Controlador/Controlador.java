package Controlador;

import Vista.Instrucciones;
import Vista.Juego;
import Vista.MenuPrincipal;
import Vista.VentanaOpciones;

public class Controlador {

	public MenuPrincipal ventanaMenu;
	public Juego ventanaJuego;
	public Instrucciones ventanains;
	public VentanaOpciones ventananjugadores;

	public Controlador() {

		ventanaMenu = new MenuPrincipal();
		
	}

}