package domain;

import domain.enums.Largura;
import domain.enums.Talla;
import domain.enums.TipoUso;

public class Camiseta extends  Producto {
	
	private Largura larguraCamiseta;
	private TipoUso tipoDeCamiseta;
	
	/**
	 * @param id
	 * @param precio
	 * @param talla
	 * @param paisFabricado
	 * @param unidades
	 * @param marca
	 * @param larguraCamiseta
	 * @param tipoDeCamiseta
	 */
	public Camiseta(String id,String nombre, Double precio, Talla talla, String paisFabricado, int unidades, String marca,
			Largura larguraCamiseta, TipoUso tipoDeCamiseta) {
		super(id,nombre, precio, talla, paisFabricado, unidades, marca);
		this.larguraCamiseta = larguraCamiseta;
		this.tipoDeCamiseta = tipoDeCamiseta;
	}

	/**
	 * @return the larguraCamiseta
	 */
	public Largura getLarguraCamiseta() {
		return larguraCamiseta;
	}

	/**
	 * @param larguraCamiseta the larguraCamiseta to set
	 */
	public void setLarguraCamiseta(Largura larguraCamiseta) {
		this.larguraCamiseta = larguraCamiseta;
	}

	/**
	 * @return the tipoDeCamiseta
	 */
	public TipoUso getTipoDeCamiseta() {
		return tipoDeCamiseta;
	}

	/**
	 * @param tipoDeCamiseta the tipoDeCamiseta to set
	 */
	public void setTipoDeCamiseta(TipoUso tipoDeCamiseta) {
		this.tipoDeCamiseta = tipoDeCamiseta;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
