package Main;

import Objetos.Cliente;
import Objetos.Tienda;
import Ventanas.VentanaInicioSesion;
import Ventanas.VentanaCatalogo;

public class MainPrincipal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("222","222","22","22");
		Tienda.aniadirCliente(c1);

		
	//VentanaInicioSesion v = new VentanaInicioSesion();
	VentanaInicioSesion a = new VentanaInicioSesion();
	
	}
	
}