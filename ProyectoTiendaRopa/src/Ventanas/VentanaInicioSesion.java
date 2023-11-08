package Ventanas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Objetos.Cliente;
import Objetos.Tienda;

public class VentanaInicioSesion extends JFrame{
	private JButton  btnIniciarSesionCliente,    btnIniciarSesionAdmin,     btnRegistrarseCliente;
	private JPanel   pNorte,    pSur,    pCentro,   pCentroIzquierda,   pCentroDerecha, panelDNIinicio, panelDNIregistro, panelCONTRAinicio, panelCONTRAregistro, panelFECHANACIMIENTOregistro, panelNOMBREregistro ;
	private JLabel   lblDNIregistro, lblNOMBREregistro, lblFECHANACIMIENTOregistro, lblCONTRAregistro, lblDNIinicio, lblCONTRAinicio, tituloInicio, tituloRegistro;
	private JTextField   txtDNIregistro, txtDNIinicio, txtFECHANACIMIENTOregistro, txtNOMBREregistro;
	private JPasswordField   txtCONTRAregistro,      txtCONTRAinicio;
	private JFrame ventanaCatalogo, ventanaInicio;
	private Font fuenteReg,fuenteInicio;
	
	
	//private static final String nomficheroClientes = "Clientes.csv";
	  
	

