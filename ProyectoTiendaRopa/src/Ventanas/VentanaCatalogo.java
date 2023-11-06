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
	
	
	
	

	public VentanaCatalogo() {
		setSize(400,300);
		setVisible(true);
		panelUnico = new JPanel(new GridLayout(2,3));
		
		btn1 =new JButton("Camisetas");
		btn2 =new JButton("Sudaderas con Capucha");
		btn3 =new JButton("Sudaderas sin Capucha");
		btn4 =new JButton("Pantalones");
		btn5 =new JButton("Zapatillas");
		btn6 = new JButton("Carrito o Perfil");
		
		titulo = new JLabel("CATALOGO DE FRESHMARKET");
		
		
		/*panelNorte = new JPanel(new GridLayout(1,0));
		panelNorte.add(titulo);
		
		getContentPane().add(panelNorte,BorderLayout.NORTH);*/
		
		
		panelUnico.add(btn1);
		panelUnico.add(btn2);
		panelUnico.add(btn3);
		panelUnico.add(btn4);
		panelUnico.add(btn5);
		panelUnico.add(btn6);
	
		setContentPane(panelUnico);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
