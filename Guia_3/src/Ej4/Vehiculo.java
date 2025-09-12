package Ej4;

public abstract class Vehiculo {
	private String patente;
	private double precioAlquiler;
	
	
	public Vehiculo(String patente) {
		this.patente = patente;
		this.precioAlquiler = 500;
	}


	public String getPatente() {
		return patente;
	}


	public double getPrecioAlquiler() {
		return precioAlquiler;
	}
	
	
	
	
}
