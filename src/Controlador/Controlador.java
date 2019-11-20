package Controlador;

import Vista.MenuPrincipal;
import Vista.VentanaInstrucciones;
import Vista.VentanaPrincipal;

public class Controlador {
	
	public MenuPrincipal ventana_menu;
	public VentanaInstrucciones ventanaI;
	
	public Controlador() {
	
		ventana_menu = new MenuPrincipal();
		ventanaI = new VentanaInstrucciones(); 
		
	}
	
}
