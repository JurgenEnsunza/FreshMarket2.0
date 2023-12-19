package domain;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class  ModeloTablaPantalon extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Pantalon> listaPantalon;
	private List<String> titulos = Arrays.asList("NOMBRE PRODUCTO","PRECIO","MARCA");
	
	public ModeloTablaPantalon(List<Pantalon> ls) {
		listaPantalon = ls;
	}

	@Override
	public int getRowCount() {
		if(listaPantalon == null)
			return 0;
		return listaPantalon.size();
		
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
		Pantalon S = listaPantalon.get(row);
		switch(column) {
			case 0: return S.getNombre();
			case 1: return S.getPrecio();
			case 2: return S.getMarca();
			default: return null;
		}
		
	}
	   public void setPantalon(List<Pantalon> pantalon){
           this.listaPantalon= pantalon;
           fireTableDataChanged(); //Notificar a la tabla los cmabios de datos
       }
       
       public Pantalon getPantalonEnFila(int fila){
           return listaPantalon.get(fila);
       }
	

}