package Controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Modelo.Jugador;
import Vista.Ventana_Juego;
import Vista.Ventana_Principal;

public class Controlador implements ActionListener{

	public Ventana_Principal menuprincipal;
	public Ventana_Juego ventanajuego;
	public Jugador jugador1, jugador2, jugador3, jugador4;
	ImageIcon imagenfichas,imagenfichas1, imagenfichas2,imagenfichas3, dado;
	ImageIcon iconofichas,iconofichas1,iconofichas2,iconofichas3, dadonum;

	public Controlador() {

		menuprincipal = new Ventana_Principal("../Modelo/FondoSerpientesYEscalerasMenuPrincipal.png");
		
		menuprincipal.panel1.bjugar.addActionListener(this);
		
		menuprincipal.panel2.bsiguiente.addActionListener(this);
		
		menuprincipal.panel3.b2j.addActionListener(this);
		menuprincipal.panel3.b3j.addActionListener(this);
		menuprincipal.panel3.b4j.addActionListener(this);
		
		menuprincipal.panel4.listaj1.addActionListener(this);
		menuprincipal.panel4.listaj2.addActionListener(this);
		menuprincipal.panel4.baceptar.addActionListener(this);
		
		menuprincipal.panel4_1.listaj1.addActionListener(this);
		menuprincipal.panel4_1.listaj2.addActionListener(this);
		menuprincipal.panel4_1.listaj3.addActionListener(this);
		menuprincipal.panel4_1.baceptar.addActionListener(this);
		
		menuprincipal.panel4_2.listaj1.addActionListener(this);
		menuprincipal.panel4_2.listaj2.addActionListener(this);
		menuprincipal.panel4_2.listaj4.addActionListener(this);
		menuprincipal.panel4_2.baceptar.addActionListener(this);

	}


	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand()) {

		case "Jugar":

			menuprincipal.panel1.setVisible(false);
			menuprincipal.panel1.setEnabled(false);
			menuprincipal.panel2.setVisible(true);
			menuprincipal.panel2.setEnabled(true);
			break;

		case "Siguiente":

			menuprincipal.panel2.setVisible(false);
			menuprincipal.panel2.setEnabled(false);
			menuprincipal.panel3.setVisible(true);
			menuprincipal.panel3.setEnabled(true);
			break;

		case "2":

			menuprincipal.panel4.setVisible(true);
			menuprincipal.panel4.setEnabled(true);
			menuprincipal.panel4_1.setVisible(false);
			menuprincipal.panel4_1.setEnabled(false);
			menuprincipal.panel4_2.setVisible(false);
			menuprincipal.panel4_2.setEnabled(false);

			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha Amarilla.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4.imagenfAzul.setIcon(iconofichas);

			imagenfichas1 = new ImageIcon(getClass().getResource("/Modelo/ Azul.png"));
			iconofichas1 = new ImageIcon(imagenfichas1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4.imagenfAmari.setIcon(iconofichas1);

			imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha Roja.png"));
			iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4.imagenfRoja.setIcon(iconofichas2);

			imagenfichas3 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
			iconofichas3 = new ImageIcon(imagenfichas3.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4.imagenfVerde.setIcon(iconofichas3);
			break;

		case "3":

			menuprincipal.panel4.setVisible(false);
			menuprincipal.panel4.setEnabled(false);
			menuprincipal.panel4_1.setVisible(true);
			menuprincipal.panel4_1.setEnabled(true);
			menuprincipal.panel4_2.setVisible(false);
			menuprincipal.panel4_2.setEnabled(false);
			
			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha Amarilla.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4_1.imagenfAzul.setIcon(iconofichas);

			imagenfichas1 = new ImageIcon(getClass().getResource("/Modelo/Ficha Azul.png"));
			iconofichas1 = new ImageIcon(imagenfichas1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4_1.imagenfAmari.setIcon(iconofichas1);

			imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha Roja.png"));
			iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4_1.imagenfRoja.setIcon(iconofichas2);

			imagenfichas3 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
			iconofichas3 = new ImageIcon(imagenfichas3.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4_1.imagenfVerde.setIcon(iconofichas3);
			break;

		case "4":
			
			menuprincipal.panel4.setVisible(false);
			menuprincipal.panel4.setEnabled(false);
			menuprincipal.panel4_1.setVisible(false);
			menuprincipal.panel4_1.setEnabled(false);
			menuprincipal.panel4_2.setVisible(true);
			menuprincipal.panel4_2.setEnabled(true);
			
			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha Amarilla.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4_2.imagenfAzul.setIcon(iconofichas);

			imagenfichas1 = new ImageIcon(getClass().getResource("/Modelo/Ficha Azul.png"));
			iconofichas1 = new ImageIcon(imagenfichas1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4_2.imagenfAmari.setIcon(iconofichas1);

			imagenfichas2 = new ImageIcon(getClass().getResource("/Modelo/Ficha Roja.png"));
			iconofichas2 = new ImageIcon(imagenfichas2.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4_2.imagenfRoja.setIcon(iconofichas2);

			imagenfichas3 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
			iconofichas3 = new ImageIcon(imagenfichas3.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
			menuprincipal.panel4_2.imagenfVerde.setIcon(iconofichas3);
			break;

		case "Aceptar":

			String nj1 = menuprincipal.panel4.txtj1.getText() + menuprincipal.panel4_1.txtj1.getText() + menuprincipal.panel4_2.txtj1.getText();
			jugador1 = new Jugador();
			jugador1.setNombre(nj1);
			
			if(menuprincipal.panel4.listaj1.getSelectedItem().equals("Amarillo") || menuprincipal.panel4_1.listaj1.getSelectedItem().equals("Amarillo")
				|| menuprincipal.panel4_2.listaj2.getSelectedItem().equals("Amarillo")) {
				
				ImageIcon imagenj1 = new ImageIcon(getClass().getResource("/Modelo/Ficha Amarilla.png"));
				ImageIcon iconoj1 = new ImageIcon(imagenj1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador1.setIcono(iconoj1);
				
			}else if(menuprincipal.panel4.listaj1.getSelectedItem().equals("Azul") || menuprincipal.panel4_1.listaj1.getSelectedItem().equals("Azul") 
						|| menuprincipal.panel4_2.listaj2.getSelectedItem().equals("Azul")) {
				
				ImageIcon imagenj1 = new ImageIcon(getClass().getResource("/Modelo/Ficha Azul.png"));
				ImageIcon iconoj1 = new ImageIcon(imagenj1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador1.setIcono(iconoj1);
				
			}else if(menuprincipal.panel4.listaj1.getSelectedItem().equals("Rojo") || menuprincipal.panel4_1.listaj1.getSelectedItem().equals("Rojo")
						|| menuprincipal.panel4_2.listaj2.getSelectedItem().equals("Rojo")) {
				
				ImageIcon imagenj1 = new ImageIcon(getClass().getResource("/Modelo/Ficha Roja.png"));
				ImageIcon iconoj1 = new ImageIcon(imagenj1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador1.setIcono(iconoj1);
				
			}else if(menuprincipal.panel4.listaj1.getSelectedItem().equals("Verde") || menuprincipal.panel4_1.listaj1.getSelectedItem().equals("Verde")
						|| menuprincipal.panel4_2.listaj2.getSelectedItem().equals("Verde")) {
				
				ImageIcon imagenj1 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
				ImageIcon iconoj1 = new ImageIcon(imagenj1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador1.setIcono(iconoj1);
				
			}
			
			
			String nj2 = menuprincipal.panel4.txtj2.getText() + menuprincipal.panel4_1.txtj2.getText() + menuprincipal.panel4_2.txtj2.getText();
			jugador2 = new Jugador();
			jugador2.setNombre(nj2);
			
			if(menuprincipal.panel4.listaj2.getSelectedItem().equals("Amarillo") || menuprincipal.panel4_1.listaj2.getSelectedItem().equals("Amarillo")
				|| menuprincipal.panel4_2.listaj2.getSelectedItem().equals("Amarillo")) {
				
				ImageIcon imagenj2 = new ImageIcon(getClass().getResource("/Modelo/Ficha Amarilla.png"));
				ImageIcon iconoj2 = new ImageIcon(imagenj2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador2.setIcono(iconoj2);
				
			}else if(menuprincipal.panel4.listaj2.getSelectedItem().equals("Azul") || menuprincipal.panel4_1.listaj2.getSelectedItem().equals("Azul")
						|| menuprincipal.panel4_2.listaj2.getSelectedItem().equals("Azul")) {
				
				ImageIcon imagenj2 = new ImageIcon(getClass().getResource("/Modelo/Ficha Azul.png"));
				ImageIcon iconoj2 = new ImageIcon(imagenj2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador2.setIcono(iconoj2);
				
			}else if(menuprincipal.panel4.listaj2.getSelectedItem().equals("Rojo") || menuprincipal.panel4_1.listaj2.getSelectedItem().equals("Rojo")
					|| menuprincipal.panel4_2.listaj2.getSelectedItem().equals("Rojo")) {
				
				ImageIcon imagenj2 = new ImageIcon(getClass().getResource("/Modelo/Ficha Roja.png"));
				ImageIcon iconoj2 = new ImageIcon(imagenj2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador2.setIcono(iconoj2);
				
			}else if(menuprincipal.panel4.listaj2.getSelectedItem().equals("Verde") || menuprincipal.panel4_1.listaj2.getSelectedItem().equals("Verde")
					|| menuprincipal.panel4_2.listaj2.getSelectedItem().equals("Verde")) {
				
				ImageIcon imagenj2 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
				ImageIcon iconoj2 = new ImageIcon(imagenj2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador2.setIcono(iconoj2);
				
			}
			
			
			String nj3 = menuprincipal.panel4_1.txtj3.getText() + menuprincipal.panel4_2.txtj3.getText();
			jugador3 = new Jugador();
			jugador3.setNombre(nj3);
			
			if(menuprincipal.panel4_1.listaj3.getSelectedItem().equals("Amarillo") || menuprincipal.panel4_2.listaj3.getSelectedItem().equals("Amarillo")) {
				
				ImageIcon imagenj3 = new ImageIcon(getClass().getResource("/Modelo/Ficha Amarilla.png"));
				ImageIcon iconoj3 = new ImageIcon(imagenj3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador3.setIcono(iconoj3);
				
			}else if(menuprincipal.panel4_1.listaj3.getSelectedItem().equals("Azul") || menuprincipal.panel4_2.listaj3.getSelectedItem().equals("Azul")) {
				
				ImageIcon imagenj3 = new ImageIcon(getClass().getResource("/Modelo/Ficha Azul.png"));
				ImageIcon iconoj3 = new ImageIcon(imagenj3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador3.setIcono(iconoj3);
				
			}else if(menuprincipal.panel4_1.listaj3.getSelectedItem().equals("Rojo") || menuprincipal.panel4_1.listaj3.getSelectedItem().equals("Rojo")) {
				
				ImageIcon imagenj3 = new ImageIcon(getClass().getResource("/Modelo/Ficha Roja.png"));
				ImageIcon iconoj3 = new ImageIcon(imagenj3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador3.setIcono(iconoj3);
				
			}else if(menuprincipal.panel4_1.listaj3.getSelectedItem().equals("Verde") || menuprincipal.panel4_1.listaj3.getSelectedItem().equals("Verde")) {
				
				ImageIcon imagenj3 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
				ImageIcon iconoj3 = new ImageIcon(imagenj3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador3.setIcono(iconoj3);
				
			}
			
			
			String nj4 = menuprincipal.panel4_2.txtj4.getText();
			jugador4 = new Jugador();
			jugador4.setNombre(nj4);
			
			if(menuprincipal.panel4_2.listaj4.getSelectedItem().equals("Amarillo")) {
				
				ImageIcon imagenj4 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
				ImageIcon iconoj4 = new ImageIcon(imagenj4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador4.setIcono(iconoj4);
				
			}else if(menuprincipal.panel4_2.listaj4.getSelectedItem().equals("Azul")) {
				
				ImageIcon imagenj4 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
				ImageIcon iconoj4 = new ImageIcon(imagenj4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador4.setIcono(iconoj4);
				
			}else if(menuprincipal.panel4_2.listaj4.getSelectedItem().equals("Rojo")) {
				
				ImageIcon imagenj4 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
				ImageIcon iconoj4 = new ImageIcon(imagenj4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador4.setIcono(iconoj4);
				
			}else if(menuprincipal.panel4_2.listaj4.getSelectedItem().equals("Verde")) {
				
				ImageIcon imagenj4 = new ImageIcon(getClass().getResource("/Modelo/Ficha Verde.png"));
				ImageIcon iconoj4 = new ImageIcon(imagenj4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));
				jugador4.setIcono(iconoj4);
				
			}
			
			
			menuprincipal.dispose();
			ventanajuego = new Ventana_Juego();
			ventanajuego.dado.boton.addActionListener(this);
			
			

			dado = new ImageIcon(getClass().getResource("/Modelo/Dado (GIF).gif"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dado.etiquetadado.setIcon(dadonum);	
			break;

		case "Tirar Dado":

			int ndado = tirarDado();
			
			
			
			break;

		}	
	}

	public int tirarDado() {

		int i = (int)(Math.random()*6+1);


		if(i == 1 ) {
			
			dado = new ImageIcon(getClass().getResource("/Modelo/Cara - 1.png"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dado.etiquetadado.setIcon(dadonum);
			
		}else if(i == 2 ) {
			
			dado = new ImageIcon(getClass().getResource("/Modelo/Cara - 2.png"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dado.etiquetadado.setIcon(dadonum);
			
		}else if(i == 3 ) {
			
			dado = new ImageIcon(getClass().getResource("/Modelo/Cara - 3.png"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dado.etiquetadado.setIcon(dadonum);
			
		}else if(i == 4 ) {
			
			dado = new ImageIcon(getClass().getResource("/Modelo/Cara - 4.png"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dado.etiquetadado.setIcon(dadonum);
			
		}else if(i == 5 ) {
			
			dado = new ImageIcon(getClass().getResource("/Modelo/Cara - 5.png"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dado.etiquetadado.setIcon(dadonum);	
			
		}else if(i == 6 ) {
			
			dado = new ImageIcon(getClass().getResource("/Modelo/Cara - 6.png"));
			dadonum = new ImageIcon(dado.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));
			ventanajuego.dado.etiquetadado.setIcon(dadonum);
			
		}
		
		return i;
		
	}
	
}