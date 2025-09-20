package Ej4;

public class Caballero extends Personaje{

	public Caballero(String nombre, Posicion pos) {
		super(nombre, 500,10, pos);
	}

	@Override
	public boolean ataca(Personaje p) {
		return this.getPos().distancia(p.getPos())<10;
	}

	@Override
	public void recibeDanio(int cantidad) {
		this.vitalidad-=cantidad;
	}

	@Override
	public String toString() {
		return "Caballero: " + this.nombre + " tiene HP:" + this.vitalidad;
	}
	
}
