package Controlador;

import Vista.MenuPrincipal;
import Vista.Juego;

public class Controlador {
	
	public MenuPrincipal ventana_menu;
	public Juego ventanaP;
	public Controlador() {
	
		ventana_menu = new MenuPrincipal();
		ventanaP = new Juego(); 
	}
	
}
