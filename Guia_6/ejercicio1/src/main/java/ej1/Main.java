package ej1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

import ej1.modelo.Ordenadora;
import ej1.modelo.Persona;

public class Main {
    public static void main(String[] args) {
        Persona a = new Persona("Pedro","Fernandez","444444444",23);
        Persona b = new Persona("Lautaro","Alvarez","222222222",45);
        System.out.println("Caso diferentes completamente");
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println("Caso iguales completamente");
        b = new Persona("Pedro","Fernandez","444444444",23);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println("Caso diferentes parcialmente");
        b = new Persona("Pedro","Fernandez","111111111",22);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());


        Persona c =  new Persona("Alvaro","Rodriguez","111111111",22);
        Persona d =  new Persona("Ramiro","Rodriguez","111111111",22);

        Persona[] personas = { a, b, c, d };

        System.out.println("Antes de ordenar");
        for (Persona comparable : personas) {
            System.out.println(comparable);
        }
        System.out.println("Despues de ordenar");
        Ordenadora.ordenar(personas);
        for (Persona comparable : personas) {
            System.out.println(comparable);
        }


        Persona[] personas2 = { a, b, c, d };
        HashSet<Persona> hashSet = new HashSet<>();
        LinkedHashSet<Persona> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Persona> treeSet = new TreeSet<>();
        ArrayList<Persona> arrayList = new ArrayList<>();
        LinkedList<Persona> linkedList = new LinkedList<>();
        PriorityQueue<Persona> priorityQueue = new PriorityQueue<>();

        for (Persona p : personas2) {
            hashSet.add(p);
            linkedHashSet.add(p);
            treeSet.add(p);
            arrayList.add(p);
            linkedList.add(p);
            priorityQueue.add(p);
        }

         System.out.println("HashSet:");
        Iterator<Persona> it1 = hashSet.iterator();
        while (it1.hasNext()) System.out.println(it1.next());

        System.out.println("\nLinkedHashSet:");
        Iterator<Persona> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) System.out.println(it2.next());

        System.out.println("\nTreeSet:");
        Iterator<Persona> it3 = treeSet.iterator();
        while (it3.hasNext()) System.out.println(it3.next());

        System.out.println("\nArrayList:");
        Iterator<Persona> it4 = arrayList.iterator();
        while (it4.hasNext()) System.out.println(it4.next());

        System.out.println("\nLinkedList:");
        Iterator<Persona> it5 = linkedList.iterator();
        while (it5.hasNext()) System.out.println(it5.next());

        System.out.println("\nPriorityQueue (usando poll):");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
    
}