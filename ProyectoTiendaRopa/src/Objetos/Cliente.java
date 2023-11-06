package Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente implements Comparable <Cliente> {
		
	private String dni;
	private String usuario;
	private Date FechaSTR;
	private String contraseña;
	
	private SimpleDateFormat fechaNacimiento = new SimpleDateFormat("dd-MM-yyyy");
	
	
	

	public Cliente(String dni, String usuario, String FechaSTR, String contraseña) {
		super();
		this.dni = dni;
		this.usuario = usuario;
		try {
			this.FechaSTR = fechaNacimiento.parse(FechaSTR);
		} catch (ParseException e) {
			this.FechaSTR = new Date(0);
		}
		this.contraseña = contraseña;
	}
	
	




	public Cliente(String dni, String usuario, Date FechaSTR, String contraseña) {
		super();
		this.dni = dni;
		this.usuario = usuario;
		this.FechaSTR = FechaSTR;
		this.contraseña = contraseña;
	}
	
	
	
	






	public String getDni() {
		return dni;
	}






	public void setDni(String dni) {
		this.dni = dni;
	}






	public String getUsuario() {
		return usuario;
	}






	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}






	public String getFechaSTRR() {
		return fechaNacimiento.format(FechaSTR);
	}






	public void setFechaSTR(Date fechaSTR) {
		FechaSTR = fechaSTR;
	}






	public String getContraseña() {
		return contraseña;
	}






	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}






	public int compareTo(Cliente o){
		return this.dni.compareTo(o.dni);
		
	}
	
	
	
	
	
	
	
	
	
		

}