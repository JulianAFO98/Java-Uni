package ej1.modelo;


public class IncrementoImposibleException extends Exception {
	private double maxDistanciaSoportada;
	private double distanciaPretendida;
	
	public IncrementoImposibleException(double maxDistanciaSoportada, double distanciaPretendida) {
		this.maxDistanciaSoportada = maxDistanciaSoportada;
		this.distanciaPretendida = distanciaPretendida;
	}

	public double getMaxDistanciaSoportada() {
		return maxDistanciaSoportada;
	}

	public double getDistanciaPretendida() {
		return distanciaPretendida;
	}

	
	
}
