package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.MenuPrincipal;
import Vista.VentanaOpciones;
import Vista.Ventana_Imagen;
import Vista.Ventana_Instrucciones;


public class Controlador implements ActionListener {

	public MenuPrincipal ventanaMenu;
	public VentanaOpciones ventanaOpc;
	public Ventana_Instrucciones ventanainstru;
	public Ventana_Imagen ventanaima;

	public Controlador() {

		ventanaMenu = new MenuPrincipal();	
		ventanaMenu.panel1.boton.addActionListener(this);
		ventanaima = new Ventana_Imagen();
		
}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("1. Jugar")){
			
	    	ventanainstru = new Ventana_Instrucciones();		
			ventanainstru.instru.siguiente.addActionListener(this);
			
		}
		
		if(e.getActionCommand().equals("SIGUIENTE")) {
			
			ventanaOpc = new VentanaOpciones();
			ventanaOpc.opcion.b2.addActionListener(this);
			ventanaOpc.opcion.b3.addActionListener(this);
			ventanaOpc.opcion.b4.addActionListener(this);
			ventanaOpc.setVisible(true);
			
		}
		
		ventanaOpc.opcion2.etiqueta1.setVisible(false);
		ventanaOpc.opcion2.nombre.setVisible(false);
		ventanaOpc.opcion2.etiqueta2.setVisible(false);
		ventanaOpc.opcion2.nombre2.setVisible(false);
		ventanaOpc.opcion2.etiqueta3.setVisible(false);
		ventanaOpc.opcion2.nombre3.setVisible(false);
		ventanaOpc.opcion2.etiqueta4.setVisible(false);
		ventanaOpc.opcion2.nombre4.setVisible(false);
		
		
		if(e.getActionCommand().equals("2")) {
			ventanaOpc.opcion2.nombre.setVisible(true);
			ventanaOpc.opcion2.etiqueta1.setVisible(true);

			ventanaOpc.opcion2.nombre2.setVisible(true);
			ventanaOpc.opcion2.etiqueta2.setVisible(true);
			
		}else if(e.getActionCommand().equals("3")) {
			ventanaOpc.opcion2.nombre.setVisible(true);
			ventanaOpc.opcion2.etiqueta1.setVisible(true);

			ventanaOpc.opcion2.nombre2.setVisible(true);
			ventanaOpc.opcion2.etiqueta2.setVisible(true);
			
			ventanaOpc.opcion2.nombre3.setVisible(true);
			ventanaOpc.opcion2.etiqueta3.setVisible(true);
	 
		}else if(e.getActionCommand().equals("4")) {
			ventanaOpc.opcion2.nombre.setVisible(true);
			ventanaOpc.opcion2.etiqueta1.setVisible(true);

			ventanaOpc.opcion2.nombre2.setVisible(true);
			ventanaOpc.opcion2.etiqueta2.setVisible(true);
			
			ventanaOpc.opcion2.nombre3.setVisible(true);
			ventanaOpc.opcion2.etiqueta3.setVisible(true);
			
			ventanaOpc.opcion2.nombre4.setVisible(true);
			ventanaOpc.opcion2.etiqueta4.setVisible(true);
	    }
}
}