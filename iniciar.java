package ProyectoIdes;

import javax.swing.*;
import java.awt.event.*;

public class iniciar extends JDialog implements ActionListener {
	JTextField musu = new JTextField(25);
	JTextField mcon = new JTextField(25);
	static JFrame frame = new JFrame();
	JLabel usu = new JLabel("Usuario:");
	JLabel cont= new JLabel("Contraseña");
	JButton inic = new JButton("Iniciar");
	private String Usuario,contrasena;
	
	public iniciar(String Usuario,String contrasena) {
		this.Usuario=Usuario;
		this.contrasena=contrasena;
		
		setLayout(null);
		add(musu);
		add(mcon);
		add(usu);
		add(cont);
		add(inic);
		
		musu.setBounds(100, 30, 100, 25);
		mcon.setBounds(100, 60, 100, 25);
		usu.setBounds(20, 30, 100, 25);
		cont.setBounds(20,60, 100, 25);
		inic.setBounds(60, 90, 100, 25);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
