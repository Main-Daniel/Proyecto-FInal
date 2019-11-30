package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_NumeroJugadores extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel titulo;
	public JButton b2j, b3j, b4j;
	
	
	public Panel_NumeroJugadores() {
		
		setLayout(null);
		
		titulo = new JLabel("Cuantos Jugadores");
		titulo.setBounds(10, 10, 240, 30);
		titulo.setHorizontalAlignment(JLabel.LEFT);
		titulo.setFont(new Font("Showcard Gothic",Font.BOLD,22));
		titulo.setForeground(Color.WHITE);
		add(titulo);
		
		b2j = new JButton("2");
		b2j.setBounds(10, 40, 50, 50);
		b2j.setFont(new Font("Century Gothic",Font.BOLD,24));
		b2j.setOpaque(true);
		b2j.setBackground(Color.WHITE);
		add(b2j);
		
		b3j = new JButton("3");
		b3j.setBounds(70, 40, 50, 50);
		b3j.setFont(new Font("Century Gothic",Font.BOLD,24));
		b3j.setOpaque(true);
		b3j.setBackground(Color.WHITE);
		add(b3j);
		
		b4j = new JButton("4");
		b4j.setBounds(130, 40, 50, 50);
		b4j.setFont(new Font("Century Gothic",Font.BOLD,24));
		b4j.setOpaque(true);
		b4j.setBackground(Color.WHITE);
		add(b4j);
		
	}
	
}
