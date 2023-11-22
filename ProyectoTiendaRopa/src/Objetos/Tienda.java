package Objetos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tienda {
	private static Set<Producto> articulos = new TreeSet<>();
	private static List<Sudadera> sudaderaLista = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static Map<Cliente,List<Producto>> compras = new TreeMap<>();
	
	
	
	
	
	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static List<Sudadera> getSudaderaLista() {
		return sudaderaLista;
	}

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
	
	public static void  cargarListaSudaderas(String nombreFichero) {
		try {
			Scanner sc = new Scanner(new FileReader(nombreFichero));
			String titulos = sc.nextLine();
			String linea ;
			while(sc.hasNext()) {
				linea = sc.nextLine();
				String [] partes = linea.split(";");
				String id = partes[0];
				String nombre = partes[1];
				Double precio = Double.parseDouble(partes[2]);
				Talla talla = Talla.valueOf(partes[3]);
				String paisFrabrica = partes[4];
				int unidades = Integer.parseInt(partes[5]);
				String marca = partes[6];
				Largura largura = Largura.valueOf(partes[7]);
				TipoUso tipoUso = TipoUso.valueOf(partes[8]);
				Capucha capucha = Capucha.valueOf(partes[9]);
				Sudadera sudadera = new Sudadera(id,nombre,precio,talla,paisFrabrica,unidades,marca,largura,tipoUso,capucha);
				sudaderaLista.add(sudadera);
				}
				
				
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
		
		
		
		
		
		
		
				
		

			
			
			
			
			
		
		
	
	
	
	
	


