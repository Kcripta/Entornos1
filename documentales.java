package ProyectoIdes;

import javax.swing.*;
import java.awt.event.*;

public class documentales extends JDialog implements ActionListener {
	JTextField busc = new JTextField(20);
	static JFrame frame2 = new JFrame();
	JLabel doc1 = new JLabel("Mr.Liberint natural");
	JLabel doc2 = new JLabel("Los Enigmas biologicos");
	JLabel doc3 = new JLabel("Como desviar la bala");
	JLabel dbusqui = new JLabel("Burcar:");
	JButton res1 = new JButton("Reservar");
	JButton res2 = new JButton("Reservar");
	JButton res3 = new JButton("Reservar");
	private String nombre_do,formato_do;
	private int id_doc,duracion_do,y=40,x=80,anc=200,lar=25;;
	
	public documentales(int id_doc,int duracion_do,String nombre_do,String formato_do) {
		this.id_doc=id_doc;
		this.duracion_do=duracion_do;
		this.nombre_do=nombre_do;
		this.formato_do=formato_do;
		
		// Añadir cosas
				setLayout(null);
				add(busc);
				add(doc1);
				add(doc2);
				add(doc3);
				add(dbusqui);
				add(res1);
				add(res2);
				add(res3);
				
				

				// mostrar cosas
				doc1.setBounds(y, x, anc, lar);
				venyres();

				doc2.setBounds(180, 80, anc, lar);
				

				doc3.setBounds(360, 80, anc, lar);


				busc.setBounds(880, 0, 100, 25);
				dbusqui.setBounds(820, 0, 100, 25);

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
