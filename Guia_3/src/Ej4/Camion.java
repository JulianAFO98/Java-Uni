package Ej4;

public class Camion extends VehiculoCarga{

	public Camion(String patente, double capacidadCarga) {
		super(patente, capacidadCarga);
	}

	@Override
	public double getPrecioAlquiler() {
		return super.getPrecioAlquiler() * 1.40;
	}
	
	
	
	@Override
	public String toString() {
		return "Camion precio: "+this.getPrecioAlquiler();
	}
}

