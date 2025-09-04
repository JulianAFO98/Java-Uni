package Ej3;

public class Prueba {

	public static void main(String[] args) {
		CuentaBancaria c1 =  new CajaAhorro("Agustin",20);
		CuentaBancaria c2 =  new CuentaUniversitaria("Pedro");
		CuentaBancaria c3 =  new CuentaCorriente("Julian",2000);
		
		c1.depositar(2000);
		c2.depositar(2000);
		c3.depositar(1500);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		System.out.println(c3.getSaldo());
		
		c1.extraer(1500);
		c2.extraer(10);
		c2.extraer(1000);
		c3.extraer(6000);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		System.out.println(c3.getSaldo());


		
	}

}
