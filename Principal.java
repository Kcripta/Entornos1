package ProyectoIdes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import tema9.formuini;
import tema9.formusuma;

import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
	JFrame frame=new JFrame();
	libros plib= new libros(0,0,"","","","","","","");
	peliculas ppel = new peliculas ();
	musicas pmus = new musicas(0,0,"","","","");
	documentales pdoc =new documentales(0,0,"","");
	iniciar pini = new iniciar("","");
	registrar pres = new registrar(0,"","","","");
	Usuario Usu= new Usuario(0,"","","","");
	private JMenuBar mb = new JMenuBar();
	private JMenu menu1 = new JMenu("Documentos");
	private JMenu menu2 = new JMenu("Iniciar sesion/Registrarte");
	private JMenu menu3 = new JMenu("Salir");
	JMenuItem lib = new JMenuItem("Libros");
	JMenuItem pel = new JMenuItem("Peliculas");
	JMenuItem mus = new JMenuItem("Musica");
	JMenuItem doc = new JMenuItem("Documentales");
	JMenuItem ini = new JMenuItem("Iniciar sesion");
	JMenuItem res = new JMenuItem("Registrarse");
	JMenuItem sal = new JMenuItem("Salir");

	public Principal() {
		setJMenuBar(mb);
		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);
		lib.addActionListener((ActionListener) this);
		menu1.add(lib);
		pel.addActionListener(this);
		menu1.add(pel);
		mus.addActionListener(this);
		menu1.add(mus);
		doc.addActionListener(this);
		menu1.add(doc);
		ini.addActionListener((ActionListener) this);
		menu2.add(ini);
		res.addActionListener((ActionListener) this);
		menu2.add(res);
		sal.addActionListener(this);
		menu3.add(sal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == lib) {
			plib.setBounds(300, 200, 1000, 500);
			plib.setTitle("Libros");
			plib.setVisible(true);
			plib.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if (e.getSource() == pel) {
			ppel.setBounds(300, 200, 1000, 500);
			ppel.setTitle("Peliculas");
			ppel.setVisible(true);
			ppel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if (e.getSource() == mus) {
			pmus.setBounds(300, 200, 1000, 500);
			pmus.setTitle("Musicas");
			pmus.setVisible(true);
			pmus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if (e.getSource() == doc) {
			pdoc.setBounds(300, 200, 1000, 500);
			pdoc.setTitle("Documentales");
			pdoc.setVisible(true);
			pdoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if (e.getSource() == ini) {
			pini.setBounds(200, 200, 250, 150);
			pini.setTitle("Iniciar sesion");
			pini.setVisible(true);
			pini.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if (e.getSource() == res) {
			pres.setBounds(200, 200, 400, 300);
			pres.setTitle("Registrarse");
			pres.setVisible(true);
			pres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if (e.getSource() == sal) {
			JOptionPane.showMessageDialog(null, "FIN DEL PROGRAMA");
			System.exit(0);
		}
	}

	public static void main(String[] ar) {
		Principal Prin = new Principal();
		Prin.setBounds(150, 150, 1000, 500);
		Prin.setTitle("Biblioteca Asteca");
		Prin.setVisible(true);
		Prin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
