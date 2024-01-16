package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import domain.Tienda;
public class BD {
	
	static Connection conn = null;
	
	public static Connection initBD() {
		
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:bd.db");
			return conn;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			System.out.println("error 2");
		e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeBD( ) {
		if(conn!=null) {
			try {
				conn.close();
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
	
	public static void cargarPersonasEnLista(Connection con) {
		String sql = "SELECT * FROM CLIENTES";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String dni = rs.getString("DNI");
				String usuario = rs.getString("USUARIO");
				String fecha = rs.getDate("FECHA").toString();
				String contra = rs.getString("CONTRA");
				Double saldo = rs.getDouble("SALDO");
				Tienda.aniadirCliente(new Cliente(dni, usuario, fecha, contra, saldo));
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	


}
	
	
	
	




