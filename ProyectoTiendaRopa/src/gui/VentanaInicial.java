package gui;

import javax.swing.*;

import domain.Cliente;
import domain.Tienda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VentanaInicial extends JFrame {
    public VentanaInicial(){
        setTitle("Nombre de la tienda - inicio de sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,1));
        
        //Creo 3 botones
        JButton btnAdmin = new JButton("Soy administrador");
        JButton btnCliente = new JButton("Soy cliente");
        JButton btnRegistrarme = new JButton("Registrarme");
        
        // Agregar a ventana
        /*JPanel panel = new JPanel();
        panel.add(btnAdmin);
        panel.add(btnCliente);
        panel.add(btnRegistrarme);
        
        add(panel);*/
        
        add(btnAdmin);
        add(btnCliente);
        add(btnRegistrarme);
        
        
        
        //Accion para el boton de administrador
        btnAdmin.addActionListener((ActionEvent e) ->{
            VentanaAdministrador ventanaAdmin = new VentanaAdministrador();
            ventanaAdmin.setVisible(true);
            setVisible(false);
            
        });
        
        //Accion para el boton de cliente
        btnCliente.addActionListener((ActionEvent e) ->{
            VentanaCliente ventanaCliente = new VentanaCliente();
            ventanaCliente.setVisible(true);
            setVisible(false);
        });
        
        //Accion para el boton de registro
        btnRegistrarme.addActionListener((ActionEvent e) ->{
            VentanaRegistro ventanaRegis = new VentanaRegistro();
            ventanaRegis.setVisible(true);
        });

    }
    
    
    public void mostrarVentana(){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                setVisible(true);
            }
        });
    }
    
}

class VentanaAdministrador extends JFrame {
    private String[][] datosUsuarios = {
        {"Usuario1", "contraseña1"},
        {"Usuario2", "contraseña2"},
        {"Usuario3", "contraseña3"}};
    
    public VentanaAdministrador(){
        setTitle("Nombre de la tienda - sesión administrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,150);
        setLayout(new BorderLayout());
        
        //panel para usuairo y contrseña
        JPanel panelCampos = new JPanel(new GridLayout(2, 2));
        
        //etiquetas y campos de texto
        JLabel lblUsuario = new JLabel("Usuario: ");
        JTextField txtUsuario = new JTextField();
        JLabel lblContraseña = new JLabel("Contraseña: ");
        JPasswordField txtContrasena = new JPasswordField();
        
        panelCampos.add(lblUsuario);
        panelCampos.add(txtUsuario);
        panelCampos.add(lblContraseña);
        panelCampos.add(txtContrasena);
        
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnOK = new JButton("OK");
        
        //Agregamos el actionListener del boton
        btnOK.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e){
                //Acciones que se realizan al pulsar el boton
                String usuario = txtUsuario.getText();
                char[] contrasenaChars = txtContrasena.getPassword();
                String contrasena = new String(contrasenaChars);
                //Aqui realizas la verificación de los usuarios
                if(verificarUsuario(usuario, contrasena)){
                    JOptionPane.showMessageDialog(null, "¡Inicio de sesion exitoso!");
                    setVisible(false);
                    VentanaAdministradorOpciones ventanaOpAdmin = new VentanaAdministradorOpciones();
                    ventanaOpAdmin.mostrarVentana();
                    
                    //añadir Visibilidad ventana admin
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "usuario o contraseña incorrectos.");
                }
            }
        });
        
        panelBoton.add(btnOK);
        
        //Agregar paneles al JFrame
        add(panelCampos, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    //Metodos de verificacion
    private boolean verificarUsuario(String usuario, String contrasena){
        for(String[] usuarioInfo : datosUsuarios){
            if(usuarioInfo[0].equals(usuario) && usuarioInfo[1].equals(contrasena)){
                return true;
            }
        }
        
        return false;
        
    }
 
}

