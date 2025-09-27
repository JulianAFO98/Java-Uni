package Ej4;

public class Prueba {
	public static void main(String[] args) {
		ConjuntoNumeros cn1 = new ConjuntoNumeros("C1",10);
		cn1.getCelda()[0] = new Numero(2);
		cn1.getCelda()[5] = new Numero(5);
		cn1.getCelda()[8] = new Numero(6);
		System.out.println(cn1);
		ConjuntoNumeros cn2=null;
		try {
			cn2 = (ConjuntoNumeros) cn1.clone();
		} catch (CloneNotSupportedException e) {
			
		}
		cn2.getCelda()[1] = new Numero(16);
		System.out.println(cn2);
	}
}
