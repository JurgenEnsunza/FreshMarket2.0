package domain;

import domain.enums.Talla;

public class Producto implements Comparable <Producto> {
	
	
	private String id;
	private String nombre;
	private Double precio;
	private Talla talla;
	private String paisFabricado;
	private int  unidades;
	private String marca;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Talla getTalla() {
		return talla;
	}
	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	public String getPaisFabricado() {
		return paisFabricado;
	}
	public void setPaisFabricado(String paisFabricado) {
		this.paisFabricado = paisFabricado;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Producto(String id, String nombre, Double precio, Talla talla, String paisFabricado, int unidades,
			String marca) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.talla = talla;
		this.paisFabricado = paisFabricado;
		this.unidades = unidades;
		this.marca = marca;
	}
	@Override
	public int compareTo(Producto o) {
		return this.nombre.compareTo(nombre);
	}
	
	
	
	
	
	
	
	
	

}
