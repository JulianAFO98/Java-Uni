package Ej4;

public class Combi extends VehiculoPasajero{

	public Combi(String patente, int cantPlazas) {
		super(patente, cantPlazas);
	}

	@Override
	public double getPrecioAlquiler() {
	    return super.getPrecioAlquiler() * (1 + 0.02 * super.getCantPlazas());
	}
	
	@Override
	public String toString() {
		return "Combi precio: "+this.getPrecioAlquiler();
	}
}
