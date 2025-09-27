package Ej5;

public class Animal implements Cloneable{
	private int esperanzaDeVida;
	private String nombre;
	
	public Animal(int esperanzaDeVida, String nombre) {
		this.esperanzaDeVida = esperanzaDeVida;
		this.nombre = nombre;
	}
	public int getEsperanzaDeVida() {
		return esperanzaDeVida;
	}
	public void setEsperanzaDeVida(int esperanzaDeVida) {
		this.esperanzaDeVida = esperanzaDeVida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Animal [esperanzaDeVida=" + esperanzaDeVida + ", nombre=" + nombre + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
