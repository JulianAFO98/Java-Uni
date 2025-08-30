package Ej8;

public class Jugador {
	private String nombre;
	private int anioNacimiento;
	private int numCamiseta;
	private int posicion;
	private int cantPartidosJugados;
	private int cantGolesConvertidos;
	
	
	public Jugador(String nombre, int anioNacimiento, int numCamiseta, int posicion, int cantPartidosJugados,int cantGolesConvertidos) {
		this.nombre = nombre;
		this.anioNacimiento = anioNacimiento;
		this.numCamiseta = numCamiseta;
		this.posicion = posicion;
		this.cantPartidosJugados = cantPartidosJugados;
		this.cantGolesConvertidos = cantGolesConvertidos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAnioNacimiento() {
		return anioNacimiento;
	}


	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}


	public int getNumCamiseta() {
		return numCamiseta;
	}


	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}


	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	public int getCantPartidosJugados() {
		return cantPartidosJugados;
	}


	public void setCantPartidosJugados(int cantPartidosJugados) {
		this.cantPartidosJugados = cantPartidosJugados;
	}


	public int getCantGolesConvertidos() {
		return cantGolesConvertidos;
	}


	public void setCantGolesConvertidos(int cantGolesConvertidos) {
		this.cantGolesConvertidos = cantGolesConvertidos;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", anioNacimiento=" + anioNacimiento + ", numCamiseta=" + numCamiseta
				+ ", posicion=" + posicion + ", cantPartidosJugados=" + cantPartidosJugados + ", cantGolesConvertidos="
				+ cantGolesConvertidos + "]";
	}
	
	
	
	
}
