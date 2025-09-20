package Ej7;

public abstract class DecoratorElemento implements IPersonaje{

	IPersonaje encapsulado;

	public DecoratorElemento(IPersonaje encapsulado) {
		this.encapsulado = encapsulado;
	}

	@Override
	public double getAtaqueDistante() {
		return encapsulado.getAtaqueDistante();
	}

	@Override
	public double getAtaqueCorto() {
		return encapsulado.getAtaqueCorto();
	}

	@Override
	public double getArmadura() {
		return encapsulado.getArmadura();
	}

	@Override
	public String toString() {
		return  encapsulado.toString();
	}

	
	
}
