package Vista;

import javax.swing.JFrame;

public class Ventana_Principal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panel_Fondo panelfondo;
	public Panel_OpcionesMenuPrincipal panel1;
	public Panel_Instrucciones panel2;
	public Panel_NumeroJugadores panel3;
	public Panel_DosJugadores panel4;
	public Panel_TresJugadores panel4_1;
	public Panel_CuatroJugadores panel4_2;
	
	public Ventana_Principal() {
		
		setSize(800,600);
		setTitle("Menu Principal Serpientes Y Escaleras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		inicializarPaneles();
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void inicializarPaneles() {
		
		panel1 = new Panel_OpcionesMenuPrincipal();
		panel1.setBounds(0, 0, 785, 561);
		panel1.setOpaque(false);
		add(panel1);
		
		panel2 = new Panel_Instrucciones();
		panel2.setBounds(0, 0, 785, 561);
		panel2.setOpaque(false);
		panel2.setVisible(false);
		panel2.setEnabled(false);
		add(panel2);
		
		panel3 = new Panel_NumeroJugadores();
		panel3.setBounds(10, 10, 380, 340);
		panel3.setOpaque(false);
		panel3.setVisible(false);
		panel3.setEnabled(false);
		add(panel3);
		
		panel4 = new Panel_DosJugadores();
		panel4.setBounds(10, 10, 785, 561);
		panel4.setOpaque(false);
		panel4.setVisible(false);
		panel4.setEnabled(false);
		add(panel4);
		
		panel4_1 = new Panel_TresJugadores();
		panel4_1.setBounds(10, 10, 785, 561);
		panel4_1.setOpaque(false);
		panel4_1.setVisible(false);
		panel4_1.setEnabled(false);
		add(panel4_1);
		
		panel4_2 = new Panel_CuatroJugadores();
		panel4_2.setBounds(10, 10, 785, 561);
		panel4_2.setOpaque(false);
		panel4_2.setVisible(false);
		panel4_2.setEnabled(false);
		add(panel4_2);
		
		panelfondo = new Panel_Fondo();
		panelfondo.setBounds(0, 0, 794, 571);
		add(panelfondo);
		
		
		
	}
	
}