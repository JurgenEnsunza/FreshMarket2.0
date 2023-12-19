package domain;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class  ModeloTablaZapatilla extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Zapatilla> listaZapatilla;
	private List<String> titulos = Arrays.asList("NOMBRE PRODUCTO","PRECIO","MARCA");
	
	public ModeloTablaZapatilla(List<Zapatilla> ls) {
		listaZapatilla = ls;
	}

	@Override
	public int getRowCount() {
		if(listaZapatilla == null)
			return 0;
		return listaZapatilla.size();
		
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
		Zapatilla S = listaZapatilla.get(row);
		switch(column) {
			case 0: return S.getNombre();
			case 1: return S.getPrecio();
			case 2: return S.getMarca();
			default: return null;
		}
		
	}
	   public void setZapatilla(List<Zapatilla> zapatillas){
           this.listaZapatilla= zapatillas;
           fireTableDataChanged(); //Notificar a la tabla los cmabios de datos
       }
       
       public Zapatilla getZapatillaEnFila(int fila){
           return listaZapatilla.get(fila);
       }
	

}