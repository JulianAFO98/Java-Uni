package Ej7;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	private ArrayList<IPersonaje> personajes = new ArrayList<IPersonaje>();
	private static Mazo _instance = null;
	
	
	public static Mazo getInstance() {
		if(_instance == null) {
			_instance = new Mazo();
		}
		return _instance;
	}
	
	public void agregarPersonaje(IPersonaje p) {
	    personajes.add(p);
	}
	
	public int tamaño() {
	    return personajes.size();
	}
	
	public void mostrarPersonajes() {
	    for(IPersonaje p : personajes) {
	        System.out.println(p);
	    }
	}
	
	public IPersonaje eligeAdversario() {
	    Mazo mazo = Mazo.getInstance();
	    IPersonaje elegido;
	    do {
	        elegido = mazo.getAleatorio();
	    } while (elegido == this); 
	    return elegido;
	}
	
	public IPersonaje getAleatorio() {
	    Random r = new Random();
	    int index = r.nextInt(personajes.size());
	    return personajes.get(index);
	}


}
