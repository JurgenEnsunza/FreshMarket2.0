package main;

import domain.Cliente;
import domain.Tienda;
import gui.VentanaInicial;

public class MainPrincipal {

	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("79008192H","Nombre","11/11/2004","222",10.0);
		Tienda.aniadirCliente(c1);
		
		
			
		Tienda.cargarListaSudaderas("C:\\Users\\erabiltzailea\\git\\FreshMarket2.0\\ProyectoTiendaRopa\\ProyectoTiendaRopaDatos\\SudaderasConCapucha.CSV");
	

		new VentanaInicial().setVisible(true);
		
		
	//VentanaInicioSesion v = new VentanaInicioSesion();
	//VentanaInicioSesion a = new VentanaInicioSesion();
	//VentanaSudaderaConCapucha v = new VentanaSudaderaConCapucha(null);
	
	}
	
}
