package Ej3;

public abstract class CuentaBancaria {
	private String nombreTitular;
	protected double saldo;
	
	
	
	
	public CuentaBancaria(String nombreTitular) {
		this.nombreTitular = nombreTitular;
		this.saldo = 0;
	}
	
	public void depositar(double cantidad) {
		if (cantidad>0) {
			this.saldo+=cantidad;
		}
	}
	
	public abstract void  extraer(double monto);
	
	public String getNombreTitular() {
		return nombreTitular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	
}
