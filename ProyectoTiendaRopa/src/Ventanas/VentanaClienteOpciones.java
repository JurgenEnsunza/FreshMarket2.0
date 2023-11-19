package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaClienteOpciones extends JFrame{
    
    public VentanaClienteOpciones(){
        //super("Panel de Cliente"); //titulo ventana?
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,1));
        setVisible(true); 
        setTitle("FreshMarket - Opciones cliente");
        
        //botones
        JButton btnVerStock = new JButton("Ver stock");
        JButton btnEditarPerfil = new JButton("Editar perfil");
        JButton btnCerrarSesion = new JButton("Cerrar sesión");
        
        //Listener botón stock
        btnVerStock.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "mostrando Stock");
            }
        });
        
        //Listener botón editar perfil        
        btnEditarPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            //Logica para ver el stock
                JOptionPane.showMessageDialog(null, "Mostrando información de clientes...");
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
        
    } // fin constructor
    
    //Metodos
    public void mostrarVentana(){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new VentanaClienteOpciones();
            }
        });
    }
    
} //Fin clase de gestion