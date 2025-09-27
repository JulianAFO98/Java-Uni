package Ej5;

public class Perro extends Animal{

	public Perro(int esperanzaDeVida, String nombre) {
		super(esperanzaDeVida, nombre);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
