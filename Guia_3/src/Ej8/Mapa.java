package Ej8;

import java.util.ArrayList;

public class Mapa {
	private String nombre;
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
	
	public Mapa(String nombre) {
		this.nombre = nombre;
	}

	
	
	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}



	public void agregarPersonaje(Personaje p) {
		personajes.add(p);
	}
		
	public void eliminarPersonaje(Personaje p) {
		personajes.remove(p);
	}

}
