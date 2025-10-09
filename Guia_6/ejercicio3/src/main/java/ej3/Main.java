package ej3;

import ej3.modelo.ConjuntoGenerico;
import ej3.modelo.ConjuntoGenericoOrdenado;
import ej3.modelo.Persona;
import ej3.modelo.excepciones.OperacionConjuntosException;

public class Main {
    public static void main(String[] args) {
        ConjuntoGenerico<Persona> personas = new ConjuntoGenerico<>();
        Persona p1 = new Persona("Julian", "Fernandez", "111111111", 32);
        Persona p2 = new Persona("Pedro", "Fernandez", "222222222", 15);
        Persona p3 = new Persona("Alvaro", "Fernandez", "333333333", 32);
        try {
            personas.agrega(p1);
            personas.agrega(p2);
            personas.agrega(p3);
        } catch (OperacionConjuntosException e) {
            e.printStackTrace();
        }
        personas.mostrarTodos();

        ConjuntoGenericoOrdenado<Persona> personasOrdenadas = new ConjuntoGenericoOrdenado<>();
        
        try {
            personasOrdenadas.agrega(p1);
            personasOrdenadas.agrega(p2);
            personasOrdenadas.agrega(p3);
        } catch (OperacionConjuntosException e) {
            e.printStackTrace();
        }
        personasOrdenadas.mostrarTodos();
    }
}