package Ej5;

public class Gato extends Animal{

	
	public Gato(int esperanzaDeVida, String nombre) {
		super(esperanzaDeVida, nombre);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	
}
