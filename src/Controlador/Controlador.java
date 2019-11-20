package Controlador;

import Vista.MenuPrincipal;
import Vista.VentanaOpciones;

public class Controlador {

	public MenuPrincipal ventanaMenu;
	public VentanaOpciones ventanaOpc;

	public Controlador() {

		ventanaMenu = new MenuPrincipal();
		ventanaOpc = new VentanaOpciones();
	}

}