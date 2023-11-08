package Objetos;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class ModeloTablaCamiseta extends DefaultTableModel {
	private List<Camiseta> listaCamiseta;
	private List<String> titulos = Arrays.asList("NOMBRE PRODUCTO","UNIDADES","PRECIO");
	
	public ModeloTablaCamiseta(List<Camiseta> lp) {
		listaCamiseta = lp;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int row, int column) {
		Producto p = listaCamiseta.get(row);
		switch(column) {
			case 0: return p.getNombre();
			case 1: return p.getUnidades();
			case 2: return p.getPrecio();
			default: return null;
		}
		
	}
}
	
	
