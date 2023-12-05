package gui;

import java.awt.BorderLayout;

import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;





public class VentanaCatalogo extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCamiseta, btnSudadera,btnPantalon ,btnZapatillas, btnCarrito;
	private JPanel panelUnico;
	private JLabel titulo;
	
	
	
	
	public VentanaCatalogo() {
		setSize(400,300);
		setLocationRelativeTo(null);
		setVisible(true);
		panelUnico = new JPanel(new GridLayout());
		
		
		JFrame ventanaCatalogo = this;
		
		//Creacion de los Botones
		btnCamiseta =new JButton("Camisetas");
		btnSudadera =new JButton("Sudaderas");
		btnPantalon =new JButton("Pantalones");
		btnZapatillas =new JButton("Zapatillas");
		btnCarrito = new JButton("Carrito o Perfil");
		
		//Creacion del JLabel
		titulo = new JLabel("CATALOGO DE FRESHMARKET");
		
		//Añadir JLabel(titulo) al norte del panelPrincipal
		add(titulo, BorderLayout.NORTH);
		
		//Añadir los botones al panelUnico
		panelUnico.add(btnCamiseta);
		panelUnico.add(btnSudadera);
	
		panelUnico.add(btnPantalon);
		panelUnico.add(btnZapatillas);
		panelUnico.add(btnCarrito);
		
		//Añadir el panelUnico al centro del panelPrincipal
		add(panelUnico,BorderLayout.CENTER);
	
		//Liseners botonesProductos
		btnCamiseta.addActionListener(e ->{
			
		});
		
		btnSudadera.addActionListener(e ->{
			
			
			new VentanaSudadera(ventanaCatalogo);
			ventanaCatalogo.dispose();
			
			
		});
		
		

		btnPantalon.addActionListener(e ->{
	
		});

		btnZapatillas.addActionListener(e ->{
		
		});

		btnCarrito.addActionListener(e ->{
	
		}); 
		
	}
	  public void mostrarVentana(){
          SwingUtilities.invokeLater(new Runnable(){
              @Override
              public void run(){
                  new VentanaCatalogo();
              }
          });
}
}
	  
