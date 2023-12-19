package domain;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class ModeloCarrito extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	private List<Compra> compra;
	private List<String> titulos = Arrays.asList("N.Compra","TIPO ARTICULO","NOMBRE PRODUCTO","PRECIO","Talla","Unidades");
	
	public ModeloCarrito(List<Compra> ls) {
		compra = ls;
	}

	@Override
	public int getRowCount() {
		if(compra == null)
			return 0;
		return compra.size();
		
	}

	@Override
	public int getColumnCount() {
		return titulos.size();
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return titulos.get(column);
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		 return false;
	}

	@Override
	public Object getValueAt(int row, int column) {
		Compra c = compra.get(row);
		switch(column) {
			case 0: return c.getIdC();
			case 1: return c.getTipoPrenda();
			case 2: return c.getNombrePrenda();
			case 3: return c.getPrecio();
			case 4: return c.getTalla();
			case 5: return c.getUnidades();
			default: return null;
		}
		
	}
	   public void setSudaderas(List<Compra> compra){
           this.compra= compra;
           fireTableDataChanged(); //Notificar a la tabla los cmabios de datos
       }
       
       public Compra getSudaderaEnFila(int fila){
           return compra.get(fila);
       }
	
	
}
