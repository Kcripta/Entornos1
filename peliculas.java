package ProyectoIdes;

import javax.swing.*;
import java.awt.event.*;

public class peliculas extends JDialog implements ActionListener {
	JTextField busc = new JTextField(20);
	static JFrame frame3 = new JFrame();
	JLabel pel1 = new JLabel("Marc y su pitufo");
	JLabel pel2 = new JLabel("Denis y la gallina paquita");
	JLabel pel3 = new JLabel("Maxi Milius el herardo");
	JLabel Pbusqui = new JLabel("Burcar:");
	JButton res1 = new JButton("Reservar");
	JButton res2 = new JButton("Reservar");
	JButton res3 = new JButton("Reservar");
	
	
	private int y=40,x=80,anc=200,lar=25;
	public peliculas() {
		
		// Añadir cosas
				setLayout(null);
				add(busc);
				add(pel1);
				add(pel2);
				add(pel3);
				add(Pbusqui);
				add(res1);
				add(res2);
				add(res3);

				
				

				// mostrar cosas
				pel1.setBounds(y, x, anc, lar);
				venyres();

				pel2.setBounds(180, 80, anc, lar);
				

				pel3.setBounds(360, 80, anc, lar);

				busc.setBounds(880, 0, 100, 25);
				Pbusqui.setBounds(820, 0, 100, 25);

			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			public void venyres () {
				
				if(Usuario.Id_Usu>=1) {
				res1.setBounds(40, 100, anc, lar);
				res2.setBounds(180, 100, anc, lar);
				res3.setBounds(360, 100, anc, lar);
	
				}
			}


}
