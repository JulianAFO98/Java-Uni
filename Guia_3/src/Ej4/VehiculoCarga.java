package Ej4;

public abstract class VehiculoCarga extends Vehiculo{

	private double capacidadCarga;
	public VehiculoCarga(String patente,double capacidadCarga) {
		super(patente);
		this.capacidadCarga = capacidadCarga;
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	
	@Override
	public double getPrecioAlquiler() {
		return super.getPrecioAlquiler()* (1+(0.20 * this.capacidadCarga ));
	}
	
	
	
	
}
