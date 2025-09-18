package Ej2;

import java.util.Date;

public class Revista extends PublicacionEscrita{
	private int numero;
	public Revista(String titulo, String codigo, Date anioPublicacion,int numero) {
		super(titulo, codigo, anioPublicacion);
		this.numero=numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return "Revista Titulo: " + getTitulo() + ", Codigo: " + getCodigo();
	}
	
	
}
