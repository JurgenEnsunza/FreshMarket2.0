package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import domain.Cliente;
import domain.Compra;
import domain.ModeloTablaSudadera;
import domain.Producto;
import domain.Sudadera;
import domain.Tienda;
import domain.enums.Talla;


public class VentanaSudadera extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame ventanaSudadera;
	private JButton btnVolver, btnAniadirCarrito, btnVerCarrito;
	private JSpinner unidadesSeleccionar;
	private JSlider rangoPrecio;
	private JScrollPane scrollInformacionEntera;
	private JTextArea verInformacionCompleta;
	
	private JComboBox<Talla> elegirTalla;
	
	private JPanel panelNorte,panelCentro,panelCentroIzquierda,panelCentroDerecha,panelCentroDerechaArriba,panelCentroDerechaAbajo,panelSur,panelNorteIzquierdaArriba,panelNorteIzquierdaAbajo,panelNorteDerechaArriba,panelNorteDerechaAbajo;
	private JLabel lblRangoPrecio,lblUnidades,lblTalla;
	
	
	private ModeloTablaSudadera modeloSudadera;
	private JTable tabla;
	private JScrollPane scrollTabla;
	
	
	
	
	
	
	
	public VentanaSudadera(Cliente cliente){
		setSize(400,300);
		setLocationRelativeTo(null);
		setTitle("Sudaderas");
		
		setVisible(true);
		
	
		ventanaSudadera = this;
		
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
		
		panelNorte.setOpaque(false);
		panelCentro.setOpaque(false);
		panelSur.setOpaque(false);
		
		
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
		rangoPrecio = new JSlider(0,100,0);
		rangoPrecio.setPaintTicks(true);
		rangoPrecio.setPaintLabels(true);
		rangoPrecio.setMinorTickSpacing(15);
		rangoPrecio.setMajorTickSpacing(20);
		panelNorteDerechaAbajo.add(rangoPrecio);
		
		//Creacion ComboBox + Añadir panel
		elegirTalla= new JComboBox<Talla>(Talla.values());
		panelNorteDerechaAbajo.add(elegirTalla);
		
		//Creacion JSpinner + Añadir Panel
		unidadesSeleccionar= new JSpinner();
		panelNorteDerechaAbajo.add(unidadesSeleccionar);
		
		//Creacion Botones
		btnVolver = new JButton("VOLVER");
		btnAniadirCarrito = new JButton ("Comprar");
		btnVerCarrito = new JButton("Ver Compras");
		
		//Añadir Btotones Panel
		panelSur.add(btnVolver);
		panelSur.add(btnAniadirCarrito);
		panelSur.add(btnVerCarrito);
		
		//Creacion JtextArea
		verInformacionCompleta = new JTextArea();
		
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
		
		
		//Eventos
		
		
		
		rangoPrecio.addChangeListener(new ChangeListener() {
             @Override
             public void stateChanged(ChangeEvent e){
                 filtrarSudaderas();
             }
         });
	
        elegirTalla.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e){
                 filtrarSudaderas();
             }
         });
		
		btnVolver.addActionListener(e ->{
			@SuppressWarnings("unused")
			VentanaCatalogo n = new VentanaCatalogo(cliente);
			ventanaSudadera.dispose();
			
			
		});
		
		tabla.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
			Point p = e.getPoint();
			int fila = tabla.rowAtPoint(p);
			String nombre = (String) tabla.getModel().getValueAt(fila, 0);
			Sudadera s = Tienda.buscarSudadera(nombre);
			
			verInformacionCompleta.setText(Tienda.InfoSudaderas(s));
			}
		});
		
		btnAniadirCarrito.addActionListener(e ->{
			int fila = tabla.getSelectedRow();
			String nombre = (String) tabla.getModel().getValueAt(fila, 0);
			Sudadera s = Tienda.buscarSudadera(nombre);
			Tienda.aniadirComprasSudadera(cliente, s, (int) unidadesSeleccionar.getValue());
			System.out.println(Tienda.getCompras());
			
			
			
			
		});
		
		
	}	
		
	
	private void filtrarSudaderas(){
            Talla tallaSeleccionada = (Talla) elegirTalla.getSelectedItem();
            int precioMaximo = rangoPrecio.getValue();
            
            List<Sudadera> sudaderasFiltradas = new ArrayList<>();
            for(Sudadera sudadera : Tienda.getSudaderaLista()){
                if(sudadera.getPrecio() >= precioMaximo && (tallaSeleccionada == null || sudadera.getTalla() == tallaSeleccionada)){
                    sudaderasFiltradas.add(sudadera);
                }
            }
            
            tabla.setModel(new ModeloTablaSudadera(sudaderasFiltradas));
            
        }
	
	
}
