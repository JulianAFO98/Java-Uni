package Ej1;

public class Gato extends Animal{

	public Gato(String nombre, int esperanzaDeVida) {
		super(nombre, esperanzaDeVida);
	
	}

	@Override
	public String emiteSonido() {
		
		return "Miau";
	}

	@Override
	public String toString() {
		return "Gato hace " + emiteSonido() + ", su nombre es" + getNombre() + ", y tiene una esperanza de vida de"
				+ getEsperanzaDeVida() ;
	}
	
	
	
	

}
