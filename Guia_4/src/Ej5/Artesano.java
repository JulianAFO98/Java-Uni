package Ej5;

public abstract class Artesano {

	private String nombre;

	public Artesano(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public abstract String trabajar(Material mat);
}
