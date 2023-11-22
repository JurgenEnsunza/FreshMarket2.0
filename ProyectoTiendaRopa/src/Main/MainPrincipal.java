package Main;

import Objetos.Cliente;
import Objetos.Tienda;
import Ventanas.VentanaInicioSesion;
import Ventanas.VentanaSudaderaConCapucha;
import Ventanas.VentanaCatalogo;
import Ventanas.VentanaInicial;

public class MainPrincipal {

	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("79008192H","Nombre","11/11/2004","222");
		Tienda.aniadirCliente(c1);
		
		Tienda.cargarListaSudaderas("C:\\Users\\erabiltzailea\\git\\FreshMarket2.0\\ProyectoTiendaRopa\\ProyectoTiendaRopaDatos\\SudaderasConCapucha.CSV");
		new VentanaInicial().setVisible(true);
		
		
	//VentanaInicioSesion v = new VentanaInicioSesion();
	//VentanaInicioSesion a = new VentanaInicioSesion();
	//VentanaSudaderaConCapucha v = new VentanaSudaderaConCapucha(null);
	
	}
	
}
