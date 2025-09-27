package Ej7;

public class AtaqueImposibleException extends Exception {
	private Personaje atacado;
	private Personaje atacante;
	public AtaqueImposibleException(Personaje atacado, Personaje atacante) {
		super("Imposible atacar desde esa distancia");
		this.atacado = atacado;
		this.atacante = atacante;
	}
	public Personaje getAtacado() {
		return atacado;
	}
	
	public Personaje getAtacante() {
		return atacante;
	}
	
	
	
}
