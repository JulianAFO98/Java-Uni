package Ej6;

public class CuentaCorriente extends CuentaBancaria{
	
	private double topePactado;

	public CuentaCorriente(String nombreTitular,double topePactado) {
		super(nombreTitular);
		this.topePactado = topePactado;
	}

	

	public void setTopePactado(double monto) {
		this.topePactado = monto;
	}

	@Override
	public boolean validaExtraccion(double monto) {
		return this.getSaldo() - monto >= -this.topePactado;
	}
	
}
