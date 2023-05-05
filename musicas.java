package ProyectoIdes;

import javax.swing.*;
import java.awt.event.*;

public class musicas extends JDialog implements ActionListener {
	JTextField busc = new JTextField(20);
	static JFrame frame5 = new JFrame();
	JLabel mus1 = new JLabel("Marc y su pitufo");
	JLabel mus2 = new JLabel("Denis y la gallina paquita");
	JLabel mus3 = new JLabel("Maxi Milius el herardo");
	JLabel mbusqui = new JLabel("Burcar:");
	JButton res1 = new JButton("Reservar");
	JButton res2 = new JButton("Reservar");
	JButton res3 = new JButton("Reservar");
	
	
	private String artista,nombre,genero,formato;
	private int id_mus,duracion,y=40,x=80,anc=200,lar=25;;
	
	public musicas(int id_mus,int duracion,String artista,String nombre,String genero,String formato) {
		this.id_mus=id_mus;
		this.duracion=duracion;
		this.artista=artista;
		this.nombre=nombre;
		this.genero=genero;
		this.formato=formato;
		
		// Añadir cosas
				setLayout(null);
				add(busc);
				add(mus1);
				add(mus2);
				add(mus3);
				add(mbusqui);
				add(res1);
				add(res2);
				add(res3);
				
				

				// mostrar cosas
				mus1.setBounds(y, x, anc, lar);
				venyres();

				mus2.setBounds(180, 80, anc, lar);
				

				mus3.setBounds(360, 80, anc, lar);
				

				busc.setBounds(880, 0, 100, 25);
				mbusqui.setBounds(820, 0, 100, 25);

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
