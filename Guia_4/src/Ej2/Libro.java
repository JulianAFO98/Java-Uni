package Ej2;

import java.util.Date;

public class Libro extends PublicacionEscrita implements Prestable{
	
	private boolean prestado;
	public Libro(String titulo, String codigo, Date anioPublicacion) {
		super(titulo, codigo, anioPublicacion);
		this.prestado = false;
	}
	@Override
	public void prestar() {
		System.out.println("Se presto el libro");
		this.prestado=true;
	}
	@Override
	public void devolver() {
		System.out.println("Se devolvio el libro");
		this.prestado=false;
		
	}
	@Override
	public boolean isPrestado() {
		return this.prestado;
	}
	@Override
	public String toString() {
		return "Libro Estado:" + prestado + ", Titulo: " + getTitulo() + ", Codigo: " + getCodigo();
	}
	
	
	

}
