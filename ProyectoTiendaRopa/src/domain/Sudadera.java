package domain;

import domain.enums.Capucha;
import domain.enums.Largura;
import domain.enums.Talla;
import domain.enums.TipoUso;

public class Sudadera  extends Producto {
	
	private Largura larguraSudadera;
	private TipoUso TipoUsoSudadera;
	private Capucha Gorro;
	/**
	 * @return the larguraSudadera
	 */
	public Largura getLarguraSudadera() {
		return larguraSudadera;
	}
	/**
	 * @param larguraSudadera the larguraSudadera to set
	 */
	public void setLarguraSudadera(Largura larguraSudadera) {
		this.larguraSudadera = larguraSudadera;
	}
	/**
	 * @return the tipoUsoSudadera
	 */
	public TipoUso getTipoUsoSudadera() {
		return TipoUsoSudadera;
	}
	/**
	 * @param tipoUsoSudadera the tipoUsoSudadera to set
	 */
	public void setTipoUsoSudadera(TipoUso tipoUsoSudadera) {
		TipoUsoSudadera = tipoUsoSudadera;
	}
	/**
	 * @return the gorro
	 */
	public Capucha getGorro() {
		return Gorro;
	}
	/**
	 * @param gorro the gorro to set
	 */
	public void setGorro(Capucha gorro) {
		Gorro = gorro;
	}
	/**
	 * @param id
	 * @param precio
	 * @param talla
	 * @param paisFabricado
	 * @param unidades
	 * @param marca
	 * @param larguraSudadera
	 * @param tipoUsoSudadera
	 * @param gorro
	 */
	public Sudadera(String id,String nombre, Double precio, Talla talla, String paisFabricado, int unidades, String marca,
			Largura larguraSudadera, TipoUso tipoUsoSudadera, Capucha gorro) {
		super(id,nombre, precio, talla, paisFabricado, unidades, marca);
		this.larguraSudadera = larguraSudadera;
		TipoUsoSudadera = tipoUsoSudadera;
		Gorro = gorro;
	}
	
	
	

}
