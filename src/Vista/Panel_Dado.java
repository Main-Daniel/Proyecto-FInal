package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Dado extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel etiquetadado;
	public JButton boton;

	public Panel_Dado() {

		etiquetadado = new JLabel();
		add(etiquetadado);

	}

}