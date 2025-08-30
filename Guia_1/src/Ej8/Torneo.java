package Ej8;

import java.util.ArrayList;

public class Torneo {
	private static Torneo _instance = null; 
	private static int partidoGanado = 3;
	private static int partidoEmpatado  = 1;
	
	private ArrayList<Partido> partidos = new ArrayList<Partido>();
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	
	public static Torneo getInstance() { // aplicable al Equipo de alguna manera?
		
		if (_instance == null) {
			_instance = new Torneo();
		}
		
		return _instance;
	}
	
	//preguntar tambien por eliminacion, id o ID partido?
	public boolean agregarPartido(int anio,int mes,int dia,Equipo equipo1,Equipo equipo2) {
		boolean compararNombres = !equipo1.getNombre().equals(equipo2.getNombre()); // preguntar
		//Comparar Id? no funciona
		if (compararNombres) { // preguntar por fecha localDate
			partidos.add(new Partido(new Fecha(anio,mes,dia),equipo1,equipo2));
		}
		return compararNombres;
	}
	
	
	public double datosJugador(Jugador j1) { // preguntar
		return (double) j1.getCantGolesConvertidos() / j1.getCantPartidosJugados();
	}
	
	public Jugador datosJugador(Jugador j1,Jugador j2) {
		return j1.getCantGolesConvertidos()>j2.getCantGolesConvertidos() ? j1 : j2;
	}
	
	
	
	
	public void datosEquipo(Equipo eq) {
		int i = 0;
		int sumaPuntos = 0;
		int partidosJugados;
		while (i<equipos.size() && equipos.get(i)!= eq) { // indexOf?
			i++;
		}
		if (i<equipos.size()) { // != null o -1?
			partidosJugados = 	equipos.get(i).getCantPartidosEmpatados()+
								equipos.get(i).getCantPartidosGanados()+
								equipos.get(i).getCantPartidosPerdidos();
			
			sumaPuntos = 	equipos.get(i).getCantPartidosEmpatados() * partidoEmpatado+
							equipos.get(i).getCantPartidosGanados() * partidoGanado;
			
			Jugador j = eq.obtenerGoleador();
			System.out.println("Equipo: " + eq.getNombre());
	        System.out.println("Partidos jugados: " + partidosJugados);
	        System.out.println("Puntos: " + sumaPuntos);
	        if (j!=null) { // preguntar
	        	System.out.println("Goleador:" + eq.obtenerGoleador());
	        }
		}
	}

	public void datosEquipo(Equipo eq1, Equipo eq2) { // preguntar
		Equipo ganador = eq1.compararCon(eq2) >= 0 ? eq1 : eq2;
		datosEquipo(ganador);
	}
	
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	

	public static int getPartidoGanado() {
		return partidoGanado;
	}

	public static void setPartidoGanado(int partidoGanado) {
		Torneo.partidoGanado = partidoGanado;
	}

	public static int getPartidoEmpatado() {
		return partidoEmpatado;
	}

	public static void setPartidoEmpatado(int partidoEmpatado) {
		Torneo.partidoEmpatado = partidoEmpatado;
	}

	
	public void indicarResultados(Partido p) { //Carece de sentido, usar un id?? ya tengo el partido requerido
		int i = partidos.indexOf(p); 
		String nombreEq1;
		int golesEq1 = 0;
		int golesEq2 = 0;
		if (i != -1) {
			nombreEq1 = p.getEq1().getNombre();
			for (int j = 0; j < p.getGoles().size(); j++) {
				System.out.println(p.getGoles().get(i).getJ().getNombre());
				if(nombreEq1.equals(nombreEq1)) {
					golesEq1++;
				}else
					golesEq2++;
			} 
		}
		System.out.println("Resultado: "+golesEq1+"-"+golesEq2);
	}
	
	
	
}
