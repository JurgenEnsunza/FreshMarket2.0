package domain;

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

import domain.enums.Capucha;
import domain.enums.Largura;
import domain.enums.Talla;
import domain.enums.TipoUso;

public class Tienda {
	private static Set<Producto> articulos = new TreeSet<>();
	private static List<Sudadera> sudaderaLista = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static Map<Cliente,List<Producto>> compras = new TreeMap<>();
	
	public static void aniadirCliente(Cliente c) {
		clientes.add(c);
	
	}	
	
	public static List<Cliente> getClientes() {
		return clientes;
	}

	
    /*
	private static  void aniadirCompras(Cliente  c, Producto a) {
		if (!compras.containsKey(c)) {
			compras.put(c, new ArrayList<>() );
			}
		compras.get(c).add(a);
	 }*/
	
	
	public static void  cargarListaSudaderas(String nombreFichero) {
		try {
			Scanner sc = new Scanner(new FileReader(nombreFichero));
			String linea ;
			@SuppressWarnings("unused")
			String titulos = sc.nextLine();
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
	
	public static List<Sudadera> getSudaderaLista() {
		return sudaderaLista;
	}
	
	public static String InfoSudaderas(Sudadera s) {
		return " La sudadera: " + s.getNombre()
		+ "\n Tipo: " + s.getTipoUsoSudadera()
		+ "\n Talla: " + s.getTalla()
		+ "\n Fue fabricada en: " + s.getPaisFabricado()
		+ "\n Precio actual: " + s.getPrecio()
		+ "\n Es dristribuida por: " + s.getMarca();
		
	}
	
	public static Sudadera buscarSudadera (String nombreBuscado) {
        for (Sudadera sudadera : sudaderaLista) {
            if (sudadera.getNombre().equals(nombreBuscado)) {
                return sudadera;
            }
        }
        return null; // Si no se encuentra el objeto con el nombre especificado
    }

	public static Cliente buscarClientes (String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null; // Si no se encuentra el objeto con el nombre especificado
    }




}
		
		
		
		
		
		
		
				
		

			
			
			
			
			
		
		
	
	
	
	
	


