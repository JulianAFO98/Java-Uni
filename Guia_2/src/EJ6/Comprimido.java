package EJ6;

import java.util.ArrayList;
import java.util.Date;

public class Comprimido extends Archivo{

	private ArrayList<Directorio> subDirectorios = new ArrayList<Directorio>();
	private ArrayList<Archivo> archivos = new ArrayList<Archivo>();
	private  double tasaCompresion;
	public Comprimido(String nombreArchivo, Date fechaCreacion, Date ultimaModificacion, int tamanio,double tasaCompresion) {
		super(nombreArchivo, fechaCreacion, ultimaModificacion, tamanio);
		this.tasaCompresion = tasaCompresion;
	}
	
	public  double calcularTamanioComprimido() {
		int tamanio = 0;
		for (Archivo archivo : archivos) {
			tamanio += archivo.getTamanio();
		}
		for (Directorio directorio : subDirectorios) {
			tamanio+=directorio.obtenerTamanioDirectorio();
		}
		return tamanio * tasaCompresion;
		
	}
	@Override
	public String toString() {
		String r = "";
		r+=this.getNombreArchivo();
		for (Archivo archivo : archivos) {
			r+=archivo.toString();
		}
		for (Directorio directorio : subDirectorios) {
			r+=directorio.toString();
		}
		return r;
	}
	
	public void agregarDirectorio(Directorio d) {
		subDirectorios.add(d);
	}
	
	public void agregarArchivo(Archivo a) {
		archivos.add(a);
	}
	
}
