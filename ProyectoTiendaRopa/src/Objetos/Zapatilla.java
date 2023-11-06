package Objetos;
public class Zapatilla extends Producto{	

	private TipoUso tipoZapatilla;

	/**
	 * @return the tipoZapatilla
	 */
	public TipoUso getTipoZapatilla() {
		return tipoZapatilla;
	}

	/**
	 * @param tipoZapatilla the tipoZapatilla to set
	 */
	public void setTipoZapatilla(TipoUso tipoZapatilla) {
		this.tipoZapatilla = tipoZapatilla;
	}

	/**
	 * @param id
	 * @param precio
	 * @param talla
	 * @param paisFabricado
	 * @param unidades
	 * @param marca
	 * @param tipoZapatilla
	 */
	public Zapatilla(String id, Double precio, Talla talla, String paisFabricado, int unidades, String marca,
			TipoUso tipoZapatilla) {
		super(id, precio, talla, paisFabricado, unidades, marca);
		this.tipoZapatilla = tipoZapatilla;
	}

	
	@Override
	public String toString() {
		return "Zapatilla [tipoZapatilla=" + tipoZapatilla + ", getId()=" + getId() + ", getPrecio()=" + getPrecio()
				+ ", getTalla()=" + getTalla() + ", getPaisFabricado()=" + getPaisFabricado() + ", getUnidades()="
				+ getUnidades() + ", getMarca()=" + getMarca() + "]";
	}

	
	
	
	
	

}
