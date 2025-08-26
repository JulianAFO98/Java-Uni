package Ej3;

public class Prueba {

	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria("Julian");
		cb.depositar(-500);
		System.out.println(cb.getSaldo());
		cb.depositar(250);
		System.out.println(cb.getSaldo());
		System.out.println(cb.extraer(-500));
		System.out.println(cb.extraer(500));
		System.out.println(cb.extraer(150));
		System.out.println(cb.getSaldo());
	}

}
