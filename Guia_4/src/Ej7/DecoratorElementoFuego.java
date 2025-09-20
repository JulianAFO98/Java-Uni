package Ej7;

public class DecoratorElementoFuego extends DecoratorElemento{

	public DecoratorElementoFuego(IPersonaje encapsulado) {
		super(encapsulado);
	}
	
	@Override
	public double getAtaqueDistante() {
		return super.getAtaqueDistante()*1.7;
	}

	@Override
	public double getAtaqueCorto() {
		return super.getAtaqueCorto()*1.8;
	}

	@Override
	public double getArmadura() {
		return super.getArmadura()*0.5;
	}
	
	public String incendiar() {
		return "Quemando todo a su paso";
	}

	@Override
	public String toString() {
		String tipo = super.toString();
		 return tipo + " [Ataque distante: " + getAtaqueDistante()
         + ", Ataque corto: " + getAtaqueCorto()
         + ", Armadura: " + getArmadura() + "] [Elemento: Fuego]";
	}

	
	
}
