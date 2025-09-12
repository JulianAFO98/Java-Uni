package Ej4;

public class Auto  extends VehiculoPasajero{

	public Auto(String patente, int cantPlazas) {
		super(patente, cantPlazas);
	}

	@Override
	public double getPrecioAlquiler() {
	    return super.getPrecioAlquiler() * (1 + 0.015 * super.getCantPlazas());
	}

	@Override
	public String toString() {
		return "Auto precio: "+this.getPrecioAlquiler();
	}
	
	
	
	
}
