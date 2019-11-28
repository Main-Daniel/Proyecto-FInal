package Vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panel_Boton extends JPanel {
	public JButton b3;
	
public panel_Boton() {
		
		setLayout(null);

		setVisible(true);
		
		b3 = new JButton("3");
		b3.setBounds(50, 250, 100, 100);
		b3.setFont(new Font("Freestyle Script",Font.ROMAN_BASELINE,50));
		add(b3);
	}
}
