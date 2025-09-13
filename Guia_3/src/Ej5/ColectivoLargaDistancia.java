package Ej5;

public class ColectivoLargaDistancia extends Colectivo{
	private boolean cocheCama;
	public ColectivoLargaDistancia(String modelo, int cantPasajeros,boolean cocheCama) {
		super(modelo, cantPasajeros);
		this.cocheCama = cocheCama;
	}
	public boolean isCocheCama() {
		return cocheCama;
	}

	@Override
	public boolean aceptoChofer(Chofer c) {
		return c.getCategoria().isHabilitaColectivoLinea();
	}
	
	
}
