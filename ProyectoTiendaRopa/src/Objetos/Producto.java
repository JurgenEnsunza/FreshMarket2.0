package Objetos;

public class Producto {
	
	
	private String id;
	private Double precio;
	private Talla talla;
	private String paisFabricado;
	private int  unidades;
	private String marca;
	/**
	 * @param id
	 * @param precio
	 * @param talla
	 * @param paisFabricado
	 * @param unidades
	 * @param marca
	 */
	public Producto(String id, Double precio, Talla talla, String paisFabricado, int unidades, String marca) {
		super();
		this.id = id;
		this.precio = precio;
		this.talla = talla;
		this.paisFabricado = paisFabricado;
		this.unidades = unidades;
		this.marca = marca;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	/**
	 * @return the talla
	 */
	public Talla getTalla() {
		return talla;
	}
	/**
	 * @param talla the talla to set
	 */
	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	/**
	 * @return the paisFabricado
	 */
	public String getPaisFabricado() {
		return paisFabricado;
	}
	/**
	 * @param paisFabricado the paisFabricado to set
	 */
	public void setPaisFabricado(String paisFabricado) {
		this.paisFabricado = paisFabricado;
	}
	/**
	 * @return the unidades
	 */
	public int getUnidades() {
		return unidades;
	}
	/**
	 * @param unidades the unidades to set
	 */
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", talla=" + talla + ", paisFabricado=" + paisFabricado
				+ ", unidades=" + unidades + ", marca=" + marca + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
