package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Dado extends JPanel {

public JLabel etiquetadado;
public JButton boton;
	
	public Panel_Dado() {

		etiquetadado = new JLabel();
		add(etiquetadado);
		
		boton = new JButton("Tirar Dado");
		boton.setBounds(30, 30, 100, 30);
		add(boton);
		
	}

}
