package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana_Juego extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panel_Tablero tablero;
	public Panel_Musica musica;
	public Panel_Dado dados;
	public JButton lanzar;


	public Ventana_Juego() {

		setTitle("Juego Serpientes y Escaleras");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		inicializarPaneles();

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);



	}

	public void inicializarPaneles() {

		tablero = new Panel_Tablero();
		tablero.setBounds(10, 10, 500, 540);
		add(tablero);

		musica = new Panel_Musica();
		musica.setBounds(540, 10, 230, 80);
		add(musica);

		dados = new Panel_Dado();
		dados.setBounds(520, 400, 250, 300);
		add(dados);

		lanzar = new JButton("Tirar Dado");
		lanzar.setBounds(570,350,150,40);
		add(lanzar);

	}

}