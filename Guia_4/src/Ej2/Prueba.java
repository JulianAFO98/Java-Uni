package Ej2;

import java.util.Collections;
import java.util.Date;

public class Prueba {
	public static void main(String[] args) {
		PublicacionEscrita l = new Libro("Guerra de los mundos", "AC45", new Date());
		PublicacionEscrita r = new Revista("Billiken", "ZZ67", new Date(), 78);
		System.out.println(l.toString());
		System.out.println(r.toString());
		CD cd = new CD("CD001", "Grandes Éxitos", "Artista X");
		cd.agregarCancion(new Cancion(1, "Canción A", 345));
		cd.agregarCancion(new Cancion(2, "Canción B", 190));
		cd.agregarCancion(new Cancion(3, "Canción C", 200));
		CD cd2 = new CD("AB001", "Grandes Éxitos", "Artista A");
		cd2.agregarCancion(new Cancion(1, "Canción A", 345));
		cd2.agregarCancion(new Cancion(2, "Canción B", 190));
		cd2.agregarCancion(new Cancion(3, "Canción C", 200));
		Biblioteca b = new Biblioteca("La Marta");
		b.agregarCD(cd);
		b.agregarCD(cd2);
		b.mostrarCDs();
		Collections.sort(b.getCDs());
		b.mostrarCDs();

	}
}
