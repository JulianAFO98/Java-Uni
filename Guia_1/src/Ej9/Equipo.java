package Ej9;

import java.util.ArrayList;

public class Equipo {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private int cantGoles;
	

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public int getCantGoles() {
		return cantGoles;
	}
	public void setCantGoles(int cantGoles) {
		this.cantGoles = cantGoles;
	}
	public Equipo(ArrayList<Jugador> jugadores) {

		this.jugadores = jugadores;
		this.cantGoles = 0;
	}
	@Override
	public String toString() {
		String s = "";
		
		for (Jugador jugador : jugadores) {
			s+= jugador + ", cantidad de goles:" + cantGoles+"\n";
		}
		return s;
	}
	
	
	
}
