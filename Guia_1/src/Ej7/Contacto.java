package Ej7;

import java.util.ArrayList;

public class Contacto {
	private String nombre,telFijo;
	private ArrayList<String> celulares = new ArrayList<String>();
	
	public Contacto(String nombre) {
		this.nombre = nombre;
	}
	public Contacto(String nombre,String telFijo) {
		this(nombre);
		this.telFijo = telFijo;
	}
	public Contacto(String nombre,String telFijo,String celular) {
		this(nombre,telFijo);
		celulares.add(celular);
	}
	
	public void agregarCelular(String celular) {
		celulares.add(celular);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelFijo() {
		return telFijo;
	}
	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}
	public ArrayList<String> getCelulares() {
		return celulares;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telFijo=" + telFijo + ", celulares=" + celulares + "]";
	}
	
	
	
}
