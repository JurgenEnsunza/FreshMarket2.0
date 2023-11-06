package Objetos;

public class Pantalon extends Producto{
	
	private Largura larguraPantalon;
	private TipoUso tipoDePantalon;
	
	
	
	
	/**
	 * @param id
	 * @param precio
	 * @param talla
	 * @param paisFabricado
	 * @param unidades
	 * @param marca
	 * @param larguraPantalon
	 * @param tipoDePantalon
	 */
	public Pantalon(String id, Double precio, Talla talla, String paisFabricado, int unidades, String marca,
			Largura larguraPantalon, TipoUso tipoDePantalon) {
		super(id, precio, talla, paisFabricado, unidades, marca);
		this.larguraPantalon = larguraPantalon;
		this.tipoDePantalon = tipoDePantalon;
	}

	public Largura getLarguraPantalon() {
		return larguraPantalon;
	}
	
	public void setLarguraPantalon(Largura larguraPantalon) {
		this.larguraPantalon = larguraPantalon;
	}
	
	public TipoUso getTipoDePantalon() {
		return tipoDePantalon;
	}
	
	public void setTipoDePantalon(TipoUso tipoDePantalon) {
	
		this.tipoDePantalon = tipoDePantalon;
	}

	@Override
	public String toString() {
		return "Pantalon [larguraPantalon=" + larguraPantalon + ", tipoDePantalon=" + tipoDePantalon + ", getId()="
				+ getId() + ", getPrecio()=" + getPrecio() + ", getTalla()=" + getTalla() + ", getPaisFabricado()="
				+ getPaisFabricado() + ", getUnidades()=" + getUnidades() + ", getMarca()=" + getMarca() + "]";
	}
	
	
	
	
	
	

	
	
	
	


	
	
	

	
	
	
	
	
	
}
