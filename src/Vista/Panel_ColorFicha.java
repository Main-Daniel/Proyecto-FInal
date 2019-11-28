package Vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Panel_ColorFicha extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JComboBox<Object> lista;
	public String[] Colores = {"Azul", "Rojo", "Verde", "Amarillo"};
	public JButton bver, bguardarjugador;


	public Panel_ColorFicha(String nombrej) {
			
			setLayout(new FlowLayout());
			
			lista = new JComboBox<Object>(Colores);
			lista.setBounds(60, 10, 80, 30);
			add(lista);
			
			bver = new JButton("Ver Ficha para " + nombrej);
			bver.setBounds(10, 50, 180, 30);
			add(bver);
			
			bguardarjugador = new JButton("Guardar Jugadores");
			bguardarjugador.setBounds(10, 100, 180, 30);
			add(bguardarjugador);

		}

}