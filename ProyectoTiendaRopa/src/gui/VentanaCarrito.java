package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Cliente;
import domain.ModeloCarrito;

public class VentanaCarrito extends JFrame {
	private JScrollPane scroll;
	private JTable tabla;
	private ModeloCarrito modeloCarrito;

		public VentanaCarrito(Cliente c) {
			setSize(400,300);
			
			modeloCarrito = new ModeloCarrito(null);
			tabla = new JTable(modeloCarrito);
			scroll = new JScrollPane(tabla);
			getContentPane().add(scroll,BorderLayout.CENTER);
			
		}
	
	
	
	
	

}
