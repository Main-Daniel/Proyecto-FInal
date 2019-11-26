package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel_Instrucciones extends JPanel {
	
	public JButton botonsiguiente;
	public JLabel etiqueta;
	private JTextArea intruc;
	public JScrollPane barraDesplazamiento;

	public Panel_Instrucciones() {

		setLayout(null);

		inicializarComponentes();
		inicializarBarra();

		setVisible(true);

	}

	public void inicializarComponentes() {
		
		botonsiguiente = new JButton("SIGUIENTE");
		botonsiguiente.setBounds(220, 570, 130, 60);
		botonsiguiente.setBackground(Color.cyan);
		botonsiguiente.setFont(new Font("forte",Font.ROMAN_BASELINE,16));
		add(botonsiguiente);
	
		intruc = new JTextArea("INSTRUCCIONES DE JUEGO:\n" + "Leer antes de jugar\n\n" + "- El objetivo del juego es ser el primer jugador en llegar hasta el final moviéndote a\r\n" + 
				"través del tablero de abajo hasta arriba, desde el cuadro inicial al cuadro final.\r\n" + 
				"\r\n" + "\r\n" + 
				"- Te puedes mover de izquierda a derecha en la primera fila, después\r\n" + 
				"subes a la segunda fila y te mueves de derecha a izquierda y así sucesivamente,\r\n" + 
				"sigue los números en el tablero para ver hacia dónde moverte,\r\n" + 
				"por ejemplo, si te salió un 5 en los dados y estás en el número 11, entonces\r\n" + 
				"mueve tu ficha al número 16.\r\n" + 
				"\r\n" + "\r\n" +
				"- El inicio de juego va por este orden, primero el juegador 1,\r\n" + 
				"despues el jugador 2 y asi sucesivamente.\r\n" + 
				"\r\n" + "\r\n" +
				"- Las escaleras en el tablero te permiten subir para avanzar con más rapidez,\r\n" + 
				"pero antes deberas contestar una pregunta del reglamento estudiantil de\r\n" + 
				"la Universidad el Bosque si la contestas corectamente subiras por la escalera,\r\n" + 
				"de lo contrario no podras subir. Si caes en un cuadro que muestra la imagen del\r\n" + 
				"inicio de la escalera, entonces puedes mover tu pieza por toda la escalera hasta\r\n" + 
				"donde termina. Si caes en la parte superior de la escalera o en un cuadro a la\r\n" + 
				"mitad de la escalera, te tienes que quedar en ese mismo lugar no te puedes mover" + "\r\n" +
				" hacia abajo en las escaleras." + "\r\n" + "\r\n" + "\r\n" +
				"- Las serpientes hacen que te muevas hacia atrás en el tablero ya que te tienes que\r\n" + 
				"deslizar por ellas si caes exactamente en un cuadro donde está la cola de la\r\n" + 
				"serpiente, tienes que contestar una pregunta, si la contestas bien sigues normal\r\n" + 
				"tu juego, si la contestas mal tendras que llevar tu ficha hasta donde está la\r\n" + 
				"cabeza de la serpiente, esto te hara retrasar en tu juego." + "\r\n" + "\r\n" + "\r\n" +
				"- Y los mas importante de todo... disfruta el juego :)");
		intruc.setBounds(20, 85,550,450);
		intruc.setEnabled(true);
		intruc.setFont(new Font("Franklin Gothic Heavy",Font.TRUETYPE_FONT,13));
		intruc.setEditable(false);
	    intruc.setLineWrap(true);
	    intruc.setWrapStyleWord(true);
		add(intruc);

		etiqueta = new JLabel("Como Jugar");
		etiqueta.setBounds(10, 10, 300, 50);
		etiqueta.setFont(new Font("forte",Font.ROMAN_BASELINE,40));
		etiqueta.setForeground(Color.orange);
		add(etiqueta);
		
	}
	
	public void inicializarBarra() {
		
		barraDesplazamiento = new JScrollPane(intruc);
		barraDesplazamiento.setBounds(10, 85, 559, 465);
		add(barraDesplazamiento);
	}
}