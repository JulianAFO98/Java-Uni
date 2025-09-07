package EJ6;

import java.util.Date;

public class Archivo {
	private String nombreArchivo;
	private Date fechaCreacion;
	private Date ultimaModificacion;
	private int tamanio;
	
	public Archivo(String nombreArchivo, Date fechaCreacion, Date ultimaModificacion, int tamanio) {
		this.nombreArchivo = nombreArchivo;
		this.fechaCreacion = fechaCreacion;
		this.ultimaModificacion = ultimaModificacion;
		this.tamanio = tamanio;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}
	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	@Override
	public String toString() {
		return  nombreArchivo +" (" + tamanio + "kb)\n";
	}
	
	
	
	
}
