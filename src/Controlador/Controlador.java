package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vista.MenuPrincipal;
import Vista.VentanaJuego;
import Vista.VentanaInstrucciones;

public class Controlador implements ActionListener{

	public MenuPrincipal ventanamenu;
	public VentanaJuego ventanaj;
	public VentanaInstrucciones ventanaI;

	public Controlador() {

		ventanamenu = new MenuPrincipal();
		ventanamenu.panel1.boton.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("Aceptar")){

			JOptionPane.showMessageDialog(null, "Funciona");

		}

	}

}