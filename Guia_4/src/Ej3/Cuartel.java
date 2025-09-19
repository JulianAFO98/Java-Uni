package Ej3;

public class Cuartel extends Edificio{


	public Cuartel(String equipo, int costo, int energia, int tiempoDeConstruccion) {
		super(equipo, costo, energia, tiempoDeConstruccion);
	}

	@Override
	public int getTiempoConstruccion() {
		return 0;
	}

	@Override
	public int getX() {
		return 0;
	}

	@Override
	public int getY() {
		return 0;
	}

	@Override
	public void recibeDanio(int cantidad) {
		this.energia-=cantidad*.5;
		
	}

}
