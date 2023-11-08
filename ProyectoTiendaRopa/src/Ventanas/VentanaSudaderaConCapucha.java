package Ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Objetos.ModeloTablaSudadera;
import Objetos.Sudadera;
import Objetos.Talla;
import Objetos.Tienda;

public class VentanaSudaderaConCapucha extends JFrame {
	private JFrame ventanaSudaderaConCapucha;
	private JButton btnVolver, btnAniadirCarrito, btnVerCarrito;
	private JSpinner unidadesSeleccionar;
	private JSlider rangoPrecio;
	private JScrollPane scrollMirarArticulos,scrollInformacionEntera;
	private JTextArea verInformacionCompleta,titulo;
	private JComboBox<Talla> elegirTalla;
	private JPanel panelNorte,panelCentro,panelCentroIzquierda,panelCentroDerecha,panelCentroDerechaArriba,panelCentroDerechaAbajo,panelSur,panelNorteIzquierdaArriba,panelNorteIzquierdaAbajo,panelNorteDerechaArriba,panelNorteDerechaAbajo;
	private JLabel lblRangoPrecio,lblUnidades,lblTalla;
	
	
	private ModeloTablaSudadera modeloSudadera;
	private JTable tabla;
	private JScrollPane scrollTabla;
	
	
	
	
	
	public VentanaSudaderaConCapucha(JFrame ventanaCatalogo){
		setSize(400,300);
		setLocationRelativeTo(null);
		setTitle("Sudaderas Con Capucha");
		setVisible(true);
		
		ventanaSudaderaConCapucha = this;
		
		//Creacion Distribuciones del panel
		panelNorte = new JPanel(new GridLayout(2,2));
		panelNorteIzquierdaArriba = new JPanel();
		panelNorteIzquierdaAbajo = new JPanel();
		panelNorteDerechaArriba = new JPanel(new GridLayout(1,3));
		panelNorteDerechaAbajo = new JPanel(new GridLayout(1,3));
		
		panelCentro= new JPanel(new GridLayout(1,2));
		panelCentroIzquierda= new JPanel();
		panelCentroDerecha = new JPanel(new GridLayout(2,1));
		panelCentroDerechaArriba=new JPanel();
		panelCentroDerechaAbajo=new JPanel();
		
		panelSur = new JPanel(new GridLayout(1,2));
		getContentPane().add(panelNorte,BorderLayout.NORTH);
		getContentPane().add(panelCentro,BorderLayout.CENTER);
		getContentPane().add(panelSur,BorderLayout.SOUTH);
		panelCentro.add(panelCentroIzquierda);
		panelCentro.add(panelCentroDerecha);
		panelCentroDerecha.add(panelCentroDerechaArriba);
		panelCentroDerecha.add(panelCentroDerechaAbajo);
		panelNorte.add(panelNorteIzquierdaArriba);
		panelNorte.add(panelNorteDerechaArriba);
		panelNorte.add(panelNorteIzquierdaAbajo);
		panelNorte.add(panelNorteDerechaAbajo);
		
		//Creacion lbl + añadir al los paneles
		lblRangoPrecio = new JLabel("Elije el precio maximo: ");
		panelNorteDerechaArriba.add(lblRangoPrecio);
		lblTalla= new JLabel("Indique que talla desea: ");
		panelNorteDerechaArriba.add(lblTalla);
		lblUnidades= new JLabel("Elije cuantas unidades dese comprar: ");
		panelNorteDerechaArriba.add(lblUnidades);
		
		//Creacion Slider + añadir panel
		rangoPrecio = new JSlider();
		panelNorteDerechaAbajo.add(rangoPrecio).setSize(100,100);
		
		//Creacion ComboBox + Añadir panel
		elegirTalla= new JComboBox<Talla>(Talla.values());
		panelNorteDerechaAbajo.add(elegirTalla);
		
		//Creacion JSpinner + Añadir Panel
		unidadesSeleccionar= new JSpinner();
		panelNorteDerechaAbajo.add(unidadesSeleccionar);
		
		//Creacion Botones
		btnVolver = new JButton("VOLVER");
		btnAniadirCarrito = new JButton ("Añadir articulo al Carrito");
		btnVerCarrito = new JButton("Ver Carrito");
		
		//Añadir Btotones Panel
		panelSur.add(btnVolver);
		panelSur.add(btnAniadirCarrito);
		panelSur.add(btnVerCarrito);
		
		//Creacion JtextArea
		verInformacionCompleta = new JTextArea(80,80);
		
		//Creacion ScrollInformacionEntera y añadir
		scrollInformacionEntera = new JScrollPane(verInformacionCompleta);
		panelCentroDerechaAbajo.add(scrollInformacionEntera);
		
		//Creacion Tabla
		modeloSudadera = new ModeloTablaSudadera(null);
		tabla = new JTable(modeloSudadera);
		scrollTabla = new JScrollPane(tabla);
		panelCentroIzquierda.add(scrollTabla);
		List<Sudadera> sudadera = Tienda.getSudaderaLista();
		tabla.setModel(new ModeloTablaSudadera(sudadera));
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	}

}
