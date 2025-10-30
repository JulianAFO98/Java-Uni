package ej2;

public class Main {
    public static void main(String[] args) {
        Mostrador m = new Mostrador(5);
        Cliente c1 = new Cliente("Juan", 1, 5, m);
        Cliente c2 = new Cliente("Laura", 2, 5, m);
        Cliente c3 = new Cliente("Pedro", 3, 5, m);
        Cliente c4 = new Cliente("Ana", 4, 5, m);
        Cliente c5 = new Cliente("Anticitera", 5, 5, m);

        c1.start();
        c5.start();
        c4.start();
        c3.start();
        c2.start();


    }
}