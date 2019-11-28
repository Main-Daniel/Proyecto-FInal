package Vista;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Numero_Jugadores extends JPanel{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel etiqueta;
	public JLabel etiqueta2;
	public JButton b2;
	public JButton b3;
	public JButton b4;

	
	public Panel_Numero_Jugadores() {
		
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		etiqueta = new JLabel("Cuantos ");
		etiqueta.setBounds(10, 10, 200, 50);
		etiqueta.setFont(new Font("forte",Font.ROMAN_BASELINE,35));
		add(etiqueta);
		
		etiqueta2 = new JLabel("Jugadores: ");
		etiqueta2.setBounds(20, 10, 200, 100);
		etiqueta2.setFont(new Font("forte",Font.ROMAN_BASELINE,35));
		add(etiqueta2);
		
		b2 = new JButton("2");
		b2.setBounds(50, 120, 100, 100);
		b2.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,50));
		add(b2);
		
		b3 = new JButton("3");
		b3.setBounds(50, 270, 100, 100);
		b3.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,50));
		add(b3);

		b4 = new JButton("4");
		b4.setBounds(50, 420, 100, 100);
		b4.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,50));
		add(b4);
		
	}
	
}
