package Ej3;

public abstract class Edificio extends Unidad implements IConstruible,IPosicionable{

	protected int tiempoDeConstruccion;
	public Edificio(String equipo, int costo, int energia,int tiempoDeConstruccion) {
		super(equipo, costo, energia);
		this.tiempoDeConstruccion=tiempoDeConstruccion;
	}
	
	
	@Override
	public int getTiempoConstruccion() {
		return this.tiempoDeConstruccion;
	}
	
}
