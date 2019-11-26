package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Musica extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel nombrecancion;
	public JButton breproducir, bpausar;
	
	public Panel_Musica() {
		
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		
		IniciarComponentes();
		
		setVisible(true);
		
	}
	
	public void IniciarComponentes() {
		
		nombrecancion = new JLabel("");
		nombrecancion.setHorizontalAlignment(JLabel.CENTER);
		nombrecancion.setOpaque(true);
		nombrecancion.setBackground(Color.darkGray);
		nombrecancion.setBounds(6, 6, 216, 30);
		add(nombrecancion);
		
		breproducir = new JButton("R");
		breproducir.setBounds(40, 50, 60, 20);
		add(breproducir);
		
		bpausar = new JButton("P");
		bpausar.setBounds(130, 50, 60, 20);
		add(bpausar);
		
	}
	
}