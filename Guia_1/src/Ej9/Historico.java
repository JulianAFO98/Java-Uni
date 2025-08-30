package Ej9;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Historico {
	private ArrayList<Fecha> fechas = new ArrayList<Fecha>();
	ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	private final  int ptsPorVictoria = 3;
	private final  int ptsPorEmpate = 1;
	

	public Historico( ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public void agregarJugador(Jugador j) {
		jugadores.add(j);
	}
	
	//preguntar por comparator, usar otra lista para ordenar o usar esta clase?
	public void agregarFecha(GregorianCalendar fecha) {
		ArrayList<Jugador> eq1 = new ArrayList<Jugador>();
		ArrayList<Jugador> eq2 = new ArrayList<Jugador>();
		
		jugadores.sort(Comparator.comparingInt(Jugador::getPuntaje));
		
		for (int i = 0; i < jugadores.size(); i++) {
			if(i % 2 == 0) {
				eq1.add(jugadores.get(i));
			}else {
				eq2.add(jugadores.get(i));
			}
				
		}
		
		fechas.add(new Fecha(new Equipo(eq1),new Equipo(eq2),fecha));
		
	}
	
	
	public void darResultadosAFecha(int golesEq1,int golesEq2,int idPartido) {
		Fecha f;
		int i=0;
		int n = fechas.size();
		while(i<n && fechas.get(i).getIdFecha()!=idPartido) {
			i++;
		}
		if(i<n) {
			f = fechas.get(i);
			f.getEquipo1().setCantGoles(golesEq1);
			f.getEquipo1().setCantGoles(golesEq2);
			actualizarPuntajesJugadores(golesEq1 - golesEq2,fechas.get(i));
		}
	}
	//enchanced for?
	private void actualizarPuntajesJugadores(int diferencia,Fecha f) {
		if (diferencia == 0) { 
			actualizarEquipo(f.getEquipo1(),this.ptsPorEmpate);
			actualizarEquipo(f.getEquipo2(),this.ptsPorEmpate);
		}else {
			if (diferencia>0) {
				actualizarEquipo(f.getEquipo1(),this.ptsPorVictoria);
			}else {
				actualizarEquipo(f.getEquipo2(),this.ptsPorVictoria);
			}
		}
	}
	
	private void  actualizarEquipo(Equipo e,int puntos) {
		ArrayList<Jugador> eq = e.getJugadores();
		Jugador j;
		for (int i = 0; i < eq.size(); i++) {
			j = eq.get(i);
			j.setPuntaje(j.getPuntaje()+puntos);
			if (puntos == this.ptsPorVictoria) {
				j.setGanados(j.getGanados()+1);
			}else {
				if(puntos == this.ptsPorEmpate) {
					j.setEmpatados(j.getEmpatados()+1);
				}else {
					j.setPerdidos(j.getPerdidos()+1);
				}
			}
		}
	}
	 // preguntar por contains
	public void enCuantosJuntosYEnfrentados(Jugador j1,Jugador j2) {
		int cuantosJuntos = 0;
		int cuantosSeparados = 0;
		boolean j1EnEq1;
		boolean j2EnEq1;
		ArrayList<Jugador> jugadores;
	
		for (Fecha fecha : fechas) {
		    ArrayList<Jugador> eq1 = fecha.getEquipo1().getJugadores();
		    j1EnEq1 = eq1.contains(j1);
		    j2EnEq1 = eq1.contains(j2);

		    if (j1EnEq1 == j2EnEq1) { // ambos en el mismo equipo
		        cuantosJuntos++;
		    } else {
		        cuantosSeparados++;
		    }
		}
		
		System.out.println("Cuantos jugaron juntos:"+cuantosJuntos);
		System.out.println("Cuantos jugaron separados:"+cuantosSeparados);
		
	}
	
	public void verHistorico() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEE dd 'de' MMMMMMMMM 'de' yyyy");
		for (Fecha fecha : fechas) {
			System.out.println(sdf.format(fecha.getFecha().getTime()));
			System.out.println(fecha.getEquipo1());
			System.out.println(fecha.getEquipo2());
		}
	}
	
}
