package Ej5;

public class Camion extends Vehiculo{
	private double tara;
	private double cargaMaxima;
	private Acoplado acoplado = null;
	

	
	public Camion(String modelo, int numeroInterno, double tara, double cargaMaxima) {
		super(modelo, numeroInterno);
		this.tara = tara;
		this.cargaMaxima = cargaMaxima;
	}


	
	

	public double getTara() {
		return tara;
	}


	public double getCargaMaxima() {
		return cargaMaxima;
	}


	public Acoplado getAcoplado() {
		return acoplado;
	}

	public void desvincularAcoplado() {
		this.acoplado.setEnUso(false);
		this.acoplado = null;
	}
	
	public void setAcoplado(Acoplado acoplado) {
		if(this.acoplado != null && !acoplado.isEnUso()) {
			this.acoplado = acoplado;
			acoplado.setEnUso(true);
		}
	}



	@Override
	public boolean aceptoChofer(Chofer c) {
		return c.getCategoria().isHabilitaCamion();
	}





	@Override
	public String toString() {
		String r = this.getModelo() + ", numero de interno: " + this.getNumeroInterno();
		if(this.acoplado != null) {
			r+=this.acoplado;			
		}
		return r;
	}





	public void asignarAcoplado(Acoplado a) {
		this.acoplado = a;
		
	}

	
	
}
