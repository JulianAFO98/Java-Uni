package Ej7;

public class Dragon extends Personaje{

	public Dragon(double ataqueCorto, double ataqueLargo, double armadura) {
		super(ataqueCorto, ataqueLargo, armadura);
	}

	@Override
	public String toString() {
		return "[Dragon] ";
	}
}
