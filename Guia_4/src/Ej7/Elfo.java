package Ej7;

public class Elfo extends Personaje{

	public Elfo(double ataqueCorto, double ataqueLargo, double armadura) {
		super(ataqueCorto, ataqueLargo, armadura);
	}

	@Override
	public String toString() {
		return "[Elfo] ";
	}
}
