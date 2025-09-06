package Ej5;

public abstract class Automovil {
	private String patente;
	protected double velocidad;
	protected double velocidadMaxima;
	private int marcha;
	public Automovil(String patente, double velocidadMaxima) {
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
	}
	public Automovil(String patente) {
		this(patente,160);
	}
	public String getPatente() {
		return patente;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public int getMarcha() {
		return marcha;
	}
	protected void setMarcha(int marcha) {
		if(marcha>=-1 && marcha<=5)
			this.marcha = marcha;
	}
	
	public abstract void acelerar(double vel);
	public abstract void frenar(double vel);
	
	@Override
	public String toString() {
		return "Automovil patente:" + this.patente;
	}
	
	
	
}
