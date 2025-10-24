package ej1.modelo;

public class Arquero extends Personaje{
	private int cantidadFlechas;
	public Arquero(String nombre, Posicion pos) {
		super(nombre, 500, 5, pos,8);
		this.cantidadFlechas=20;
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
	public void ataca(Personaje p) throws AtaqueImposibleException{
		int danioInfligido=this.danio;
		
		if(this.getPos().distancia(p.getPos())>this.distanciaMaximaDeDesplazamiento)
			throw new AtaqueImposibleException(p,this);
		
		if(this.cantidadFlechas>0) {
			danioInfligido=20;
			this.cantidadFlechas--;
		}
		p.recibeDanio(danioInfligido);
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
