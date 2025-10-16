package ej1.modelo;

public class Caballero extends Personaje{

	public Caballero(String nombre, Posicion pos) {
		super(nombre, 500,10, pos,5);
	}


	@Override
	public void recibeDanio(int cantidad) {
		this.vitalidad-=cantidad;
	}

	@Override
	public void serBendecido() {
		this.vitalidad*=1.25;
		
	}

	@Override
	public void serMaldecido() {
		this.vitalidad*=.5;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Caballero: " + this.nombre + " tiene HP:" + this.vitalidad;
	}

	
	
}
