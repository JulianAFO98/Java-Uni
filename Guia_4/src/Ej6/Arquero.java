package Ej6;

public class Arquero extends Personaje{
	private int cantidadFlechas;
	public Arquero(String nombre, Posicion pos) {
		super(nombre, 500, 5, pos);
		this.cantidadFlechas=20;
	}
	@Override
	public boolean ataca(Personaje p) {
		boolean esPosibleAtacar;
		if(this.cantidadFlechas>0) {
			esPosibleAtacar = this.getPos().distancia(p.getPos())<100;
			this.cantidadFlechas-=1;
		}
		else
			esPosibleAtacar = this.getPos().distancia(p.getPos())<5;
		return esPosibleAtacar;
	}
	@Override
	public void recibeDanio(int cantidad) {
		this.vitalidad -= cantidad;
	}
	@Override
	public String toString() {
		return "Arquero: " + nombre + " tiene HP:" + vitalidad
				+ " cuenta con " +cantidadFlechas +" flechas"	;
	}
	
	@Override 
	public int getDanio() {
		int danio = this.danio;
		if (cantidadFlechas>0) {
			danio = 20;
		}
		return danio;
	}
	@Override
	public void serBendecido() {
		this.cantidadFlechas+=5;
		
	}
	@Override
	public void serMaldecido() {
		this.cantidadFlechas=0;
		
	}
	
	

}
