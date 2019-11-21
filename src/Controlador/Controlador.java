package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.Instrucciones;
import Vista.Juego;
import Vista.MenuPrincipal;
import Vista.VentanaOpciones;

public class Controlador implements ActionListener {

	public MenuPrincipal ventanaMenu;
	public VentanaOpciones ventanaOpc;
	public Instrucciones ventanainstru;

	public Controlador() {

		ventanaMenu = new MenuPrincipal();	
		ventanaMenu.panel1.boton.addActionListener(this);
		
		
}
	


	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("1. Jugar")){
			
			ventanainstru = new Instrucciones();		
			ventanainstru.instru.siguiente.addActionListener(this);
			
		}
		
		if(e.getActionCommand().equals("SIGUIENTE")) {
			
			ventanaOpc = new VentanaOpciones();
			ventanaOpc.setVisible(true);
			
	}

  }
}