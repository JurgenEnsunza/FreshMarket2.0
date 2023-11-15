package Objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {
	public static  Connection conectarBaseDeDatos(String nomBD){
		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:"+nomBD);
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	public static void closeBD(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
	}
	/*public static void crearTablas(Connection con) {
		String sql = "CREATE TABLE IF NOT EXISTS Cliente (dni String, usuario string, "
	}*/
	
	public static void conseguirCliente(Connection con,Cliente dni){
		Statement stmt;
		try {
			stmt = con.createStatement();
			try {
				ResultSet rs = stmt.executeQuery("SELECT ");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} 
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	


}


