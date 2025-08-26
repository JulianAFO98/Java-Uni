package Ej3;

public class CuentaBancaria {
	private double saldo;
	private String titular;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	
	void depositar(double monto) {
		if (monto > 0) {
			this.saldo += monto;
		}
	}
	
	boolean extraer(double monto) {
		boolean extrajo =monto > 0 && (this.saldo - monto >= 0);
		if(extrajo) {
			this.saldo -= monto;
		}
		return extrajo;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	

}
