package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Panel_Instrucciones extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel titulo;
	public JTextArea texto;
	public JScrollPane barraDesplazamiento;
	public JButton bsiguiente;
	
	
	public Panel_Instrucciones() {
		
		setLayout(null);
		
		titulo = new JLabel("Instrucciones");
		titulo.setBounds(10, 20, 750, 68);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Showcard Gothic",Font.BOLD,54));
		titulo.setForeground(Color.WHITE);
		add(titulo);
		
		texto = new JTextArea("Leer antes de jugar\r\n" + 
				"\r\n" + 
				"- El objetivo del juego es ser el primer jugador en llegar hasta el final moviendote a\r\n" + 
				"traves del tablero de abajo hasta arriba, desde el cuadro inicial al cuadro final.\r\n" + 
				"\r\n" + 
				"- Te puedes mover de izquierda a derecha en la primera fila, despues\r\n" + 
				"subes a la segunda fila y te mueves de derecha a izquierda y asi­ sucesivamente,\r\n" + 
				"sigue los numeros en el tablero para ver hacia donde moverte,\r\n" + 
				"por ejemplo, si te salio un 5 en los dados y estas en el numero 11, entonces\r\n" + 
				"mueve tu ficha al numero 16.\r\n" + 
				"\r\n" + 
				"- El inicio de juego va por este orden, primero el juegador 1,\r\n" + 
				"despues el jugador 2 y asi sucesivamente.\r\n" + 
				"\r\n" + 
				"- Las escaleras en el tablero te permiten subir para avanzar con mas rapidez,\r\n" + 
				"pero antes deberas contestar una pregunta del reglamento estudiantil de\r\n" + 
				"la Universidad el Bosque si la contestas corectamente subiras por la escalera,\r\n" + 
				"de lo contrario no podras subir. Si caes en un cuadro que muestra la imagen del\r\n" + 
				"inicio de la escalera, entonces puedes mover tu pieza por toda la escalera hasta\r\n" + 
				"donde termina. Si caes en la parte superior de la escalera o en un cuadro a la\r\n" + 
				"mitad de la escalera, te tienes que quedar en ese mismo lugar no te puedes mover\r\n" + 
				" hacia abajo en las escaleras.\r\n" + 
				"\r\n" + 
				"- Las serpientes hacen que te muevas hacia atras en el tablero ya que te tienes que\r\n" + 
				"deslizar por ellas si caes exactamente en un cuadro donde esta la cola de la\r\n" + 
				"serpiente, tienes que contestar una pregunta, si la contestas bien sigues normal\r\n" + 
				"tu juego, si la contestas mal tendras que llevar tu ficha hasta donde esta la\r\n" + 
				"cabeza de la serpiente, esto te hara retrasar en tu juego.\r\n" + 
				"\r\n" + 
				"- Y los mas importante de todo... disfruta el juego :)");
		texto.setBounds(100, 100, 600, 340);
		texto.setFont(new Font("Berlin Sans FB",Font.TRUETYPE_FONT,20));
		texto.setLineWrap(true);
		texto.setWrapStyleWord(true);
		texto.setEditable(false);
		add(texto);
		
		barraDesplazamiento = new JScrollPane(texto);
		barraDesplazamiento.setBounds(100, 100, 600, 340);
		add(barraDesplazamiento);
		
		bsiguiente = new JButton("Siguiente");
		bsiguiente.setBounds(280, 460, 200, 60);
		bsiguiente.setFont(new Font("Century Gothic",Font.BOLD,24));
		bsiguiente.setOpaque(true);
		bsiguiente.setBackground(Color.WHITE);
		add(bsiguiente);
		
	}
	
}
