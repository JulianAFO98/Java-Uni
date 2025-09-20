package Ej7;

public class DecoratorElementoTierra extends DecoratorElemento{

	public DecoratorElementoTierra(IPersonaje encapsulado) {
		super(encapsulado);
	}
	
	@Override
	public double getAtaqueDistante() {
		return super.getAtaqueDistante()*0.7;
	}

	@Override
	public double getAtaqueCorto() {
		return super.getAtaqueCorto()*0.8;
	}

	@Override
	public double getArmadura() {
		return super.getArmadura()*1.25;
	}
	
	public String toString() {
		String tipo = super.toString();
		 return tipo + " [Ataque distante: " + getAtaqueDistante()
         + ", Ataque corto: " + getAtaqueCorto()
         + ", Armadura: " + getArmadura() + "] [Elemento: Tierra]";
	}

}
