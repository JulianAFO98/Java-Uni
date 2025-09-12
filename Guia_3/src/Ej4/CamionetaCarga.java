package Ej4;

public class CamionetaCarga extends VehiculoCarga{

	public CamionetaCarga(String patente, double capacidadCarga) {
		super(patente, capacidadCarga);
		
	}
	
	

	@Override
	public String toString() {
		return "Camioneta de carga precio: "+this.getPrecioAlquiler();
	}
}
