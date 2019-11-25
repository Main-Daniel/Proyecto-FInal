package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Imagen extends JPanel{
	
	public JButton aceptar;
	public JButton color1; 
	public JButton color2; 
	public JButton color3; 
	public JButton color4; 
	public JLabel etiquetaimagen;
	
	
	public Panel_Imagen() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
		
	}

	public void inicializarComponentes() {
		
		aceptar = new JButton("ACEPTAR");
		aceptar.setBounds(250, 300, 110, 40);
		add(aceptar);
		
		color1 = new JButton();
		color1.setBounds(220, 70, 100, 40);
		color1.setBackground(Color.cyan);
		add(color1);
		
		color2 = new JButton();
		color2.setBounds(220, 120,100,40);
		color2.setBackground(Color.red);
		add(color2);
		
		color3 = new JButton();
		color3.setBounds(220,170,100,40);
		color3.setBackground(Color.green);
		add(color3);
		
		color4 = new JButton();
		color4.setBounds(220,220,100,40);
		color4.setBackground(Color.orange);
		add(color4);
		
		etiquetaimagen = new JLabel();
		etiquetaimagen.setBounds(20, 70, 200, 200);
		add(etiquetaimagen);

		
		
		
		
		
	}

}
