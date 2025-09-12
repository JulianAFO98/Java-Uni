package Ej4;

public abstract class VehiculoPasajero extends Vehiculo{
	private int cantPlazas;
	
	public  VehiculoPasajero(String patente,int cantPlazas) {
		super(patente);
		this.cantPlazas=cantPlazas;
	}

	public int getCantPlazas() {
		return cantPlazas;
	}

	
	
	
	
}
