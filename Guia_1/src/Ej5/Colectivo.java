package Ej5;

public class Colectivo {
	private String modelo;
	private int numeroInterno;
	private static int numeroGenerador = 0;
	
	public Colectivo(String modelo) {
		this.modelo = modelo;
		this.numeroInterno = ++Colectivo.numeroGenerador;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroInterno() {
		return numeroInterno;
	}


	@Override
	public String toString() {
		return "modelo=" + modelo + ", numeroInterno=" + numeroInterno;
	}
	
	
	
	
}