	public VentanaInicioSesion() {
		// TODO Auto-generated constructor stub
		setSize(1280,400);
		setTitle("Fresh Market");
		setResizable(false);
		setLocationRelativeTo(null);
		ventanaInicio = this;
		
		//Creacion de la distribucion del PanelPrincipal
		pNorte = new JPanel(new GridLayout(1, 2));
		pCentro = new JPanel(new GridLayout(1, 2));
		pSur = new JPanel();
		pCentroIzquierda = new JPanel(new GridLayout(2, 2));
		panelDNIinicio = new JPanel(new GridLayout(3,0));
		panelCONTRAinicio = new JPanel(new GridLayout(3,0));
		pCentroDerecha = new JPanel(new GridLayout(4, 2));
		panelDNIregistro =  new JPanel(new GridLayout(3,0));
		panelNOMBREregistro = new JPanel(new GridLayout(3,0));
		panelFECHANACIMIENTOregistro = new JPanel(new GridLayout(3,0));
		panelCONTRAregistro = new JPanel(new GridLayout(3,0));
		pCentro.add(pCentroIzquierda);
		pCentro.add(pCentroDerecha);
		getContentPane().add(pNorte, BorderLayout.NORTH);
		getContentPane().add(pCentro, BorderLayout.CENTER);
		getContentPane().add(pSur, BorderLayout.SOUTH);
		
		
		//Labeles + textFields + Modificacion Letras
		lblDNIregistro = new  JLabel("       -DNI: ");
		fuenteReg= new Font(Font.SANS_SERIF, Font.ITALIC,27);
		fuenteInicio= new Font(Font.SANS_SERIF, Font.ITALIC,35);
		lblDNIregistro.setFont(fuenteReg);
		lblNOMBREregistro = new JLabel("       -Nombre: ");
		lblNOMBREregistro.setFont(fuenteReg);
		lblFECHANACIMIENTOregistro = new JLabel("        -Fecha Nacimiento: ");
		lblFECHANACIMIENTOregistro.setFont(fuenteReg);
		lblCONTRAregistro = new JLabel ("        -Contraseña: ");
		lblCONTRAregistro.setFont(fuenteReg);
		lblDNIinicio = new JLabel ("    -DNI: ");
		lblDNIinicio.setFont(fuenteInicio);
		lblCONTRAinicio = new JLabel("    -Contraseña: ");
		lblCONTRAinicio.setFont(fuenteInicio);
		txtDNIregistro = new JTextField();
		txtDNIinicio = new JTextField();
		txtNOMBREregistro = new  JTextField();
		txtFECHANACIMIENTOregistro = new JTextField();
		txtCONTRAinicio = new JPasswordField();
		txtCONTRAregistro = new  JPasswordField();
		
		//Añadiendo los labels y txtField a los paneles
		pCentroIzquierda.add(lblDNIinicio);
		pCentroIzquierda.add(panelDNIinicio);
		panelDNIinicio.add(new JPanel());
		panelDNIinicio.add(txtDNIinicio);
		panelDNIinicio.add(new JPanel());
		pCentroIzquierda.add(lblCONTRAinicio);
		pCentroIzquierda.add(panelCONTRAinicio);
		panelCONTRAinicio.add(new JPanel());
		panelCONTRAinicio.add(txtCONTRAinicio);
		panelCONTRAinicio.add(new JPanel());
		
		
		pCentroDerecha.add(lblDNIregistro);	
		pCentroDerecha.add(panelDNIregistro);
		panelDNIregistro.add(new JPanel());
		panelDNIregistro.add(txtDNIregistro);
		panelDNIregistro.add(new JPanel());
		
		
		pCentroDerecha.add(lblNOMBREregistro);
		pCentroDerecha.add(panelNOMBREregistro);
		panelNOMBREregistro.add(new JPanel());
		panelNOMBREregistro.add(txtNOMBREregistro);
		panelNOMBREregistro.add(new JPanel());
		
		
		pCentroDerecha.add(lblFECHANACIMIENTOregistro);
		pCentroDerecha.add(panelFECHANACIMIENTOregistro);
		panelFECHANACIMIENTOregistro.add(new JPanel());
		panelFECHANACIMIENTOregistro.add(txtFECHANACIMIENTOregistro);
		panelFECHANACIMIENTOregistro.add(new JPanel());
		
		
		pCentroDerecha.add(lblCONTRAregistro);
		pCentroDerecha.add(panelCONTRAregistro);
		panelCONTRAregistro.add(new JPanel());
		panelCONTRAregistro.add(txtCONTRAregistro);
		panelCONTRAregistro.add(new JPanel());
		
		//Creacion Botones
		btnIniciarSesionAdmin=new JButton("Inicio Sesion como Administrador ");
		btnIniciarSesionCliente = new JButton("Inicia Sesion como Cliente ");
		btnRegistrarseCliente= new JButton("Registrate");
		
		//Añadiendo los botones
		pSur.add(btnIniciarSesionAdmin);
		pSur.add(btnIniciarSesionCliente);
		pSur.add(btnRegistrarseCliente);
		
		//Creando los titulos
		tituloInicio= new JLabel("INICIA SESION AQUI");
		tituloRegistro = new JLabel("REGISTRATE AQUI");
		
		//Añadiendo los titulos
		pNorte.add(tituloInicio);
		pNorte.add(tituloRegistro);
		
		//Eventos botones
		btnRegistrarseCliente.addActionListener((e)->{
			String dni = txtDNIregistro.getText();
			String nom = txtNOMBREregistro.getText();
			String fNac = txtFECHANACIMIENTOregistro.getText();
			String con = txtCONTRAregistro.getText();
			Cliente c = new Cliente(dni, nom, fNac, con );
			if(Tienda.buscarClientes(dni)!=null) {
				JOptionPane.showMessageDialog(null, "Ya existe un cliente con ese dni","ERROR",JOptionPane.ERROR_MESSAGE);
				
			}else {
				Tienda.aniadirCliente(c);
				JOptionPane.showMessageDialog(null, "Cliente registrado con éxito","REGISTRADO",JOptionPane.INFORMATION_MESSAGE);
				System.out.println(c);
			}
			limpiarTEXTOS();
		});
		
		btnIniciarSesionCliente.addActionListener((e)->{
			String dni = txtDNIinicio.getText();
			String con = txtCONTRAinicio.getText();
			
			if (Tienda.buscarClientes(dni)!=null && Tienda.buscarClientes(dni).getContraseña().equals(con)) {
				
					JOptionPane.showMessageDialog(null, "Has iniciado sesion como cliente ","Incio Sesion", JOptionPane.INFORMATION_MESSAGE);
				new VentanaCatalogo(ventanaInicio);
			ventanaInicio.dispose();
					
			
			}else if (Tienda.buscarClientes(dni)!= null && Tienda.buscarClientes(dni).getContraseña() != con)  {
				JOptionPane.showMessageDialog(null, "la contraseña esta mal ","Incio Sesion", JOptionPane.INFORMATION_MESSAGE);
			
			}else {
				JOptionPane.showMessageDialog(null,"Tienes que registrarte como cliente","Incio Sesion",JOptionPane.INFORMATION_MESSAGE);
				}
			limpiarTEXTOS();
			
		});
		setVisible(true);
	
	
	}	//Metodo para limpiar el texto escrito anteriormente en JtextFields
				public void limpiarTEXTOS() {
				txtDNIinicio.setText("");
				txtCONTRAinicio.setText("");
				txtDNIregistro.setText("");
				txtNOMBREregistro.setText("");
				txtFECHANACIMIENTOregistro.setText("");
				txtCONTRAregistro.setText("");
				
				
			}
	
		
	
	

}
