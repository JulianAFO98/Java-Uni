package Ej2;

public class Cancion {
	private int numeroDePista;
	private String titulo;
	private int duracion;
	
	public Cancion(int numeroDePista, String titulo, int duracion) {
		this.numeroDePista = numeroDePista;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public int getNumeroDePista() {
		return numeroDePista;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return "Cancion:" + numeroDePista + ", Titulo:" + titulo;
	}
	
	
	
	
}
