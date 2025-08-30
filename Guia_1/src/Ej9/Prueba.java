package Ej9;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Prueba {
	
	    public static void main(String[] args) {
	        // Crear jugadores
	        Jugador j1 = new Jugador("Juan", 0);
	        Jugador j2 = new Jugador("Pedro", 0);
	        Jugador j3 = new Jugador("Ana", 0);
	        Jugador j4 = new Jugador("Luis", 0);

	        ArrayList<Jugador> todos = new ArrayList<Jugador>();
	        todos.add(j1);
	        todos.add(j2);
	        todos.add(j3);
	        todos.add(j4);

	        // Crear histórico
	        Historico historico = new Historico(todos);

	        // Agregar fechas (partidos)
	        historico.agregarFecha(new GregorianCalendar(2025, 7, 29)); // Agosto es 7
	        historico.agregarFecha(new GregorianCalendar(2025, 7, 30));

	        // Dar resultados
	        historico.darResultadosAFecha(2, 1, 1); // Primer partido: equipo1 gana
	        historico.darResultadosAFecha(0, 0, 2); // Segundo partido: empate

	        // Ver histórico
	        System.out.println("=== Histórico de Partidos ===");
	        historico.verHistorico();

	        // Consultar cuántos jugaron juntos y separados
	        System.out.println("\n=== Estadísticas de jugadores ===");
	        historico.enCuantosJuntosYEnfrentados(j1, j2);
	        historico.enCuantosJuntosYEnfrentados(j1, j3);
	    }
}
