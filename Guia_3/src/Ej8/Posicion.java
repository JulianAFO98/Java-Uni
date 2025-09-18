package Ej8;

public class Posicion {
	private double x;
	private double y;
	
	
	
	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public void setXY(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public void incrementaPos(double valorX, double valorY) {
		this.x+=valorX;
		this.y+=valorY;
	}
	
	public double distancia(Posicion otro) {
		return Math.sqrt(
				(this.x-otro.x)*(this.x-otro.x)+
				(this.y-otro.y)*(this.y-otro.y));
	}
	
}
