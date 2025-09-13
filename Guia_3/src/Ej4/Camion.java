package Ej4;

public class Camion extends VehiculoCarga{

	/**
	 * @param patente Patente para el padre Vehiculo
	 * @param capacidadCarga double que representa la capacidad de carga en toneladas
	 * Pre: patente no null
	 * Pre: capacidadCarga no null
	 */
	public Camion(String patente, double capacidadCarga) {
		super(patente, capacidadCarga);
	}

	/**
	 * Calcula el precio del alquiler aumentando un 40% el precio por ser camion
	 * Post: retorna un double que representa el precio
	 */
	@Override
	public double getPrecioAlquiler() {
		return super.getPrecioAlquiler() * 1.40;
	}
	
	
	
	@Override
	public String toString() {
		return "Camion precio: "+this.getPrecioAlquiler();
	}
}

