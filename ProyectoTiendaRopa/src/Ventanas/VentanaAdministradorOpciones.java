package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAdministradorOpciones extends JFrame {
    //FALTA QUE SE VEA DESDE LA OTRA CLASE AL ACCEDER COMO ADMIN D:
    
    public VentanaAdministradorOpciones(){
        
        //super("Panel de administrador");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));
        setVisible(true);
        setTitle("Fresh Market - Opciones administrador");
        
        //botones
        JButton btnVerStock = new JButton("Ver Stock");
        JButton btnBeneficiosTotales = new JButton("Beneficios totales");
        JButton btnInfoClientes = new JButton("Información de clientes");
                        //añadir extras aqui
        JButton btnCerrarSesion = new JButton("Cerrar sesion"); //este, por estetica, debe ser el ultimo
        
        //Listener a cada boton
        btnVerStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            //Logica para ver el stock
                JOptionPane.showMessageDialog(null, "Mostrando información...");
            }
        });
        
        btnBeneficiosTotales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            //Logica para ver el stock
                JOptionPane.showMessageDialog(null, "Calculando y mostrando info...");
            }
        });
        
        btnInfoClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            //Logica para ver el stock
                JOptionPane.showMessageDialog(null, "Mostrando información de clientes...");
            }
        });
        
        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            //Logica para ver el stock
                int opcion = JOptionPane.showConfirmDialog(null, "Seguro que deseas cerrar sesion?");
                if(opcion == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Cerrando sesión.");
                    dispose();
                    VentanaInicial ventanaInicial = new VentanaInicial();
                    ventanaInicial.mostrarVentana();  //Seguir haciendo programa aqui.
                }
            }
        });
        
        //Agregar botones
        add(btnVerStock);
        add(btnBeneficiosTotales);
        add(btnInfoClientes);
        add(btnCerrarSesion);
        
        //
        
        
    }
    
    public void mostrarVentana(){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new VentanaAdministradorOpciones();
            }
        });
    }
    
}