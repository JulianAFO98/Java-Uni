package Ej7;

public class DecoratorElementoAgua extends DecoratorElemento{

	public DecoratorElementoAgua(IPersonaje encapsulado) {
		super(encapsulado);
	}
	
	@Override
	public double getAtaqueDistante() {
		return super.getAtaqueDistante();
	}

	@Override
	public double getAtaqueCorto() {
		return super.getAtaqueCorto()*1.2;
	}

	@Override
	public double getArmadura() {
		return super.getArmadura()*0.85;
	}

	public String toString() {
		String tipo = super.toString();
		 return tipo + " [Ataque distante: " + getAtaqueDistante()
         + ", Ataque corto: " + getAtaqueCorto()
         + ", Armadura: " + getArmadura() + "] [Elemento: Agua]";
	}
}
