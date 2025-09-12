package Ej4;

import java.util.ArrayList;

public class Prueba {
	public static void main(String[] args) {
		 ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	        // Agregamos Autos
	        vehiculos.add(new Auto("ABC123", 5));
	        vehiculos.add(new Auto("XYZ789", 3));
	        vehiculos.add(new Auto("JKL456", 4));

	        // Agregamos Combis
	        vehiculos.add(new Combi("AAA111", 12));
	        vehiculos.add(new Combi("BBB222", 15));

	        // Agregamos Camiones
	        vehiculos.add(new Camion("CCC333", 10.0));
	        vehiculos.add(new Camion("DDD444", 20.0));

	        // Agregamos Camionetas de carga
	        vehiculos.add(new CamionetaCarga("EEE555", 2.0));
	        vehiculos.add(new CamionetaCarga("FFF666", 5.0));

	        // Recorremos e imprimimos los datos
	        for (Vehiculo v : vehiculos) {
	            System.out.println(v.toString());
	        }
	}
}
