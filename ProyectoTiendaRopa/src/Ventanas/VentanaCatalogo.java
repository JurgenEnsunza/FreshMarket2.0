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
	
	
	private JButton btn1, btn2, btn3,btn4 ,btn5, btn6;
	private JPanel panelUnico, panelNorte;
	private JLabel titulo;
	private JFrame ventanaCatalogo,ventanaInicio;
	
	
	
	
	

	public VentanaCatalogo(JFrame ventanaInicio) {
		setSize(400,300);
		setVisible(true);
		panelUnico = new JPanel(new GridLayout(2,3));
		ventanaCatalogo = this;
		
		btn1 =new JButton("Camisetas");
		btn2 =new JButton("Sudaderas con Capucha");
		btn3 =new JButton("Sudaderas sin Capucha");
		btn4 =new JButton("Pantalones");
		btn5 =new JButton("Zapatillas");
		btn6 = new JButton("Carrito o Perfil");
		
		titulo = new JLabel("CATALOGO DE FRESHMARKET");
			
		panelUnico.add(btn1);
		panelUnico.add(btn2);
		panelUnico.add(btn3);
		panelUnico.add(btn4);
		panelUnico.add(btn5);
		panelUnico.add(btn6);
	
		setContentPane(panelUnico);
		
		btn1.addActionListener(e ->{
			
			
			
			
		});
		
		
		
		
	}
	
	
	
}