package Ej2;

import java.util.ArrayList;

public class Biblioteca {
	private String nombreLibreria;
	private ArrayList<CD> cds = new ArrayList<CD>();
	
	public Biblioteca(String nombreLibreria) {
		this.nombreLibreria = nombreLibreria;
	}
	
	
	public void agregarCD(CD cd) {
		cds.add(cd);
	}
	
	public void mostrarCDs() {
		for (CD cd : cds) {
			System.out.println(cd.toString());
		}
	}


	public ArrayList<CD> getCDs() {
		return cds;
	}
	
	
	
	
	
}
