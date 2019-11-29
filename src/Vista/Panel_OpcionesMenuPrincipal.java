package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_OpcionesMenuPrincipal extends JPanel{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel titulo, creadores;
	public JButton bjugar, bhistorial, bsalir;
	
	
	public Panel_OpcionesMenuPrincipal() {
		
		setLayout(null);
		
		titulo = new JLabel("SERPIENTES Y ESCALERAS");
		titulo.setBounds(10, 20, 750, 68);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Showcard Gothic",Font.BOLD,54));
		titulo.setForeground(Color.WHITE);
		add(titulo);
		
		creadores = new JLabel("Creadores: Carlos Cabrera, Daniel Ortiz, John Romo");
		creadores.setBounds(50, 100, 640, 30);
		creadores.setFont(new Font("Berlin Sans FB",Font.BOLD,24));
		creadores.setForeground(Color.WHITE);
		add(creadores);
		
		bjugar = new JButton("Jugar");
		bjugar.setBounds(280, 220, 200, 60);
		bjugar.setFont(new Font("Century Gothic",Font.BOLD,24));
		bjugar.setOpaque(true);
		bjugar.setBackground(Color.WHITE);
		add(bjugar);
		
		bhistorial = new JButton("Historial");
		bhistorial.setBounds(280, 300, 200, 60);
		bhistorial.setFont(new Font("Century Gothic",Font.BOLD,24));
		bhistorial.setOpaque(true);
		bhistorial.setBackground(Color.WHITE);
		add(bhistorial);
		
		bsalir = new JButton("Salir");
		bsalir.setBounds(280, 380, 200, 60);
		bsalir.setFont(new Font("Century Gothic",Font.BOLD,24));
		bsalir.setOpaque(true);
		bsalir.setBackground(Color.WHITE);
		add(bsalir);
		
	}
	
}