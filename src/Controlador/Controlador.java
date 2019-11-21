package Controlador;

import Vista.Instrucciones;
import Vista.Juego;
import Vista.MenuPrincipal;
import Vista.VentanaOpciones;

public class Controlador {

	public MenuPrincipal ventanaMenu;
	public VentanaOpciones ventanaOpc;
	public Instrucciones ventanainstru;

	public Controlador() {

		ventanaMenu = new MenuPrincipal();
		ventanaOpc = new VentanaOpciones();
		ventanainstru = new Instrucciones();
}
	}

