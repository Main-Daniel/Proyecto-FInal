package Controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import Vista.MenuPrincipal;
import Vista.Ventana_Imagen;
import Vista.Ventana_Instrucciones;
import Vista.Ventana_Juego;
import Vista.Ventana_Numero_Jugadores;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class Controlador implements ActionListener, MouseListener {

	public MenuPrincipal ventanaMenu;
	public Ventana_Instrucciones ventanainstru;
	public Ventana_Imagen ventanaima;
	public Ventana_Numero_Jugadores ventanaNjugadores;
	public Ventana_Juego ventanajuego;
	ImageIcon imagenfichas, imagencolores;
	Icon iconofichas, iconocolores;


	public Controlador() {

		ventanaMenu = new MenuPrincipal();
		ventanaMenu.panel1.boton.addActionListener(this);

	}


	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("1. Jugar")){

			ventanainstru = new Ventana_Instrucciones();
			ventanainstru.toFront();
			ventanainstru.instru.botonsiguiente.addActionListener(this);

		}

		if(e.getActionCommand().equals("SIGUIENTE")) {

			ventanainstru.dispose();
			ventanaNjugadores = new Ventana_Numero_Jugadores();
			ventanaNjugadores.panel1.b2.addActionListener(this);
			ventanaNjugadores.panel1.b3.addActionListener(this);
			ventanaNjugadores.panel1.b4.addActionListener(this);

		}

		if(e.getActionCommand().equals("2")) {

			ventanaNjugadores.panel2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta1.setVisible(true);
			ventanaNjugadores.panel2.nombre1.setVisible(true);
			ventanaNjugadores.panel2.etiqueta2.setVisible(true);
			ventanaNjugadores.panel2.nombre2.setVisible(true);
			ventanaNjugadores.panel2.b_aceptar.addActionListener(this);

		}

		if(e.getActionCommand().equals("3")) {

			ventanaNjugadores.panel2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta1.setVisible(true);
			ventanaNjugadores.panel2.nombre1.setVisible(true);
			ventanaNjugadores.panel2.etiqueta2.setVisible(true);
			ventanaNjugadores.panel2.nombre2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta3.setVisible(true);
			ventanaNjugadores.panel2.nombre3.setVisible(true);
			ventanaNjugadores.panel2.b_aceptar.addActionListener(this);

		}

		if(e.getActionCommand().equals("4")) {

			ventanaNjugadores.panel2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta1.setVisible(true);
			ventanaNjugadores.panel2.nombre1.setVisible(true);
			ventanaNjugadores.panel2.etiqueta2.setVisible(true);
			ventanaNjugadores.panel2.nombre2.setVisible(true);
			ventanaNjugadores.panel2.etiqueta3.setVisible(true);
			ventanaNjugadores.panel2.nombre3.setVisible(true);
			ventanaNjugadores.panel2.etiqueta4.setVisible(true);
			ventanaNjugadores.panel2.nombre4.setVisible(true);
			ventanaNjugadores.panel2.b_aceptar.addActionListener(this);

		}

		if(e.getActionCommand().equals("Aceptar")) {

			ventanaNjugadores.dispose();
			ventanaima = new Ventana_Imagen();

			ventanaima.panel2.etiquetaimagen.setVisible(true);
			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
			ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);

			ventanaima.panel1.color1.addActionListener(this);
			ventanaima.panel1.color2.addActionListener(this);
			ventanaima.panel1.color3.addActionListener(this);
			ventanaima.panel1.color4.addActionListener(this);
			ventanaima.panel1.botonselec.addActionListener(this);

		}

		if(e.getActionCommand().equals("Azul")) {

			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 1.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
			ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);

		}else if(e.getActionCommand().equals("Rojo")) {

			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 2.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
			ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);


		}else if(e.getActionCommand().equals("Verde")) {

			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 3.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
			ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);

		}else if(e.getActionCommand().equals("Amarillo")) {

			imagenfichas = new ImageIcon(getClass().getResource("/Modelo/Ficha - 4.png"));
			iconofichas = new ImageIcon(imagenfichas.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
			ventanaima.panel2.etiquetaimagen.setIcon(iconofichas);

		}

		if(e.getActionCommand().contentEquals("SELECCIONAR")) {

			ventanaima.dispose();
			ventanajuego = new Ventana_Juego();
			ventanajuego.musica.breproducir.addMouseListener(this);;

		}

	}
	
	public void mouseClicked(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
	public void Musica() {

		try {

			FileInputStream cacion;
			Player reproductor;
			cacion = new FileInputStream("canciones\\Queen - Don't Stop Me Now.mp3");
			BufferedInputStream Bis = new BufferedInputStream(cacion);
			reproductor = new Player(cacion);
			reproductor.play();

		} catch (FileNotFoundException e1) {

			e1.printStackTrace();

		} catch (JavaLayerException e1) {

			e1.printStackTrace();
			
		}

	}

}