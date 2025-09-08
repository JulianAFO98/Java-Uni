package Ej7;

public class Prueba {
	public static void main(String[] args) {
        Equipo equipo = new Equipo("Los Titanes");

        // Agregar jugadores
        System.out.println(equipo.agregaDelantero("Messi", 0.9, 0.95));
        System.out.println(equipo.agregaDefensor("Ramos", 0.8, 0.7));
        System.out.println(equipo.agregaArquero("Neuer", 0.7, 0.6));

        // Intento con parámetros fuera de rango
        System.out.println(equipo.agregaDelantero("Errorcito", 2, 0.5));

        // Mostrar jugadores agregados
        System.out.println("\nJugadores del equipo:");
        for (Jugador j : equipo.getJugadores()) {
            System.out.println("- " + j.getClass().getSimpleName() + " (" + j.nombre + ")");
        }

        // Mostrar índices
        System.out.println("\nÍndices del equipo:");
        System.out.println("Índice de ataque total: " + equipo.indiceAtaque());
        System.out.println("Índice de defensa total: " + equipo.indiceDefensa());
    }
}
