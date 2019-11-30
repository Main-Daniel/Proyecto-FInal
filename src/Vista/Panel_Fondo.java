package Vista;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel_Fondo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public String Url;
	
	public Panel_Fondo(String Url) {
		
		this.Url = Url;
		
	}
	
	public void paintComponent(Graphics g) {
		
		Dimension tamaño = getSize();
		ImageIcon imagenfondo = new ImageIcon(Panel_Fondo.class.getResource(Url));
		g.drawImage(imagenfondo.getImage(), 0, 0, tamaño.width, tamaño.height, null);
		setOpaque(false);
		super.paintComponent(g);
		
	}
	
}