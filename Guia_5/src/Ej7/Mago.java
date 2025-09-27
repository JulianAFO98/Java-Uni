package Ej7;

public class Mago extends Personaje {

	public Mago(String nombre, Posicion pos) {
		super(nombre, 500, 10, pos, 5);
	}

	@Override
	public void recibeDanio(int cantidad) {
		this.vitalidad -= cantidad;
	}

	@Override
	public void serBendecido() {
		this.vitalidad *= 1.25;

	}

	@Override
	public void incrementaPos(double valorX, double valorY) {
		this.pos.incrementaPos(valorX, valorY);
	}

	@Override
	public void serMaldecido() {
		this.vitalidad *= .5;

	}
	
	@Override
	public String toString() {
		return "Mago: " + this.nombre + " tiene HP:" + this.vitalidad;
	}
	
	
}