class VentanaCliente extends JFrame {
    
   
    public  VentanaCliente(){
        setTitle("Nombre de la tienda - sesión cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,150);
        setLayout(new BorderLayout());
        
        //panel para usuairo y contrseña
        JPanel panelCampos = new JPanel(new GridLayout(2, 2));
        
        //etiquetas y campos de texto
        JLabel lblDni = new JLabel("DNI: ");
        JTextField txtDni = new JTextField();
        JLabel lblContraseña = new JLabel("Contraseña: ");
        JPasswordField txtContrasena = new JPasswordField();
        
        panelCampos.add(lblDni);
        panelCampos.add(txtDni);
        panelCampos.add(lblContraseña);
        panelCampos.add(txtContrasena);
        
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnOK = new JButton("OK");
        
        //Agregamos el actionListener del boton
        btnOK.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e){
                //Acciones que se realizan al pulsar el boton
                String dni = txtDni.getText();
            	char[] contrasenaChars = txtContrasena.getPassword();
                String contrasena = new String(contrasenaChars);
                //Aqui realizas la verificación de los usuarios
                if( Tienda.buscarClientes(dni) != null && Tienda.buscarClientes(dni).getContraseña().equals(contrasena)  ){
                    JOptionPane.showMessageDialog(null, "¡Inicio de sesion exitoso!");
                    setVisible(false);
                    VentanaClienteOpciones ventanaClienteOp = new VentanaClienteOpciones(Tienda.buscarClientes(dni));
                    ventanaClienteOp.mostrarVentana();
                } else if (Tienda.buscarClientes(dni)==null){
                    JOptionPane.showMessageDialog(null, "Tienes que registrarte");
                }else {
                	JOptionPane.showMessageDialog(null, "Los datos son incorrectos.");
                }
            }
        });
        
        panelBoton.add(btnOK);
        
        //Agregar paneles al JFrame
        add(panelCampos, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    //Metodos de verificacion
   
    /*private boolean verificarUsuario(String usuario, String contrasena){
        for(String[] usuarioInfo : datosUsuarios){
            if(usuarioInfo[0].equals(usuario) && usuarioInfo[1].equals(contrasena)){
                return true;
            }
        }
        return false;
    }*/
    
    
}

class VentanaRegistro extends JFrame {
    public VentanaRegistro(){
        setTitle("Nombre de la tienda - registro");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Contenido de la ven de registro
        JPanel panel = new JPanel();
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //establecer disposicion vertical
        
        //¿seguidos?
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        
        
        JTextField dniField = new JTextField(15);
        JTextField nombreField = new JTextField(15);
        JTextField fechaNacimientoField = new JTextField(15);
        JPasswordField contraseñaField = new JPasswordField(15);
        JButton registrarButton = new JButton("Registo");
        
        //evento del botón
        registrarButton.addActionListener((ActionEvent e) ->{
            String dni = dniField.getText();
            String nombre = nombreField.getText();
            String fechaNacimiento = fechaNacimientoField.getText();
            String contraseña = new String(contraseñaField.getPassword());
            
            if(verificarDNI(dni) && verificarNombre(nombre) && verificarFecha(fechaNacimiento)&& Tienda.buscarClientes(dni) == null){
                JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
                Cliente nueva = new Cliente(dni,nombre,fechaNacimiento,contraseña,0.0);
                Tienda.aniadirCliente(nueva);
                
                setVisible(false);
            } else if(Tienda.buscarClientes(dni) != null && verificarDNI(dni) && verificarNombre(nombre) && verificarFecha(fechaNacimiento))  {
                JOptionPane.showMessageDialog(null, "¡Cliente ya registrado!");
            }else {
            	JOptionPane.showMessageDialog(null,"Error en los datos introducidos");
            }
        });
        
        //agregar componentes
        /*panel.add(new JLabel("DNI: "));
        panel.add(dniField);
        
        panel.add(new JLabel("Nombre: "));
        panel.add(nombreField);
        */
        add(new JLabel("DNI:"), gbc);
        gbc.gridx++;
        add(dniField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        
        add(new JLabel("Nombre:"), gbc);
        gbc.gridx++;
        add(nombreField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        
        add(new JLabel("Fecha de nacimiento:"), gbc);
        gbc.gridx++;
        add(fechaNacimientoField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        
        add(new JLabel("contraseña:"), gbc);
        gbc.gridx++;
        add(contraseñaField, gbc);
        
        gbc.gridx = 1;
        gbc.gridy++;
        
        add(registrarButton, gbc);
        
        
        
        /*
        panel.add(new JLabel("Fecha de Nacimiento: "));
        panel.add(fechaNacimientoField);
        
        panel.add(new JLabel("Contraseña: "));
        panel.add(contraseñaField);
        panel.add(Box.createVerticalStrut(2));
        
        panel.add(registrarButton);
        */
        add(panel);
        setVisible(true);
        
    }
    
    //metodos
    private boolean verificarDNI(String dni){
        if(dni.matches("\\d{8}[A-HJ-NP-TV-Z]")){ 
            String numerosDNI = dni.substring(0, 8); 
            String letraDNI = dni.substring(8).toUpperCase();
            
            //Calcular la letra asociada al dni
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int numero = Integer.parseInt(numerosDNI) % 23;
            char letraEsperada = letras.charAt(numero);
            
            return letraDNI.charAt(0) == letraEsperada;
                        
        } else {
            return false;
        }
        
        //return dni.matches("\\d{8}[A-HJ-NP-TV-Z]")
    }
    
    private boolean verificarNombre(String nombre){
        return nombre.matches("[a-zA-Z ]+");
    }
    
    private boolean verificarFecha(String fecha){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); //determina que el analisis sea estricto
        
        try{
            dateFormat.parse(fecha);
            return true; //si la fecha es valida
        } catch(ParseException e){
            return false;
        }
        
    }
    
}