package Ej7;

public class DecoratorElementoAire extends DecoratorElemento{

	public DecoratorElementoAire(IPersonaje encapsulado) {
		super(encapsulado);
	}
	
	@Override
	public double getAtaqueDistante() {
		return super.getAtaqueDistante()*1.1;
	}

	@Override
	public double getAtaqueCorto() {
		return super.getAtaqueCorto()*1.2;
	}

	@Override
	public double getArmadura() {
		return super.getArmadura()*0.9;
	}
	public String huracan() {
		return "Tornados por todos lados";
	}

	public String toString() {
		String tipo = super.toString();
		 return tipo + " [Ataque distante: " + getAtaqueDistante()
         + ", Ataque corto: " + getAtaqueCorto()
         + ", Armadura: " + getArmadura() + "] [Elemento: Aire]";
	}

	

}
