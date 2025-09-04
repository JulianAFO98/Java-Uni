package Ej3;

public class CajaAhorro extends CuentaBancaria{
	
	private int cantidadExtraccionesPermitidas;
	private int cantidadExtraccionesActuales;
	public CajaAhorro(String nombreTitular,int cantidadExtraccionesPermitidas) {
		super(nombreTitular);
		this.cantidadExtraccionesPermitidas=cantidadExtraccionesPermitidas;
		this.cantidadExtraccionesActuales=0;
	}

	@Override
	public void extraer(double monto) {
		if (this.cantidadExtraccionesActuales<this.cantidadExtraccionesPermitidas && this.saldo>=monto) {
			this.saldo -= monto;
		}
		
	}

	
}
