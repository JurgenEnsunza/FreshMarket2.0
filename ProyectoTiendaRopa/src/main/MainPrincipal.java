package main;

import java.sql.Connection;
import java.sql.SQLException;

import db.BD;
import domain.Cliente;
import domain.Tienda;
import gui.VentanaInicial;

public class MainPrincipal {

	
	
	public static void main(String[] args) {
		
		
		
		
		Connection con = BD.initBD();
		BD.cargarPersonasEnLista(con);
		BD.closeBD();
		
		
		// TODO Auto-generated method stub
		Cliente c2 = new Cliente("99999999R","Nombre","11/11/2004","222",10.0);
		Cliente c3 = new Cliente("12345678F","Nombre","11/11/2004","222",10.0);
	
		Tienda.aniadirCliente(c2);		
		Tienda.aniadirCliente(c3);		
		
			
		Tienda.cargarListaSudaderas("C:\\Users\\erabiltzailea\\git\\FreshMarket2.0\\ProyectoTiendaRopa\\resources\\data\\SudaderasConCapucha.CSV");
		System.out.println(Tienda.getSudaderaLista());
		System.out.println(Tienda.getClientes());

		new VentanaInicial().setVisible(true);
		
		
	//VentanaInicioSesion v = new VentanaInicioSesion();
	//VentanaInicioSesion a = new VentanaInicioSesion();
	//VentanaSudaderaConCapucha v = new VentanaSudaderaConCapucha(null);
	
	}
	
}
