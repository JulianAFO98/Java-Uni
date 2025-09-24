package Ej2;

public class CuentaBancaria {
	private String titular;
	private double sueldo;
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.sueldo = 0;
	}
	public double getSueldo() {
		return sueldo;
	}
	public String getTitular() {
		return titular;
	}
	
	public void depositar(double cantidad) throws DepositoInvalidoException{
		if (cantidad<=0) {
			throw new DepositoInvalidoException(cantidad);
		}
		this.sueldo+=cantidad;
	}
	public void extraer(double cantidad) throws ExtraccionInvalidaException {
		double sueldoRestante = this.sueldo-cantidad;
		if(sueldoRestante < 0) {
			throw new ExtraccionInvalidaException(new DatoExtraccionInvalido(cantidad,sueldo));
		}
		this.sueldo = sueldoRestante;
	}
	@Override
	public String toString() {
		return "CuentaBancaria titular: " + titular + ", sueldo: " + sueldo;
	}
	
	
	
}
