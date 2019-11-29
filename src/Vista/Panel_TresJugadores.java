package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel_TresJugadores extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel titulo, titlj1, titlj2, titlj3, titulo2, imagenfAmari,
				  imagenfAzul, imagenfRoja, imagenfVerde;
	public JTextArea txtj1, txtj2, txtj3;
	public JComboBox<Object> listaj1, listaj2, listaj3;
	public String[] Colores = {"Amarillo", "Azul", "Rojo", "Verde"};
	public JButton baceptar;
	
	
	public Panel_TresJugadores() {
		
		setLayout(null);
		
		titulo = new JLabel("Tres Jugadores");
		titulo.setBounds(280, 20, 460, 60);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Showcard Gothic",Font.BOLD,40));
		titulo.setForeground(Color.WHITE);
		titulo.setOpaque(true);
		titulo.setBackground(Color.ORANGE);
		add(titulo);
		
		titlj1 = new JLabel("Jugador 1");
		titlj1.setBounds(40, 100, 200, 40);
		titlj1.setHorizontalAlignment(JLabel.CENTER);
		titlj1.setFont(new Font("Showcard Gothic",Font.BOLD,24));
		titlj1.setForeground(Color.WHITE);
		titlj1.setOpaque(true);
		titlj1.setBackground(Color.ORANGE);
		add(titlj1);
		
		txtj1 = new JTextArea();
		txtj1.setBounds(40, 150, 200, 34);
		txtj1.setFont(new Font("Arial Black",Font.BOLD,24));
		add(txtj1);
		
		listaj1 = new JComboBox<Object>(Colores);
		listaj1.setBounds(40, 200, 200, 34);
		add(listaj1);
		
		
		titlj2 = new JLabel("Jugador 2");
		titlj2.setBounds(280, 100, 200, 40);
		titlj2.setHorizontalAlignment(JLabel.CENTER);
		titlj2.setFont(new Font("Showcard Gothic",Font.BOLD,24));
		titlj2.setForeground(Color.WHITE);
		titlj2.setOpaque(true);
		titlj2.setBackground(Color.ORANGE);
		add(titlj2);
		
		txtj2 = new JTextArea();
		txtj2.setBounds(280, 150, 200, 34);
		txtj2.setFont(new Font("Arial Black",Font.BOLD,24));
		add(txtj2);
		
		listaj2 = new JComboBox<Object>(Colores);
		listaj2.setBounds(280, 200, 200, 34);
		add(listaj2);
		
		
		titlj3 = new JLabel("Jugador 3");
		titlj3.setBounds(520, 100, 200, 40);
		titlj3.setHorizontalAlignment(JLabel.CENTER);
		titlj3.setFont(new Font("Showcard Gothic",Font.BOLD,24));
		titlj3.setForeground(Color.WHITE);
		titlj3.setOpaque(true);
		titlj3.setBackground(Color.ORANGE);
		add(titlj3);
		
		txtj3 = new JTextArea();
		txtj3.setBounds(520, 150, 200, 34);
		txtj3.setFont(new Font("Arial Black",Font.BOLD,24));
		add(txtj3);
		
		listaj3 = new JComboBox<Object>(Colores);
		listaj3.setBounds(520, 200, 200, 34);
		add(listaj3);
		
		
		titulo2 = new JLabel("FICHAS");
		titulo2.setBounds(280, 270, 200, 40);
		titulo2.setHorizontalAlignment(JLabel.CENTER);
		titulo2.setFont(new Font("Showcard Gothic",Font.BOLD,24));
		titulo2.setForeground(Color.WHITE);
		titulo2.setOpaque(true);
		titulo2.setBackground(Color.ORANGE);
		add(titulo2);
		
		imagenfAmari = new JLabel();
		imagenfAmari.setBounds(180, 280, 400, 200);
		add(imagenfAmari);
		
		imagenfAzul = new JLabel();
		imagenfAzul.setBounds(290, 280, 400, 200);
		add(imagenfAzul);
		
		imagenfRoja = new JLabel();
		imagenfRoja.setBounds(396, 280, 400, 200);
		add(imagenfRoja);
		
		imagenfVerde = new JLabel();
		imagenfVerde.setBounds(500, 280, 400, 200);
		add(imagenfVerde);
		
		
		baceptar = new JButton("Aceptar");
		baceptar.setBounds(280, 460, 200, 60);
		baceptar.setFont(new Font("Century Gothic",Font.BOLD,24));
		baceptar.setOpaque(true);
		baceptar.setBackground(Color.WHITE);
		add(baceptar);
		
	}
	
}
