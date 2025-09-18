package Ej1;

public class Vaca extends Animal{

	public Vaca(String nombre, int esperanzaDeVida) {
		super(nombre, esperanzaDeVida);
	}

	@Override
	public String emiteSonido() {
		return "Muuu";
	}

	@Override
	public String toString() {
		return "Vaca hace " + emiteSonido() + ", su nombre es" + getNombre() + ", y tiene una esperanza de vida de"
				+ getEsperanzaDeVida() ;
	}
	
}
