package Ej4;

/**
 * Clase abstracta que simula un vehiculo con capacidad de carga
 * 
 */
public abstract class VehiculoCarga extends Vehiculo{

	private double capacidadCarga;
	/**
	 * @param patente Patente para el padre Vehiculo
	 * @param capacidadCarga double que representa la capacidad de carga en toneladas
	 * Pre: patente no null
	 * Pre: capacidadCarga no null
	 */
	public VehiculoCarga(String patente,double capacidadCarga) {
		super(patente);
		this.capacidadCarga = capacidadCarga;
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	
	/**
	 *Metodo sobreescrito de Vehiculo, aplica un aumento de precio
	 *segun la capacidad de carga del vehiculo
	 *Post:Retornar un double que calcula el precio 
	 */
	@Override
	public double getPrecioAlquiler() {
		return super.getPrecioAlquiler()* (1+(0.20 * this.capacidadCarga ));
	}
	
	
	
	
}
