package Ej7;

public class Hechicera extends Personaje{

	public Hechicera(double ataqueCorto, double ataqueLargo, double armadura) {
		super(ataqueCorto, ataqueLargo, armadura);
	}
	@Override
	public String toString() {
		return "[Hechicera] ";
	}

}
