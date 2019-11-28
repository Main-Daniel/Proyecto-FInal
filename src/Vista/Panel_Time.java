package Vista;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;



public class Panel_Time extends JPanel{

	public String times;
	public int mins;
	public int segs;
	Timer tiempo = new Timer();
	
	TimerTask time = new TimerTask() {

			int min = 5;
			int seg = 0;
			String timer = min + ":" + seg;

			@Override
			public void run() {

				times.setText(Integer.toString(min) + ":" + "0" + Integer.toString(seg));

				if (seg > 9) {
					etiqueta_timer.setText(Integer.toString(min) + ":" + Integer.toString(seg));

				} else if (seg >= 0 && seg < 10) {

					etiqueta_timer.setText(Integer.toString(min) + ":" + "0" + Integer.toString(seg));

				} else if (seg < 0) {
					min--;
					seg = 59;
					etiqueta_timer.setText(Integer.toString(min) + ":" + Integer.toString(seg));

				}
				seg--;
				if (min == 0 && seg < 00) {
					tim.cancel();
					vnt_matriz.setVisible(false);
					vnt_perdedor = new Ventana_Perdedor();
					
				}
				tim.schedule(task, 10, 1000);
			}
		
		
	};
	
}





