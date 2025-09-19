package Ej3;

public abstract class Unidad{
	private String equipo;
	private int costo;
	protected int energia;
	
	
	public Unidad(String equipo, int costo, int energia) {
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
	}


	public String getEquipo() {
		return equipo;
	}


	public int getCosto() {
		return costo;
	}


	public int getEnergia() {
		return energia;
	}


	public abstract void recibeDanio(int cantidad);
	
	
	
	
}
