package Ej3;

public class Medico extends Personaje{

	

	public Medico(String equipo, int costo, int energia, Posicion pos) {
		super(equipo, costo, energia, pos);
	}

	@Override
	public void recibeDanio(int cantidad) {
		this.energia-= cantidad*1.5;
		
	}

	


	

}
