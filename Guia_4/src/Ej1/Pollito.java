package Ej1;

public class Pollito extends Animal{

	public Pollito(String nombre, int esperanzaDeVida) {
		super(nombre, esperanzaDeVida);
	}

	@Override
	public String emiteSonido() {
		
		return "Pio Pio";
	}

	@Override
	public String toString() {
		return "Pollito hace " + emiteSonido() + ", su nombre es" + getNombre() + ", y tiene una esperanza de vida de"
				+ getEsperanzaDeVida() ;
	}
	
}
