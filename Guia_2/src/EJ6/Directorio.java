package EJ6;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private String nombreDirectorio;
	private Date fechaCreacion;
	private ArrayList<Archivo> archivos = new ArrayList<Archivo>();
	private ArrayList<Directorio> subDirectorios = new ArrayList<Directorio>();
	
	
	
	
	public Directorio(String nombreDirectorio, Date fechaCreacion) {
		super();
		this.nombreDirectorio = nombreDirectorio;
		this.fechaCreacion = fechaCreacion;
	}

	public int obtenerTamanioDirectorio() {
		int tamanio = 0;
		for (Archivo archivo : archivos) {
			tamanio += archivo.getTamanio();
		}
		for (Directorio directorio : subDirectorios) {
			tamanio+=directorio.obtenerTamanioDirectorio();
		}
		return tamanio;
	}
	
	public void agregarDirectorio(Directorio d) {
		subDirectorios.add(d);
	}
	
	public void agregarArchivo(Archivo a) {
		archivos.add(a);
	}
	
	@Override
	public String toString() {
		String r = "";
		r+=this.nombreDirectorio;
		for (Archivo archivo : archivos) {
			r+=archivo.toString();
		}
		for (Directorio directorio : subDirectorios) {
			r+=directorio.toString()+"\n";
		}
		return r;
	}
	
}
