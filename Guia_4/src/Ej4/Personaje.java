package Ej4;

public abstract class Personaje implements IMovible{
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



	@Override
	public double getPosx() {
		return this.pos.getPosx();
	}



	@Override
	public double getPosy() {
		return this.pos.getPosy();
	}



	@Override
	public void setXY(double x, double y) {
		this.pos.setXY(x, y);
		
	}



	@Override
	public void incrementaPos(double valorX, double valorY) {
		this.pos.incrementaPos(valorX, valorY);
		
	}



	@Override
	public double distancia(IMovible m) {
		return this.pos.distancia(m);
	}



	
}
