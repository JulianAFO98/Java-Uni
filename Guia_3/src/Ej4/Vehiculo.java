package Ej4;


public abstract class Vehiculo {
	private String patente;
	private double precioAlquiler;
	
	
	/**
	 * @param Parametro patente es un string
	 * que servira para identificar los vehiculos
	 * El precioAlquiler es un double que representa el precio de alquiler
	 * diario del vehiculo
	 * Pre: Patente no null
	 */
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
