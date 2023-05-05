package ProyectoIdes;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.*;

public class libros extends JDialog implements ActionListener {
	JTextField busc = new JTextField(20);
	static JFrame frame = new JFrame();
	JLabel lib1 = new JLabel("Marc y su pitufo");
	JLabel lib2 = new JLabel("Denis y la gallina paquita");
	JLabel lib3 = new JLabel("Maxi Milius el herardo");
	JLabel lib4 = new JLabel("Carpitero un martillo");
	JLabel busqui = new JLabel("Burcar:");
	JButton res1 = new JButton("Reservar");
	JButton res2 = new JButton("Reservar");
	JButton res3 = new JButton("Reservar");
	JButton res4 = new JButton("Reservar");
	private int id_lib,paginas_lib,y=40,x=80,anc=200,lar=25;
	private String titulo_lib,formato_lib,autor_lib,genero_lib,idioma_lib,ISBN_lib,Editorial_lib;

	public libros(int id_lib,int paginas_lib,String titulo_lib,String formato_lib,String autor_lib,
			String genero_lib,String idioma_lib,String ISBN_lib,String Editorial_lib) {
		//Constructor
		
		this.id_lib=id_lib;
		this.paginas_lib=paginas_lib;
		this.titulo_lib=titulo_lib;
		this.formato_lib=autor_lib;
		this.autor_lib=autor_lib;
		this.paginas_lib=paginas_lib;
		this.genero_lib=genero_lib;
		this.idioma_lib=idioma_lib;
		this.ISBN_lib=ISBN_lib;
		this.Editorial_lib=Editorial_lib;
		
		// Añadir cosas
		setLayout(null);
		add(busc);
		add(lib1);
		add(lib2);
		add(lib3);
		add(lib4);
		add(busqui);
		add(res1);
		add(res2);
		add(res3);
		add(res4);
		
		

		// mostrar cosas
		lib1.setBounds(y, x, anc, lar);
		venyres();

		lib2.setBounds(180, 80, anc, lar);
		

		lib3.setBounds(360, 80, anc, lar);
		
		
		lib4.setBounds(540, 80,anc, lar);

		busc.setBounds(880, 0, 100, 25);
		busqui.setBounds(820, 0, 100, 25);

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
		res4.setBounds(5400, 100, anc, lar);
		
		}
	}

}
