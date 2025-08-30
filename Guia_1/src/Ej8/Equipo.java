package Ej8;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private int cantPartidosGanados;
	private int cantPartidosEmpatados;
	private int cantPartidosPerdidos;
	private int cantGolesAFavor;
	private int cantGolesEnContra;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Equipo(String nombre, int cantPartidosGanados, int cantPartidosEmpatados, int cantPartidosPerdidos,
			int cantGolesAFavor, int cantGolesEnContra) {
		this.nombre = nombre;
		this.cantPartidosGanados = cantPartidosGanados;
		this.cantPartidosEmpatados = cantPartidosEmpatados;
		this.cantPartidosPerdidos = cantPartidosPerdidos;
		this.cantGolesAFavor = cantGolesAFavor;
		this.cantGolesEnContra = cantGolesEnContra;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantPartidosGanados() {
		return cantPartidosGanados;
	}
	public void setCantPartidosGanados(int cantPartidosGanados) {
		this.cantPartidosGanados = cantPartidosGanados;
	}
	public int getCantPartidosEmpatados() {
		return cantPartidosEmpatados;
	}
	public void setCantPartidosEmpatados(int cantPartidosEmpatados) {
		this.cantPartidosEmpatados = cantPartidosEmpatados;
	}
	public int getCantPartidosPerdidos() {
		return cantPartidosPerdidos;
	}
	public void setCantPartidosPerdidos(int cantPartidosPerdidos) {
		this.cantPartidosPerdidos = cantPartidosPerdidos;
	}
	public int getCantGolesAFavor() {
		return cantGolesAFavor;
	}
	public void setCantGolesAFavor(int cantGolesAFavor) {
		this.cantGolesAFavor = cantGolesAFavor;
	}
	public int getCantGolesEnContra() {
		return cantGolesEnContra;
	}
	public void setCantGolesEnContra(int cantGolesEnContra) {
		this.cantGolesEnContra = cantGolesEnContra;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	
	public int compararCon(Equipo otro) {
	    int puntos1 = this.getCantPartidosGanados()*Torneo.getPartidoGanado() + this.getCantPartidosEmpatados();
	    int puntos2 = otro.getCantPartidosGanados()*Torneo.getPartidoGanado() + otro.getCantPartidosEmpatados();
	    int ganador = 1;
	    if (puntos1 != puntos2) {
	    	ganador = puntos1 - puntos2;
	    }else {
	    	if(this.cantGolesAFavor != otro.cantGolesAFavor) {
	    		ganador = this.cantGolesAFavor - otro.cantGolesAFavor;
	    	}else {
	    		ganador = otro.cantGolesEnContra - this.cantGolesEnContra;
	    	}
	    }
	    return ganador;
	}
	
	public Jugador obtenerGoleador() { //preguntar
		Jugador j=null; // null?
		int maxGoles=0;
		
		for (int i = 0; i < jugadores.size(); i++) {
			if(jugadores.get(i).getCantGolesConvertidos()>maxGoles) {
				maxGoles = jugadores.get(i).getCantGolesConvertidos();
				j = jugadores.get(i);
			}
		}
		
		return j;
	}
	
	
}
