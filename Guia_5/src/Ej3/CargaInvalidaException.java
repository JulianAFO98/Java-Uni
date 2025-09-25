package Ej3;

public class CargaInvalidaException extends Exception {
	private DatoCargaInvalido dato;

	public CargaInvalidaException(String mensaje,String combustible,double cantidadRequerida,double cantidadDisponible) {
		super(mensaje);
		this.dato = new DatoCargaInvalido(combustible,cantidadRequerida,cantidadDisponible);
	}

	public DatoCargaInvalido getDato() {
		return dato;
	}
	
	
}
