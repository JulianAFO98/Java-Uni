package Ej3;

public class Posicion implements IMovible{

	private double x;
	private double y;
	
	
	
	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
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
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void incrementaPos(double valorX, double valorY) {
		this.x += valorX;
		this.y += valorY;
		
	}

	@Override
	public double distancia(IMovible m) {
		 double dx = this.getPosx() - m.getPosx();
		 double dy = this.getPosy() - m.getPosy();
		 return Math.sqrt(dx * dx + dy * dy);
	}

}
