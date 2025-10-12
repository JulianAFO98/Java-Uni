package ej4.modelo;

import java.util.ArrayList;

public class Empleado {
	private String nombre,telefono,email;
	public Empleado(String nombre,String telefono,String email) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
