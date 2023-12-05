package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Cliente;

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
	
	public static List<Cliente> obtenerClientesDesdeBD(Connection con) {
        List<Cliente> listaClientes = new ArrayList<>();
       

        try  {
           
                String query = "SELECT * FROM CLIENTE";
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    String DNI = resultSet.getString("DNI");
                    String USUARIO = resultSet.getString("USUARIO");
                    String FECHANACIMIENTO = resultSet.getString("FECHANACIMIENTO");
                    String CONTRA = resultSet.getString("CONTRASEÑA");
                    Double SALDO = resultSet.getDouble("SALDO");

                    Cliente cliente = new Cliente(DNI,USUARIO,FECHANACIMIENTO,CONTRA, SALDO);
                    listaClientes.add(cliente);
                }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaClientes;
    }
	
	
	
	

}


