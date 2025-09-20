package Ej4;

public class Posicion implements IMovible{
	private double x;
	private double y;
	
	
	
	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	
	public void setXY(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public void incrementaPos(double valorX, double valorY) {
		this.x+=valorX;
		this.y+=valorY;
	}
	
	


	@Override
	public double getPosx() {
		return this.x;
	}



	@Override
	public double getPosy() {
		return this.y;
	}



	@Override
	public double distancia(IMovible m) {
		return Math.sqrt(
				(this.x-m.getPosx())*(this.x-m.getPosx())+
				(this.y-m.getPosy())*(this.y-m.getPosy()));
	}
	
}
