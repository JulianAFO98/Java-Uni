package Ej8;

import java.util.ArrayList;


public class Partido {
	private int idPartido;
	private static int generadorIdPartido;
	private Fecha fecha; // preguntar por localDate
	private Equipo eq1;
	private Equipo eq2;
	private ArrayList<Gol> goles = new ArrayList<Gol>();
	
	public Partido(Fecha fecha,Equipo eq1,Equipo eq2) {
		this.fecha = fecha;
		this.idPartido = ++generadorIdPartido;
		this.eq1 = eq1;
		this.eq2 = eq2;
	}
	
	
	public void agregarGol(Jugador j,Equipo e) {
		goles.add(new Gol(j,e));
	}
	
	public int getIdPartido() {
		return idPartido;
	}

	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	
	

	public Equipo getEq1() {
		return eq1;
	}


	public void setEq1(Equipo eq1) {
		this.eq1 = eq1;
	}


	public Equipo getEq2() {
		return eq2;
	}


	public void setEq2(Equipo eq2) {
		this.eq2 = eq2;
	}


	public ArrayList<Gol> getGoles() {
		return goles;
	}

	
	
}
