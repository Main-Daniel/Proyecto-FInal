package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Panel_Colores extends JPanel{
	
	public JTextField nombreJugador;
	public JComboBox<Object> lista;
	public String[] Colores = {"Azul", "Rojo", "Verde", "Amarillo"};
	public JLabel etiqueta;
	public JButton boton;
	public JButton boton2;
	public JButton boton3;
	public JButton boton4;
	public JButton ver;
	
	
	public Panel_Colores() {
		
		setLayout(null);
		setVisible(true);

		etiqueta = new JLabel("Color:", SwingConstants.CENTER);
		etiqueta.setForeground(Color.BLACK);
		etiqueta.setBounds(20, 10, 80, 30);
		add(etiqueta);
		
		lista = new JComboBox<Object>(Colores);
		lista.setBounds(80, 10, 80, 30);
		add(lista);
		
		boton = new JButton("Escoger");
		boton.setBounds(50, 250, 100, 30);
		
		
		boton2 = new JButton("Guardar");
		boton2.setBounds(50, 250, 100, 30);
		
		boton3 = new JButton("Aceptar");
		boton3.setBounds(50, 250, 100, 30);
		
		
		boton4 = new JButton("escoger");
		boton4.setBounds(50, 250, 100, 30);
		
		

		ver = new JButton("Ver");
		ver.setBounds(80, 50, 70, 20);
		add(ver);
			
		nombreJugador = new JTextField();
		nombreJugador.setBounds(40,120,130,20);
		add(nombreJugador);
		
		etiqueta = new JLabel("Ingresa tu nombre Jugador 1: "); 
		etiqueta.setBounds(10, 80, 180, 50);
		add(etiqueta);

		
		
		
		
		
	}

}
