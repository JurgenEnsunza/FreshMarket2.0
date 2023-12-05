package gui;

import javax.swing.*;

import domain.Cliente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaClienteOpciones extends JFrame{
	private Cliente cliente;
    
    public VentanaClienteOpciones(Cliente cliente){
        //super("Panel de Cliente"); //titulo ventana?
    	this.cliente = cliente;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,1));
        setVisible(true); 
        setTitle("FreshMarket - Opciones cliente");
        
        //botones
        JButton btnVerStock = new JButton("Ver Productos");
        JButton btnEditarPerfil = new JButton("Editar perfil");
        JButton btnCerrarSesion = new JButton("Cerrar sesión");
        
        //Listener botón stock
        btnVerStock.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "mostrando Stock");
                VentanaCatalogo venCatalogo = new VentanaCatalogo();
                venCatalogo.mostrarVentana();
                
                
                
            }
        });
        
        //Listener botón editar perfil        
        btnEditarPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            //Logica para ver el stock
                JOptionPane.showMessageDialog(null, "Mostrando información de clientes...");
                VentanaEditarPerfil ventanaEditarPerfil = new VentanaEditarPerfil(cliente );
                
                //implementar metodo gestion clientes
                //Datos del cliente??
                    //nombre, apellido, genero, telefono, email, direccion, dni, fecha nacimiento
                
            }
        });
        
        //Listener botón cerrar sesion
        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            //Logica para ver el stock
                int opcion = JOptionPane.showConfirmDialog(null, "Seguro que deseas cerrar sesion?");
                if(opcion == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Cerrando sesión.");
                    dispose();
                    VentanaInicial ventanaInicial = new VentanaInicial();
                    ventanaInicial.mostrarVentana();
                }
            }
        });
        
        //añadimos los botones
        add(btnVerStock);
        add(btnEditarPerfil);
        add(btnCerrarSesion);
        
    } 
    public void mostrarVentana(){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                setVisible(true);
            }
        });
    }

    class VentanaEditarPerfil extends JFrame{
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Cliente cliente;
	    private JTextField  txtNuevaContrasena;
	    private JTextField  txtAgregarDinero;
	    private JLabel      lblSaldo;
	    
	    public VentanaEditarPerfil(Cliente ventanaClienteOpciones){
	        this.cliente = ventanaClienteOpciones;
	        
	        setTitle("FreshMarket - Editar perfil");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400,250);
	        setLocationRelativeTo(null);
	        setLayout(new GridLayout(4, 2));
	        
	        txtNuevaContrasena = new JTextField();
	        txtAgregarDinero = new JTextField();
	        lblSaldo = new JLabel ("Saldo actual: " + ventanaClienteOpciones.getSaldo());
	        
	        JButton btnCambiarContrasena = new JButton("Cambiar contraseña");
	        JButton btnAgregarDinero = new JButton("Agregar dinero");
	        
	        btnCambiarContrasena.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent e){
	                String nuevaContraseña = txtNuevaContrasena.getText();
	                ventanaClienteOpciones.setContraseña(nuevaContraseña);
	                JOptionPane.showMessageDialog(null, "Contraseña cambiada con exito.");
	            }
	        });
	        
	        
	        btnAgregarDinero.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent e){
	               try{
	                   double cantidad = Double.parseDouble(txtAgregarDinero.getText());
	                   Thread hiloCarga = new Thread(new Runnable() {
	                       @Override
	                       public void run(){
	                           try{
	                               Thread.sleep(3000);
	                           } catch(InterruptedException  ex){
	                               ex.printStackTrace();
	                           }
	                           ventanaClienteOpciones.setSaldo(ventanaClienteOpciones.getSaldo() + cantidad);
	                           lblSaldo.setText("Saldo actual: " + ventanaClienteOpciones.getSaldo());
	                           JOptionPane.showMessageDialog(null, "Dinero añadido.");
	                       }
	                   });
	                   hiloCarga.start();
	               } catch(NumberFormatException ex){
	                   JOptionPane.showMessageDialog(null, "Introduce un numero válido.");
	               }
	            }
	        });
	        
	        add(new JLabel("Nueva contraseña: "));
	        add(txtNuevaContrasena);
	        add(new JLabel("Agregar dinero: "));
	        add(txtAgregarDinero);
	        add(btnCambiarContrasena);
	        add(btnAgregarDinero);
	        add(lblSaldo);
	        
	        setVisible(true);
	        
	        
	        
	    }
    
    	
    // fin constructor
	   
	   
    }
}
    
 //Fin clase de gestion