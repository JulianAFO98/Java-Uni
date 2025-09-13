package Ej5;

public class Acoplado {
	private double tara;
	private double cargaMaxima;
	private boolean refrigerado;
	private int numeroAcoplado;
	private  boolean enUso;
	
	public Acoplado(double tara, double cargaMaxima, boolean refrigerado, int numeroAcoplado, boolean enUso) {
		
		this.tara = tara;
		this.cargaMaxima = cargaMaxima;
		this.refrigerado = refrigerado;
		this.numeroAcoplado = numeroAcoplado;
		this.enUso = enUso;
	}

	public double getTara() {
		return tara;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public int getNumeroAcoplado() {
		return numeroAcoplado;
	}

	public boolean isEnUso() {
		return enUso;
	}
	
	

	public void setEnUso(boolean enUso) {
		this.enUso = enUso;
	}

	@Override
	public String toString() {
		return "Acoplado numero: " + numeroAcoplado;
	}
	
	
	
}
