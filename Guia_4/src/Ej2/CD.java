package Ej2;

import java.util.ArrayList;

public class CD implements Prestable,Comparable<CD>{
	private String codigo;
	private String titulo;
	private String interprete;
	private boolean prestado;
	private ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	
	public CD(String codigo, String titulo, String interprete) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.interprete = interprete;
		this.prestado = false;
		
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getInterprete() {
		return interprete;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	@Override
	public void prestar() {
	 System.out.println("Se presto el CD");
	 this.prestado=true;
		
	}

	@Override
	public void devolver() {
		 System.out.println("Se devolvio el CD");
		 this.prestado=false;
		
	}
	public void agregarCancion(Cancion c) {
		canciones.add(c);
	}
	
	@Override
	public boolean isPrestado() {
		return this.prestado;
	}

	@Override
	public String toString() {
		String r = "CD Codigo:" + this.codigo + ",Titulo: " + this.titulo + ",Interprete:" + this.interprete + ", Prestado:" + this.prestado+",Lista de canciones: ";
		
		for (Cancion cancion : canciones) {
			r+="\n"+cancion.toString();
		}
		return r;
	}

	@Override
	public int compareTo(CD c) {
		int compare = 0;
		if (this.interprete.compareTo(c.interprete) > 0)
			compare = 1;
		else if(this.interprete.compareTo(c.interprete) < 0)
			compare = -1;
		return compare;
		//o return this.interprete.compareTo(c.interprete); // ya devuelve -1 0 o 1
	}

	
	
	
	

}
