package ej7.modelo;

import java.util.ArrayList;

public class Bote {
    private int orillaActual;
    private int capacidadMaxima;
    private ArrayList<Pasajero> pasajeros = new ArrayList<>();
    private int[] personasEsperando;

    public Bote(int orillaActual, int capacidadMaxima, int personasIzq, int personasDer) {
        this.orillaActual = orillaActual;
        this.capacidadMaxima = capacidadMaxima;
        this.personasEsperando = new int[] { personasIzq, personasDer };
    }

    public void agregarPasajero(Pasajero p) {
        System.out.println(p.getName() + " subió al barco");
        this.pasajeros.add(p);
    }

    public void bajarPasajeros() {
        for (Pasajero pasajero : pasajeros) {
            System.out.println(pasajero.getName() + " se está bajando del bote en la orilla "
                    + (orillaActual == 0 ? "izquierda" : "derecha"));
        }
        this.pasajeros.clear();
    }

    public synchronized void subirPasajeroAlBote(Pasajero pasajero) throws InterruptedException {
        while (pasajeros.size() >= capacidadMaxima || pasajero.getOrillaPasajero() != orillaActual) {
            wait();
        }

        agregarPasajero(pasajero);
        personasEsperando[orillaActual]--;

        if (pasajeros.size() == capacidadMaxima || personasEsperando[orillaActual] == 0) {
            System.out.println("El barco está viajando hacia la orilla " + (orillaActual == 0 ? "derecha" : "izquierda"));
            bajarPasajeros();
            this.orillaActual = orillaActual == 0 ? 1 : 0;
            notifyAll();
        }
    }

    public synchronized void verificarYZarpar() {
        if (pasajeros.isEmpty() && personasEsperando[orillaActual] == 0) {
            System.out.println("Operario: cruzando vacío hacia la orilla " + (orillaActual == 0 ? "derecha" : "izquierda"));
            this.orillaActual = orillaActual == 0 ? 1 : 0;
            notifyAll(); // 🔔 necesario
        } else if (!pasajeros.isEmpty()) {
            System.out.println("Operario: zarpa con " + pasajeros.size() + " pasajeros");
            bajarPasajeros();
            this.orillaActual = orillaActual == 0 ? 1 : 0;
            notifyAll();
        } else {
            System.out.println("Operario: espera más pasajeros...");
        }
    }

    public synchronized boolean seguirOperando() {
        return personasEsperando[0] > 0 || personasEsperando[1] > 0 || !pasajeros.isEmpty();
    }
}

