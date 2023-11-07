package Ventanas;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class VentanaCatalogo extends JFrame {
	
	
	private JButton btnCamiseta, btnSudaderaConCapucha, btnSudaderaSinCapucha,btnPantalon ,btnZapatillas, btnCarrito;
	private JPanel panelUnico;
	private JLabel titulo;
	private JFrame ventanaCatalogo;
	
	
	
	
	

	public VentanaCatalogo(JFrame ventanaInicio) {
		setSize(400,300);
		setLocationRelativeTo(null);
		setVisible(true);
		panelUnico = new JPanel(new GridLayout(2,3));
		
		ventanaCatalogo = this;
		
		//Creacion de los Botones
		btnCamiseta =new JButton("Camisetas");
		btnSudaderaConCapucha =new JButton("Sudaderas con Capucha");
		btnSudaderaSinCapucha =new JButton("Sudaderas sin Capucha");
		btnPantalon =new JButton("Pantalones");
		btnZapatillas =new JButton("Zapatillas");
		btnCarrito = new JButton("Carrito o Perfil");
		
		//Creacion del JLabel
		titulo = new JLabel("CATALOGO DE FRESHMARKET");
		
		//Añadir JLabel(titulo) al norte del panelPrincipal
		add(titulo, BorderLayout.NORTH);
		
		//Añadir los botones al panelUnico
		panelUnico.add(btnCamiseta);
		panelUnico.add(btnSudaderaConCapucha);
		panelUnico.add(btnSudaderaSinCapucha);
		panelUnico.add(btnPantalon);
		panelUnico.add(btnZapatillas);
		panelUnico.add(btnCarrito);
		
		//Añadir el panelUnico al centro del panelPrincipal
		add(panelUnico,BorderLayout.CENTER);
	
		//Liseners botonesProductos
		btnCamiseta.addActionListener(e ->{
			
		});
		
		btnSudaderaConCapucha.addActionListener(e ->{
			
			
			new VentanaSudaderaConCapucha(ventanaCatalogo);
			ventanaCatalogo.dispose();
			
			
		});
		
		btnSudaderaSinCapucha.addActionListener(e ->{
			
		});

		btnPantalon.addActionListener(e ->{
	
		});

		btnZapatillas.addActionListener(e ->{
		
		});

		btnCarrito.addActionListener(e ->{
	
		}); 
		
	}
}
