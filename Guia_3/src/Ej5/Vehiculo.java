package Ej5;

public abstract class Vehiculo {
	private String modelo;
	private int numeroInterno;

	
	public Vehiculo(String modelo, int numeroInterno) {
		this.modelo = modelo;
		this.numeroInterno = numeroInterno;
	}


	public String getModelo() {
		return modelo;
	}


	public int getNumeroInterno() {
		return numeroInterno;
	}
	
	public abstract boolean aceptoChofer(Chofer c);


	@Override
	public String toString() {
		return  modelo + ", numero de interno: " + numeroInterno;
	}


	


	
	
	
}
