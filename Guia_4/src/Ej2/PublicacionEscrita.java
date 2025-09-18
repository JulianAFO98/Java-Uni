package Ej2;

import java.util.Date;

public abstract class PublicacionEscrita {
	private String titulo;
	private String codigo;
	private Date anioPublicacion;
	
	public PublicacionEscrita(String titulo, String codigo, Date anioPublicacion) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.anioPublicacion = anioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public Date getAnioPublicacion() {
		return anioPublicacion;
	}
	
	
	
}
