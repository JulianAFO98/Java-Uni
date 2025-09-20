package Ej7;

public class Guerrero extends Personaje{

	public Guerrero(double ataqueCorto, double ataqueLargo, double armadura) {
		super(ataqueCorto, ataqueLargo, armadura);
	}

	@Override
	public String toString() {
		return "[Guerrero] ";
	}

	

	

}
