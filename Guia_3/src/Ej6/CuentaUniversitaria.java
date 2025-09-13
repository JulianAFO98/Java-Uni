package Ej6;

public class CuentaUniversitaria extends CuentaBancaria{

	private final double montoDiarioMax = 1000;
	private double montoActual;
	public CuentaUniversitaria(String nombreTitular) {
		super(nombreTitular);
		this.montoActual=0;
	}

	
	
	

	public void reiniciarMontoDiario() {
		this.montoActual = 0;
	}


	@Override
	public boolean validaExtraccion(double monto) {
		return this.montoActual+monto<this.montoDiarioMax;
	}

}
