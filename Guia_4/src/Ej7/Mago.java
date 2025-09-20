package Ej7;

public class Mago extends Personaje{

	public Mago(double ataqueCorto, double ataqueLargo, double armadura) {
		super(ataqueCorto, ataqueLargo, armadura);
	}
	@Override
	public String toString() {
		return "[Mago] ";
	}

}
