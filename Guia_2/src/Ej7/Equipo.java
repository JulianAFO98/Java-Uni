package Ej7;

import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	String agregaDelantero(String nombre, double velocidad, double potencia) {
		boolean condicion = (velocidad <=1 && velocidad>0) && (potencia <=1 && potencia >0);
		if (condicion)
			jugadores.add(new Delantero(nombre,velocidad,potencia));
		return condicion ? "Jugador agregado\n" : "Parametros del jugador fuera de rango (0,1]";
	}
	
	String agregaDefensor(String nombre,double velocidad, double potencia) {
		boolean condicion = (velocidad <=1 && velocidad>0) && (potencia <=1 && potencia >0);
		if (condicion)
			jugadores.add(new Defensor(nombre,velocidad,potencia));
		return condicion ? "Jugador agregado\n" : "Parametros del jugador fuera de rango (0,1]";
	}
	
	String agregaArquero(String nombre, double velocidad, double potencia) {
		boolean condicion = (velocidad <=1 && velocidad>0) && (potencia <=1 && potencia >0);
		if (condicion)
			jugadores.add(new Arquero(nombre,velocidad,potencia));
		return condicion ? "Jugador agregado\n" : "Parametros del jugador fuera de rango (0,1]";
	}
	
	
	public void eliminarJugador(Jugador j) {
		jugadores.remove(j);
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	
	public double indiceAtaque() {
		double indiceAtaque = 0;
		for (Jugador jugador : jugadores) {
			indiceAtaque+=jugador.indiceAtaque();
		}
		return indiceAtaque;
	}
	public double indiceDefensa() {
		double indiceDefensa = 0;
		for (Jugador jugador : jugadores) {
			indiceDefensa+=jugador.indiceDefensa();
		}
		return indiceDefensa;
	}
	
	
	
}
