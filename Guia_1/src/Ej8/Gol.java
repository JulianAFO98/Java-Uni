package Ej8;

public class Gol {
	private Jugador j;
	private Equipo equipoAnotador;
	
	public Gol(Jugador j, Equipo e) {
		this.j = j;
		this.equipoAnotador = e;
	}
	
	public Jugador getJ() {
		return j;
	}
	public void setJ(Jugador j) {
		this.j = j;
	}

	public Equipo getEquipoAnotador() {
		return equipoAnotador;
	}

	public void setEquipoAnotador(Equipo equipoAnotador) {
		this.equipoAnotador = equipoAnotador;
	}
	
	
	
	
	
	
}
