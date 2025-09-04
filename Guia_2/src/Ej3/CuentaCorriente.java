package Ej3;

public class CuentaCorriente extends CuentaBancaria{
	
	private double topePactado;
	private double montoEnRojo;
	public CuentaCorriente(String nombreTitular,double topePactado) {
		super(nombreTitular);
		this.topePactado = topePactado;
		this.montoEnRojo = 0;
	}

	@Override
    public void extraer(double monto) {
        if (this.getSaldo() - monto >= -this.topePactado) {
            this.saldo -= monto;
        } 
    }

	public void setTopePactado(double monto) {
		this.topePactado = monto;
	}
	
}
