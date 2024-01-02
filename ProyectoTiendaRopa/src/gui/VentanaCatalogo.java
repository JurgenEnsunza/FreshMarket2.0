package gui;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import domain.Cliente;





public class VentanaCatalogo extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCamiseta, btnSudadera,btnPantalon ,btnZapatillas, btnCarrito,btnVolver;
	private JPanel panelUnico;
	private JLabel titulo;
	
	
	
	
	public VentanaCatalogo(Cliente cliente) {
		setSize(500,400);
		setLocationRelativeTo(null);
		setVisible(true);
		panelUnico = new JPanel(new GridLayout());
		
		
		
		
		JFrame ventanaCatalogo = this;
		int anchoBoton = 110;
	    int altoBoton = 400;
		
		//Creacion de los Botones
		//BOTON CAMISETA
	    btnCamiseta =new JButton();
	    ImageIcon iconoOriginalC = new ImageIcon("C:\\\\Users\\\\erabiltzailea\\\\git\\\\FreshMarket2.0\\\\ProyectoTiendaRopa\\\\resources\\\\images\\\\CamisetaFondoBoton.jpg");
		Image imagenOriginalC = iconoOriginalC.getImage();
		Image imagenRedimensionadaC = imagenOriginalC.getScaledInstance(anchoBoton, altoBoton, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionadoC = new ImageIcon(imagenRedimensionadaC);
        btnCamiseta.setIcon(iconoRedimensionadoC);
		//BOTON SUDADERA
		btnSudadera =new JButton();
		ImageIcon iconoOriginalS = new ImageIcon("C:\\\\Users\\\\erabiltzailea\\\\git\\\\FreshMarket2.0\\\\ProyectoTiendaRopa\\\\resources\\\\images\\\\SudaderaFondoBoton.jpg");
		Image imagenOriginalS = iconoOriginalS.getImage();
		Image imagenRedimensionadaS = imagenOriginalS.getScaledInstance(anchoBoton, altoBoton, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionadoS = new ImageIcon(imagenRedimensionadaS);
		btnSudadera.setIcon(iconoRedimensionadoS);
		
		//BOTON PANTALON
		btnPantalon =new JButton();
		ImageIcon iconoOriginalP = new ImageIcon("C:\\\\Users\\\\erabiltzailea\\\\git\\\\FreshMarket2.0\\\\ProyectoTiendaRopa\\\\resources\\\\images\\\\PantalonFondoBoton.jpg");
		Image imagenOriginalP = iconoOriginalP.getImage();
		Image imagenRedimensionadaP = imagenOriginalP.getScaledInstance(anchoBoton, altoBoton, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionadoP = new ImageIcon(imagenRedimensionadaP);
        btnPantalon.setIcon(iconoRedimensionadoP);
		//BOTON ZAPATILLAS
		btnZapatillas =new JButton();
		ImageIcon iconoOriginalZ = new ImageIcon("C:\\\\Users\\\\erabiltzailea\\\\git\\\\FreshMarket2.0\\\\ProyectoTiendaRopa\\\\resources\\\\images\\\\ZapatillaFondoBoton.jpg");
		Image imagenOriginalZ = iconoOriginalZ.getImage();
		Image imagenRedimensionadaZ = imagenOriginalZ.getScaledInstance(anchoBoton, altoBoton, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionadoZ = new ImageIcon(imagenRedimensionadaZ);
        btnZapatillas.setIcon(iconoRedimensionadoZ);
		//BOTON CARRITO
		btnCarrito = new JButton();
		ImageIcon iconoOriginalCA = new ImageIcon("C:\\\\Users\\\\erabiltzailea\\\\git\\\\FreshMarket2.0\\\\ProyectoTiendaRopa\\\\resources\\\\images\\\\CarritoFondoBoton.png");
		Image imagenOriginalCA = iconoOriginalCA.getImage();
		Image imagenRedimensionadaCA = imagenOriginalCA.getScaledInstance(anchoBoton, altoBoton, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionadoCA = new ImageIcon(imagenRedimensionadaCA);
        btnCarrito.setIcon(iconoRedimensionadoCA);
        //BOTON VOLVER
        btnVolver = new JButton();
		ImageIcon iconoOriginalV = new ImageIcon("C:\\\\Users\\\\erabiltzailea\\\\git\\\\FreshMarket2.0\\\\ProyectoTiendaRopa\\\\resources\\\\images\\\\VolverFondoBoton.png");
		Image imagenOriginalV = iconoOriginalV.getImage();
		Image imagenRedimensionadaV = imagenOriginalV.getScaledInstance(anchoBoton, altoBoton, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionadoV = new ImageIcon(imagenRedimensionadaV);
        btnVolver.setIcon(iconoRedimensionadoV);
        
		
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
		panelUnico.add(btnVolver);
		
		//Añadir el panelUnico al centro del panelPrincipal
		add(panelUnico,BorderLayout.CENTER);
	
		//Liseners botonesProductos
		btnCamiseta.addActionListener(e ->{
				
			new VentanaCamiseta(cliente);
			ventanaCatalogo.dispose();		
		});
		
		btnSudadera.addActionListener(e ->{
			
			
			new VentanaSudadera(cliente);
			ventanaCatalogo.dispose();
			
			
		});
		
		btnPantalon.addActionListener(e ->{
			
			new VentanaPantalon(cliente);
			ventanaCatalogo.dispose();
			
	
		});

		btnZapatillas.addActionListener(e ->{
			
			new VentanaZapatilla(cliente);
			ventanaCatalogo.dispose();
			
		
		});

		btnCarrito.addActionListener(e ->{
	
		}); 
		
		btnVolver.addActionListener(e -> {
			new VentanaClienteOpciones(cliente);
			ventanaCatalogo.dispose();
		});
		
	}
	
}
	  
