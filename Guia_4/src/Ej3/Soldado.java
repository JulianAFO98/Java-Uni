package Ej3;

public class Soldado extends Personaje implements IHostil{

	

	public Soldado(String equipo, int costo, int energia, Posicion pos) {
		super(equipo, costo, energia, pos);
	}

	@Override
	public void atacar(Unidad adversario) {
		adversario.recibeDanio(50);
		
	}

	@Override
	public void recibeDanio(int cantidad) {
		this.energia-=cantidad;
		
	}



	

}
