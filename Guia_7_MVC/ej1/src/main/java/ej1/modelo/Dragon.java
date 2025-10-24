package ej1.modelo;

public class Dragon extends Personaje{

	private int poderDeFuego;
	public Dragon(String nombre, int vitalidad, int danio, Posicion pos,int poderDeFuego) {
		super(nombre, vitalidad, danio, pos,20);
		this.poderDeFuego=poderDeFuego;	
	}
	@Override
	public void serBendecido() {
		this.poderDeFuego*=1.4;
		this.vitalidad+=250;
		
	}
	@Override
	public void serMaldecido() {
		this.poderDeFuego*=0.7;
		this.vitalidad*=0.8;
		
	}
	
	@Override
	public void recibeDanio(int cantidad) {
		this.vitalidad-=cantidad*0.5;
		
	}
	
	public String toString() {
		return "Dragon: " + this.nombre + " tiene HP:" + this.vitalidad+ " y poder de fuego: "+this.poderDeFuego;
	}

}
