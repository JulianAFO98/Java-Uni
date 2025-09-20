package Ej7;

public abstract class Personaje implements IPersonaje{
	
	private double ataqueCorto;
	private double ataqueLargo;
	private double armadura;
	
	
	public Personaje(double ataqueCorto, double ataqueLargo, double armadura) {
		this.ataqueCorto = ataqueCorto;
		this.ataqueLargo = ataqueLargo;
		this.armadura = armadura;
	}
	
	@Override
	public double getAtaqueDistante() {
		return this.ataqueLargo;
	}

	@Override
	public double getAtaqueCorto() {
		return this.ataqueCorto;
	}

	@Override
	public double getArmadura() {
		return this.armadura;
	}
	
	
}
