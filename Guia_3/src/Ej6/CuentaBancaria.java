package Ej6;

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
	
	public  void  extraer(double monto) {
		if(validaExtraccion(monto)) {
			this.saldo-=monto;
		}
	};
	
	public abstract boolean validaExtraccion(double monto);

	public String getNombreTitular() {
		return nombreTitular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	
}
