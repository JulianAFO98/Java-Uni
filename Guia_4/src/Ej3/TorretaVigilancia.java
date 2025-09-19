package Ej3;

public class TorretaVigilancia extends Edificio implements IHostil{

	public TorretaVigilancia(String equipo, int costo, int energia, int tiempoDeConstruccion) {
		super(equipo, costo, energia, tiempoDeConstruccion);
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
	public void atacar(Unidad adversario) {
		adversario.recibeDanio(10);
		
	}

	@Override
	public void recibeDanio(int cantidad) {
		// TODO Auto-generated method stub
		
	}


	

}
