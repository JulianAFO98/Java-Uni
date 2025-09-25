package Ej3;

public class Prueba {
	public static void main(String[] args) {
		
		Surtidor surtidor = new Surtidor();

		// 1. Error: cantidad <= 0
		try {
			surtidor.cargarCombustible("diesel", 0);
		} catch (CargaInvalidaException e) {
			System.out.println("Excepción capturada (cantidad inválida): " + e);
		}

		// 2. Error: tipo de combustible inválido
		try {
			surtidor.cargarCombustible("agua", 10);
		} catch (Exception e) {
			System.out.println("Excepción capturada (tipo inválido): " + e);
		}

		// 3. Error: falta de combustible
		try {
			surtidor.cargarCombustible("super", 200000); // más de lo disponible
		} catch (Exception e) {
			System.out.println("Excepción capturada (falta combustible): " + e);
		}

		// 4. Carga válida
		try {
			surtidor.cargarCombustible("premium", 20);
			System.out.println("Carga válida realizada correctamente.");
		} catch (Exception e) {
			System.out.println("No debería fallar aquí: " + e);
		}
	}
}
