package ej56.modelo;

import java.util.HashMap;

public class Biblioteca {
    private HashMap<Integer, Libro> libros = new HashMap<>();
    private HashMap<Integer, Revista> revistas = new HashMap<>();

    public Libro retirarLibro(int i, SocioLibro s) throws InterruptedException {
        synchronized (libros) {
            while (!libros.containsKey(i))
                libros.wait();
            Libro lib = libros.remove(i);
            System.out.println(s.getName() + " retiro el libro: " + i);
            return lib;
        }
    }

   public void devolverLibro(Libro lib, SocioLibro s) {
        synchronized (libros) {
            libros.put(lib.getIdLibro(), lib);
            System.out.println(s.getName() + " devolvió el libro: " + lib.getIdLibro());
            libros.notifyAll();
        }
    }

    public void agregarLibro(Libro l) {
        libros.put(l.getIdLibro(), l);
    }

    public void agregarRevista(Revista r) {
        revistas.put(r.getIdRevista(), r);
    }

       public void donarLibro(Libro libADonar, Donador donador) throws InterruptedException {
        synchronized (libros) {
            while (libros.size() == 10)
                libros.wait();

            libros.put(libADonar.getIdLibro(), libADonar);
            System.out.println(donador.getName() + " donó el libro " + libADonar.getIdLibro());
            libros.notifyAll();
        }
    }

    public Revista retirarRevista(int i, SocioRevista socioRevista) throws InterruptedException {
        synchronized (revistas) {
            while (!revistas.containsKey(i))
                revistas.wait();

            Revista rev = revistas.remove(i);
            System.out.println(socioRevista.getName() + " retiró la revista: " + i);
            return rev;
        }
    }

   public void devolverRevista(Revista rev, SocioRevista socioRevista) {
        synchronized (revistas) {
            revistas.put(rev.getIdRevista(), rev);
            System.out.println(socioRevista.getName() + " devolvió la revista: " + rev.getIdRevista());
            revistas.notifyAll();
        }
    }

}
