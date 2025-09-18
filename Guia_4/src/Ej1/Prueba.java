package Ej1;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		ArrayList<Emisor_de_Sonido> emisores = new ArrayList<Emisor_de_Sonido>();
		emisores.add(new Vaca("Vaquita",200));
		emisores.add(new Pollito("Pollito",100));
		emisores.add(new Gato("Michi",170));
		emisores.add(new Ambulancia("AA6786","A800","V12"));
		for (Emisor_de_Sonido emisor_de_Sonido : emisores) {
			System.out.println(emisor_de_Sonido.toString());
		}
	}

}
