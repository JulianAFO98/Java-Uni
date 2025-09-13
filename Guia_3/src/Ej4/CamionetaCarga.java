package Ej4;

public class CamionetaCarga extends VehiculoCarga{

	/**
	 * @param patente Patente para el padre Vehiculo
	 * @param capacidadCarga double que representa la capacidad de carga en toneladas
	 * Pre: patente no null
	 * Pre: capacidadCarga no null
	 */
	public CamionetaCarga(String patente, double capacidadCarga) {
		super(patente, capacidadCarga);
		
	}
	
	

	@Override
	public String toString() {
		return "Camioneta de carga precio: "+this.getPrecioAlquiler();
	}
}
