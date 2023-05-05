package ProyectoIdes;

import javax.swing.*;
import java.awt.event.*;

public class registrar extends JDialog implements ActionListener {
	JTextField no = new JTextField(20);
	JTextField ap = new JTextField(20);
	JTextField cor = new JTextField(20);
	JTextField con = new JTextField(20);
	static JFrame frame = new JFrame();
	JLabel instru = new JLabel("Datos persoanles");
	JLabel not = new JLabel("Datos persoanles");
	JLabel nomber = new JLabel("Nombre");
	JLabel apell = new JLabel("Apellido");
	JLabel coreo = new JLabel("Correo Electronico");
	JLabel contra = new JLabel("Contrasena");
	JButton resg = new JButton("Registrase");
	
	private String nombre,apellido,correo,contrasena;
	private int id_registrar;
	
	public registrar(int id_registrar,String nombre,String apellido,String correo,String contrasena){
		
		
		this.id_registrar=id_registrar;
		this.nombre=nombre;
		this.apellido=apellido;
		this.correo=correo;
		this.contrasena=contrasena;
		
		setLayout(null);
		add(no);
		add(ap);
		add(cor);
		add(con);
		add(instru);
		add(not);
		add(nomber);
		add(apell);
		add(coreo);
		add(contra);
		add(resg);
	
		
		no.setBounds(160, 50, 100, 25);
		ap.setBounds(160, 80, 100, 25);
		cor.setBounds(160, 110, 100, 25);
		con.setBounds(160,140, 100, 25);
		instru.setBounds(140, 20, 130, 25);
		nomber.setBounds(20, 50, 100, 25);
		apell.setBounds(20, 80, 100, 25);
		coreo.setBounds(20, 110, 140, 25);
		contra.setBounds(20,140, 100, 25);
		resg.setBounds(140, 180, 100, 25);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
