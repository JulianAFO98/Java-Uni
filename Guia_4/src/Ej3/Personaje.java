package Ej3;

public abstract class Personaje extends Unidad implements IMovible{

	private Posicion posicion;
	public Personaje(String equipo, int costo, int energia,Posicion pos) {
		super(equipo, costo, energia);
		this.posicion = pos;
	}

	
	@Override
	public double getPosx() {
		return this.posicion.getPosx();
	}

	@Override
	public double getPosy() {
		return this.posicion.getPosy();
	}

	@Override
	public void setXY(double x, double y) {
		this.posicion.setXY(x, y);;
		
	}

	@Override
	public void incrementaPos(double valorX, double valorY) {
		this.posicion.setXY(valorX, valorY);
		
	}

	@Override
	public double distancia(IMovible m) {
		return this.posicion.distancia(m);
	}

	
}
