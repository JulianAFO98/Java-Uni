package Ej4;

/**
 * Clase auto extiende de Vehiculos con pasajeros
 */
public class Auto  extends VehiculoPasajero{

	/**
	 * @param patente String
	 * @param cantPlazas Cantidad de asientos o lugares disponibles en el vehiculo
	 */
	public Auto(String patente, int cantPlazas) {
		super(patente, cantPlazas);
	}

	/**
	 * Calcula el precio del alquiler haciendo un calculo sobre las plazas
	 * Post: retorna un double que representa el precio
	 */
	@Override
	public double getPrecioAlquiler() {
	    return super.getPrecioAlquiler() * (1 + 0.015 * super.getCantPlazas());
	}

	@Override
	public String toString() {
		return "Auto precio: "+this.getPrecioAlquiler();
	}
	
	
	
	
}
