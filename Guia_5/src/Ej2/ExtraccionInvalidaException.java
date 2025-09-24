package Ej2;

public class ExtraccionInvalidaException extends Exception {
	private DatoExtraccionInvalido dato;

	public ExtraccionInvalidaException(DatoExtraccionInvalido dato) {
		this.dato = dato;
	}

	public DatoExtraccionInvalido getDato() {
		return dato;
	}
	
	
}
