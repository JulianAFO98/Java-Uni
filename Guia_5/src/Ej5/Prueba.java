package Ej5;

public class Prueba {

	public static void main(String[] args) {
		try {
			Domicilio dom1 = new Domicilio("Av. Siempre Viva", 742);
			Persona p1 = new Persona(12345678, "Fernandez", dom1, 101,new Gato(10,"Michi"));
			Persona p3 = new Persona(12345678, "Fernandez", dom1, 101,new Gato(10,"Firulais"));

			// Clonamos la persona
			Persona p2 = (Persona) p3.clone();

			// Mostramos antes de modificar
			System.out.println("Antes de modificar:");
			System.out.println("p1 = " + p1);
			System.out.println("p2 = " + p2);

			// Modificamos el domicilio del clon
			p2.getDomicilio().setCalle("Calle Falsa");
			p2.getDomicilio().setNumero(123);

			// Modificamos el apellido del clon
			p2.setApellido("Gomez");

			System.out.println("\nDespués de modificar el clon:");
			System.out.println("p1 = " + p1);
			System.out.println("p2 = " + p2);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
