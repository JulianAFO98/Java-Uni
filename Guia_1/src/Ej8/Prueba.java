package Ej8;


public class Prueba {
    public static void main(String[] args) {
        // Crear el torneo (Singleton)
        Torneo torneo = Torneo.getInstance();

        // Crear equipos
        Equipo equipo1 = new Equipo("Rojo", 2, 1, 0, 5, 2);
        Equipo equipo2 = new Equipo("Azul", 1, 2, 0, 4, 3);

        // Agregar equipos al torneo
        torneo.getEquipos().add(equipo1);
        torneo.getEquipos().add(equipo2);

        // Crear jugadores para equipo1
        Jugador j1 = new Jugador("Juan", 1995, 10, 1, 3, 2);
        Jugador j2 = new Jugador("Pedro", 1998, 9, 2, 3, 3);
        equipo1.getJugadores().add(j1);
        equipo1.getJugadores().add(j2);

        // Crear jugadores para equipo2
        Jugador j3 = new Jugador("Luis", 1996, 7, 1, 3, 1);
        Jugador j4 = new Jugador("Carlos", 1997, 8, 2, 3, 4);
        equipo2.getJugadores().add(j3);
        equipo2.getJugadores().add(j4);

        // Crear un partido
        Fecha fechaPartido = new Fecha(2025, 8, 29);
        torneo.agregarPartido(2025, 8, 29, equipo1, equipo2);
    

        // Registrar goles (ejemplo)
        Partido p1 = new Partido(fechaPartido, equipo1, equipo2);
        p1.agregarGol(j1, equipo1); // Juan marca para Rojo
        p1.agregarGol(j2, equipo1); // Pedro marca para Rojo
        p1.agregarGol(j4, equipo2); // Carlos marca para Azul

        // Mostrar goleador de cada equipo
        System.out.println("Goleador de " + equipo1.getNombre() + ": " + equipo1.obtenerGoleador().getNombre());
        System.out.println("Goleador de " + equipo2.getNombre() + ": " + equipo2.obtenerGoleador().getNombre());

        // Comparar equipos
        int resultadoComparacion = equipo1.compararCon(equipo2);
        if (resultadoComparacion > 0) {
            System.out.println(equipo1.getNombre() + " es mejor que " + equipo2.getNombre());
        } else if (resultadoComparacion < 0) {
            System.out.println(equipo2.getNombre() + " es mejor que " + equipo1.getNombre());
        } else {
            System.out.println(equipo1.getNombre() + " y " + equipo2.getNombre() + " están empatados");
        }

        // Mostrar datos del equipo ganador
        torneo.datosEquipo(equipo1, equipo2);

        // Mostrar resultados del partido
        p1.getGoles().forEach(g -> 
            System.out.println(g.getJ().getNombre() + " marcó para " + g.getEquipoAnotador().getNombre())
        );
    }
}

