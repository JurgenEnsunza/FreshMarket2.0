package Ventanas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class VentanaSudaderaConCapucha extends JFrame {
	private JFrame ventanaSudaderaConCapucha;
	private JButton btnVolver, btnAniadirCarrito, btnVerCarrito;
	private JSpinner unidadesSeleccionar;
	private JSlider rangoPrecio;
	private JScrollPane scrollMirarArticulos;
	private JTextField verInformacionCompleta;
	private JComboBox elegirTalla;
	private JPanel panelNorte,panelCentro,panelCentroIzquierda,panelCentroDerecha,panelSur;
	
	
	
	
	public VentanaSudaderaConCapucha(JFrame ventanaCatalogo){
		setSize(400,300);
		setLocationRelativeTo(null);
		setTitle("Sudaderas Con Capucha");
		setVisible(true);
		
		ventanaSudaderaConCapucha = this;
		
		
		
		
	}

}
