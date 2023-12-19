package domain;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class  ModeloTablaCamiseta extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Camiseta> listaCamiseta;
	private List<String> titulos = Arrays.asList("NOMBRE PRODUCTO","PRECIO","MARCA");
	
	public ModeloTablaCamiseta(List<Camiseta> ls) {
		listaCamiseta = ls;
	}

	@Override
	public int getRowCount() {
		if(listaCamiseta == null)
			return 0;
		return listaCamiseta.size();
		
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
		Camiseta S = listaCamiseta.get(row);
		switch(column) {
			case 0: return S.getNombre();
			case 1: return S.getPrecio();
			case 2: return S.getMarca();
			default: return null;
		}
		
	}
	   public void setSudaderas(List<Camiseta> camiseta){
           this.listaCamiseta= camiseta;
           fireTableDataChanged(); //Notificar a la tabla los cmabios de datos
       }
       
       public Camiseta getCamisetaEnFila(int fila){
           return listaCamiseta.get(fila);
       }
	

}
