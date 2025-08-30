package Ej9;

public class Jugador {
	private String nombre;
	private int puntaje;
	private int ganados;
	private int perdidos;
	private int empatados;
	
	
	public Jugador(String nombre, int puntaje) {
		this.nombre = nombre;
		this.puntaje = puntaje;
		this.ganados = 0;
		this.perdidos = 0;
		this.empatados = 0;
	}
	public int getGanados() {
		return ganados;
	}
	public void setGanados(int ganados) {
		this.ganados = ganados;
	}
	public int getPerdidos() {
		return perdidos;
	}
	public void setPerdidos(int perdidos) {
		this.perdidos = perdidos;
	}
	public int getEmpatados() {
		return empatados;
	}
	public void setEmpatados(int empatados) {
		this.empatados = empatados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	@Override
	public String toString() {
		return "Jugador "+ nombre + ", puntaje " + puntaje;
	}

	
	
	
}
