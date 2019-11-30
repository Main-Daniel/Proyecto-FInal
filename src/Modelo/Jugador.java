package Modelo;

import javax.swing.Icon;

public class Jugador {
	
	public String nombre;
	public int puntaje;
	public Icon icono;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public Icon getIcono() {
		return icono;
	}
	public void setIcono(Icon icono) {
		this.icono = icono;
	}
	
}