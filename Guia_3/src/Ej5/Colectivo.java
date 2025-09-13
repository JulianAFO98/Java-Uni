package Ej5;

public class Colectivo extends Vehiculo{
	private static int generadorInterno = 0;

	private int cantPasajeros;
	public Colectivo(String modelo,int cantPasajeros) {
		super(modelo, generadorInterno++);
		this.cantPasajeros = cantPasajeros;
		
	}

	
	public int getCantPasajeros() {
		return cantPasajeros;
	}


	@Override
	public boolean aceptoChofer(Chofer c) {
		return c.getCategoria().isHabilitaColectivoLinea() ;
	}

}
