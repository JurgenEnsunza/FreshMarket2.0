package domain;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import domain.enums.Capucha;
import domain.enums.Largura;
import domain.enums.Talla;
import domain.enums.TipoUso;

public class Tienda {
	private static List<Sudadera> sudaderaLista = new ArrayList<>();
	private static List<Pantalon> pantalonLista = new ArrayList<>();
	private static List<Camiseta> camisetaLista = new ArrayList<>();
	private static List<Zapatilla> zapatillaLista = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static Map<Cliente,List<Compra>> compras = new HashMap<>();
	
	//METODOS CLIENTE
	public static void aniadirCliente(Cliente c) {
		clientes.add(c);
	}	
	
	public static List<Cliente> getClientes() {
		return clientes;
	}
	
	public static Cliente buscarClientes (String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null; // Si no se encuentra el objeto con el nombre especificado
    }
	
    //METODOS AÑADIR COMPRAS
	@SuppressWarnings("unused")
	public static  void aniadirComprasSudadera(Cliente  c,  Sudadera s, int unidades) {
		if (!compras.containsKey(c)) {
			compras.put(c, new ArrayList<Compra>() );
			}
			Compra nuevaCompra = new Compra(s.getId(),"Sudadera", s.getNombre(), s.getPrecio(), s.getTalla(), unidades);
			compras.get(c).add(nuevaCompra);
	 }
	public static  void aniadirComprasZapatilla(Cliente  c, Zapatilla z,int unidades) {
		if (!compras.containsKey(c)) {
			compras.put(c, new ArrayList<Compra>() );
			}
			Compra nuevaCompra = new Compra(z.getId(),"Zapatilla", z.getNombre(), z.getPrecio(), z.getTalla(), unidades);
			compras.get(c).add(nuevaCompra);
	 }
	public static  void aniadirComprasPantalon(Cliente  c, Pantalon p,int unidades) {
		if (!compras.containsKey(c)) {
			compras.put(c, new ArrayList<Compra>() );
			}
			Compra nuevaCompra = new Compra(p.getId(),"Pantalon", p.getNombre(), p.getPrecio(), p.getTalla(), unidades);
			compras.get(c).add(nuevaCompra);
	 }
	public static  void aniadirComprasCamiseta(Cliente  c,Camiseta ca ,int unidades) {
		if (!compras.containsKey(c)) {
			compras.put(c, new ArrayList<Compra>() );
			}
			Compra nuevaCompra = new Compra(ca.getId(),"Camiseta", ca.getNombre(), ca.getPrecio(), ca.getTalla(), unidades);
			compras.get(c).add(nuevaCompra);
	 }
	
	//METODOS CARGAR LISTAS DE PRODUCTOS EN PROYECTO
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
	
	public static void  cargarListaZapatilla(String nombreFichero) {
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
				TipoUso tipoUso = TipoUso.valueOf(partes[7]);
				Zapatilla zapatilla = new Zapatilla(id,nombre,precio,talla,paisFrabrica,unidades,marca,tipoUso);
				zapatillaLista.add(zapatilla);
			}
				sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void  cargarListaCamiseta(String nombreFichero) {
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
				Camiseta camiseta = new Camiseta(id,nombre,precio,talla,paisFrabrica,unidades,marca,largura,tipoUso);
				camisetaLista.add(camiseta);
			}
				sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void  cargarListaPantalon(String nombreFichero) {
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
				Pantalon pantalon = new Pantalon(id,nombre,precio,talla,paisFrabrica,unidades,marca,largura,tipoUso);
				pantalonLista.add(pantalon);
			}
				sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// METODOS GET DE LAS LISTAS DE LOS PRODUCTOS
	public static List<Sudadera> getSudaderaLista() {
		return sudaderaLista;
	}
	
	public static List<Pantalon> getPantalonLista() {
		return pantalonLista;
	}

	public static List<Camiseta> getCamisetaLista() {
		return camisetaLista;
	}

	public static List<Zapatilla> getZapatillaLista() {
		return zapatillaLista;
	}

	//METODOS INFORMACION DE PRENDAS
	public static String InfoSudaderas(Sudadera s) {
		return " La sudadera: " + s.getNombre()
		+ "\n Tipo: " + s.getTipoUsoSudadera()
		+ "\n Talla: " + s.getTalla()
		+ "\n Fue fabricada en: " + s.getPaisFabricado()
		+ "\n Precio actual: " + s.getPrecio()
		+ "\n Es dristribuida por: " + s.getMarca();
		
	}
	public static String InfoZapatilla(Zapatilla z) {
		return " La sudadera: " + z.getNombre()
		+ "\n Tipo: " + z.getTipoZapatilla()
		+ "\n Talla: " + z.getTalla()
		+ "\n Fue fabricada en: " + z.getPaisFabricado()
		+ "\n Precio actual: " + z.getPrecio()
		+ "\n Es dristribuida por: " + z.getMarca();
		
	}
	public static String InfoPantalon(Pantalon p) {
		return " La sudadera: " + p.getNombre()
		+ "\n Tipo: " + p.getLarguraPantalon()
		+ "\n Talla: " + p.getTalla()
		+ "\n Fue fabricada en: " + p.getPaisFabricado()
		+ "\n Precio actual: " + p.getPrecio()
		+ "\n Es dristribuida por: " + p.getMarca();
		
	}
	public static String InfoCamiseta(Camiseta ca) {
		return " La sudadera: " + ca.getNombre()
		+ "\n Tipo: " + ca.getLarguraCamiseta()
		+ "\n Talla: " + ca.getTalla()
		+ "\n Fue fabricada en: " + ca.getPaisFabricado()
		+ "\n Precio actual: " + ca.getPrecio()
		+ "\n Es dristribuida por: " + ca.getMarca();
		
	}
	//METODOS BUSCAR PRENDA
	public static Sudadera buscarSudadera (String nombreBuscado) {
        for (Sudadera sudadera : sudaderaLista) {
            if (sudadera.getNombre().equals(nombreBuscado)) {
                return sudadera;
            }
        }
        return null; // Si no se encuentra el objeto con el nombre especificado
    }
	public static Zapatilla buscarZapatilla (String nombreBuscado) {
        for (Zapatilla zapatilla : zapatillaLista) {
            if (zapatilla.getNombre().equals(nombreBuscado)) {
                return zapatilla;
            }
        }
        return null; // Si no se encuentra el objeto con el nombre especificado
    }
	public static Pantalon buscarPantalon (String nombreBuscado) {
        for (Pantalon pantalon : pantalonLista) {
            if (pantalon.getNombre().equals(nombreBuscado)) {
                return pantalon;
            }
        }
        return null; // Si no se encuentra el objeto con el nombre especificado
    }
	public static Camiseta buscarCamiseta (String nombreBuscado) {
        for (Camiseta camiseta : camisetaLista) {
            if (camiseta.getNombre().equals(nombreBuscado)) {
                return camiseta;
            }
        }
        return null; // Si no se encuentra el objeto con el nombre especificado
    }

	




}
		
		
		
		
		
		
		
				
		

			
			
			
			
			
		
		
	
	
	
	
	


