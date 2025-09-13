package Ej6;

public class CajaAhorro extends CuentaBancaria{
	
	private int cantidadExtraccionesPermitidas;
	private int cantidadExtraccionesActuales;
	public CajaAhorro(String nombreTitular,int cantidadExtraccionesPermitidas) {
		super(nombreTitular);
		this.cantidadExtraccionesPermitidas=cantidadExtraccionesPermitidas;
		this.cantidadExtraccionesActuales=0;
	}

	
	@Override
	public boolean validaExtraccion(double monto) {
		return this.cantidadExtraccionesActuales<this.cantidadExtraccionesPermitidas && this.saldo>=monto;
	}

	
}
