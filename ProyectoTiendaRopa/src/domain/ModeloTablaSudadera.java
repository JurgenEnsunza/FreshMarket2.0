package domain;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class  ModeloTablaSudadera extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Sudadera> listaSudadera;
	private List<String> titulos = Arrays.asList("NOMBRE PRODUCTO","PRECIO","MARCA");
	
	public ModeloTablaSudadera(List<Sudadera> ls) {
		listaSudadera = ls;
	}

	@Override
	public int getRowCount() {
		if(listaSudadera == null)
			return 0;
		return listaSudadera.size();
		
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
		Sudadera S = listaSudadera.get(row);
		switch(column) {
			case 0: return S.getNombre();
			case 1: return S.getPrecio();
			case 2: return S.getMarca();
			default: return null;
		}
		
	}
	   public void setSudaderas(List<Sudadera> sudaderas){
           this.listaSudadera= sudaderas;
           fireTableDataChanged(); //Notificar a la tabla los cmabios de datos
       }
       
       public Sudadera getSudaderaEnFila(int fila){
           return listaSudadera.get(fila);
       }
	

}
