package Ej2;

public class Prueba {
	public static void main(String[] args) {
		Punto p1 = new Punto(2, 3); // ok
		Punto p2; // ok
		Punto p3 = newPunto(); // error deberia ser new Punto()
		System.out.println("P1=" + p1.cartel());// ok
		p3 = p2; // p3 = p2 = null
		p2 = p1; // p2 = p1 = punto(2,3),p3 queda null
		p1.cambia(8, 5); // ok
		System.out.println("P2=" + p2.cartel()); // [8,5]
	}
}
