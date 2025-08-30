package Ej9;

import java.util.GregorianCalendar;

public class Fecha {
	private int idFecha;
	private static int idGenerador=0;
	private Equipo equipo1; 
	private Equipo equipo2; 
	private GregorianCalendar fecha;
	
	
	
	public Fecha(Equipo equipo1, Equipo equipo2, GregorianCalendar fecha) {
		this.idFecha = ++idGenerador;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.fecha = fecha;
	}



	public int getIdFecha() {
		return idFecha;
	}



	public void setIdFecha(int idFecha) {
		this.idFecha = idFecha;
	}



	public static int getIdGenerador() {
		return idGenerador;
	}



	public static void setIdGenerador(int idGenerador) {
		Fecha.idGenerador = idGenerador;
	}



	public Equipo getEquipo1() {
		return equipo1;
	}



	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}



	public Equipo getEquipo2() {
		return equipo2;
	}



	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}



	public GregorianCalendar getFecha() {
		return fecha;
	}



	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return "Fecha [equipo1=" + equipo1 + ", equipo2=" + equipo2 + "]";
	}
	
	

	
}
