package domain;

import domain.enums.Talla;

public class Compra {
	private String idC;
	private String tipoPrenda;
	private String nombrePrenda;
	private Double precio;
	private Talla talla;
	private int unidades;
	public String getIdC() {
		return idC;
	}
	public void setIdC(String idC) {
		this.idC = idC;
	}
	public String getTipoPrenda() {
		return tipoPrenda;
	}
	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	public String getNombrePrenda() {
		return nombrePrenda;
	}
	public void setNombrePrenda(String nombrePrenda) {
		this.nombrePrenda = nombrePrenda;
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
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Compra(String idC, String tipoPrenda, String nombrePrenda, Double precio, Talla talla, int unidades) {
		super();
		this.idC = idC;
		this.tipoPrenda = tipoPrenda;
		this.nombrePrenda = nombrePrenda;
		this.precio = precio;
		this.talla = talla;
		this.unidades = unidades;
	}
	
	

}
