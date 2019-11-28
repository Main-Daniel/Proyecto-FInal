package Modelo;

import javax.swing.ImageIcon;

public class Jugador {
	
	public String nombre;
	public ImageIcon imagenjugador;
	public int puntadje = 0;
	
	public Jugador(String n, String urli) {
		
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ImageIcon getImagenjugador() {
		return imagenjugador;
	}
	
	public void setImagenjugador(ImageIcon imagenjugador) {
		this.imagenjugador = imagenjugador;
	}
	
	public int getPuntadje() {
		return puntadje;
	}
	
	public void setPuntadje(int puntadje) {
		this.puntadje = puntadje;
	}
	
}