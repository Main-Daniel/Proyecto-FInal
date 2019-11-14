package Controlador;

import Vista.MenuPrincipal;
import Vista.VentanaPrincipal;

public class Controlador {
	
	public VentanaPrincipal ventanap;
	public MenuPrincipal ventana_menu;
	
	public Controlador() {
		
		ventanap = new VentanaPrincipal();
		ventana_menu = new MenuPrincipal();
	}
	
}
