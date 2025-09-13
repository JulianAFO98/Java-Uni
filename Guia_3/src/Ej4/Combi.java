package Ej4;

/**
 * Clase combi extiende de los vehiculos que pueden cargar pasajeros
 */
public class Combi extends VehiculoPasajero{

	/**
	 * @param patente String
	 * @param cantPlazas Cantidad de asientos o lugares disponibles en el vehiculo
	 */
	public Combi(String patente, int cantPlazas) {
		super(patente, cantPlazas);
	}
	/**
	 * Calcula el precio del alquiler haciendo un calculo sobre las plazas
	 * Post: retorna un double que representa el precio
	 */
	@Override
	public double getPrecioAlquiler() {
	    return super.getPrecioAlquiler() * (1 + 0.02 * super.getCantPlazas());
	}
	
	@Override
	public String toString() {
		return "Combi precio: "+this.getPrecioAlquiler();
	}
}
