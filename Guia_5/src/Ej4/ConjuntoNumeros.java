package Ej4;

import java.util.Arrays;

public class ConjuntoNumeros implements Cloneable{
	private Numero[] celda;
	private int largo;
	private String nombre;
	public ConjuntoNumeros(String nombre,int largo) {
		this.largo = largo;
		this.nombre = nombre;
		this.celda =  new Numero[largo];
	}
	public Numero[] getCelda() {
		return celda;
	}
	public int getLargo() {
		return largo;
	}
	public String getNombre() {
		return nombre;
	}
	
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		ConjuntoNumeros clonado = (ConjuntoNumeros) super.clone();
		clonado.celda = celda.clone();
		for (int i =0;i<this.largo;i++) {// preguntar por el null
			clonado.celda[i]=null;
		}
		for (int i =0;i<this.largo;i++) { 
			if (this.celda[i]!=null)
				clonado.celda[i]=(Numero)this.celda[i].clone();
		}
		return clonado;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "ConjuntoNumeros [celda="
				+ (celda != null ? Arrays.asList(celda).subList(0, Math.min(celda.length, maxLen)) : null) + ", largo="
				+ largo + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}
