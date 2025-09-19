package Ej5;

public class Juguetero extends Artesano{

	public Juguetero(String nombre) {
		super(nombre);
		
	}

	@Override
	public String trabajar(Material mat) {
		return this.getNombre() + mat.porJuguetero();
	}

}
