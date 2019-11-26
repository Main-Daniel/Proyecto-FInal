package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_Opcion2 extends JPanel {
	
	public JTextField nombre;
	public JTextField nombre2;
	public JTextField nombre3;
	public JTextField nombre4;	
	public JLabel etiqueta;
	public JLabel etiqueta1;
	public JLabel etiqueta2;
	public JLabel etiqueta3;
	public JLabel etiqueta4;
	public JButton siguiente;
	
	public Panel_Opcion2() {
		
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		nombre = new JTextField();
		nombre.setBounds(30, 120, 200, 30);
		add(nombre);
		
		nombre2 = new JTextField();
		nombre2.setBounds(30, 230, 200, 30);
		add(nombre2);
		
		nombre3 = new JTextField();
		nombre3.setBounds(30, 340, 200, 30);
		add(nombre3);
		
		nombre4 = new JTextField();
		nombre4.setBounds(30, 450, 200, 30);
		add(nombre4);
		
		etiqueta = new JLabel("¿Cómo te ");
		etiqueta.setBounds(25, 5, 200, 50);
		etiqueta.setFont(new Font("forte",Font.ROMAN_BASELINE,34));
		add(etiqueta);
		
		etiqueta = new JLabel("llamamos?");
		etiqueta.setBounds(25, 20, 200, 80);
		etiqueta.setFont(new Font("forte",Font.ROMAN_BASELINE,34));
		add(etiqueta);
		
		etiqueta1 = new JLabel("Jugador 1:");
		etiqueta1.setBounds(25, 55, 200, 100);
		etiqueta1.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,28));
		etiqueta1.setForeground(Color.ORANGE);
		add(etiqueta1);
		
		etiqueta2 = new JLabel("Jugador 2:");
		etiqueta2.setBounds(25, 165, 200, 100);
		etiqueta2.setForeground(Color.ORANGE);
		etiqueta2.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,28));
		add(etiqueta2);
		
		etiqueta3 = new JLabel("Jugador 3:");
		etiqueta3.setBounds(25, 275, 200, 100);
		etiqueta3.setForeground(Color.ORANGE);
		etiqueta3.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,28));
		add(etiqueta3);
		
		etiqueta4 = new JLabel("Jugador 4:");
		etiqueta4.setBounds(25, 385, 200, 100);
		etiqueta4.setForeground(Color.ORANGE);
		etiqueta4.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,28));
		add(etiqueta4);
		
		siguiente = new JButton("Aceptar");
		siguiente.setBounds(70, 500, 100, 40);
		siguiente.setFont(new Font("forte",Font.ROMAN_BASELINE,14));
		add(siguiente);
	
		
	}
	
	
	
	
	
	
	
	
}

