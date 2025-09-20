package Ej6;

public class Paladin extends Personaje{

	private int armadura;
	public Paladin(String nombre, Posicion pos) {
		super(nombre, 800,5, pos);
		this.armadura=500;
	}
	@Override
	public boolean ataca(Personaje p) {
		return this.getPos().distancia(p.getPos())<5;
	}
	@Override
	public void recibeDanio(int cantidad) {
	    int danoRestante = cantidad - this.armadura;

	    if (cantidad <= this.armadura) {
	        // La armadura absorbe todo el daño
	        this.armadura -= cantidad;
	    } else {
	        // Se rompe la armadura y el resto pasa a la vitalidad
	        this.armadura = 0;
	        this.vitalidad -= danoRestante;
	    }
	}
	
	@Override
	public void serBendecido() {
		this.armadura+=200;
		
	}
	@Override
	public void serMaldecido() {
		this.armadura-=200;
		if(this.armadura<0) {
			this.armadura=0;
		}
		
	}
	public String toString() {
		return "Paladin: " + this.nombre + " tiene HP:" + this.vitalidad+ " y armadura: "+this.armadura;
	}
	

}
