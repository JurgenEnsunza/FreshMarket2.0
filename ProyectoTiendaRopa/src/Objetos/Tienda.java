package Objetos;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tienda {
	private static Set<Producto> articulos = new TreeSet<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static Map<Cliente,List<Producto>> compras = new TreeMap<>();
	
	private static  void aniadirCompras(Cliente  c, Producto a) {
		if (!compras.containsKey(c)) {
			compras.put(c, new ArrayList<>() );
			
			
		}
		compras.get(c).add(a);
		
		
	}
	
	public static Cliente buscarClientes(String dni) {
		int pos = 0;
		boolean vd = (false);
		Cliente c = null;
		
		while (!vd && pos<clientes.size()) {
			c = clientes.get(pos);
			if (c.getDni().equals(dni)) {
				vd = true;
			}else {
				pos++;
			}
			if(vd==true) {
				return  c;
				}else {
				return null;
				}}
		return null;
	}
			
	public static void aniadirCliente(Cliente c) {
		clientes.add(c);
	
	}	
		
		
		
		
		
		
		
				
		
}
			
			
			
			
			
		
		
	
	
	
	
	


