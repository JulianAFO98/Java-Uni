package Ej8;

public abstract class Personaje {
	protected String nombre;
	protected int vitalidad;
	protected int danio;
	protected Posicion pos;
	public Personaje(String nombre, int vitalidad,int danio, Posicion pos) {
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.danio = danio;
		this.pos = pos;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public int getVitalidad() {
		return vitalidad;
	}



	public Posicion getPos() {
		return pos;
	}

		

	public int getDanio() {
		return danio;
	}



	public abstract boolean ataca(Personaje p);
	
	public abstract void recibeDanio(int cantidad);
}
