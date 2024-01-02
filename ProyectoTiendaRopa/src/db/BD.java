package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import domain.Cliente;
import domain.Tienda;

public class BD {
	
	public static Connection initBD(String nombreBD) {
		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:"+nombreBD);
					
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeBD(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void insertarPersona(Connection con, Cliente  c) {
			if(Tienda.buscarClientes( c.getDni())==null) {
				String sql = String.format("INSERT INTO Cliente VALUES('%s','%s','%s','%s');", c.getDni(),c.getUsuario(),c.getFechaSTRR(),c.getContraseña());
				try {
					Statement st = con.createStatement();
					st.executeUpdate(sql);
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	
	


}
	
	
	
	




