package Ej5;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Chofer> choferes = new ArrayList<Chofer>();
	private ArrayList<Colectivo> colectivos = new ArrayList<Colectivo>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	
	public Empresa(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int cuantoChofSuperanMonto(double monto) {
		int cuantos=0;
		for(int i = 0;i<choferes.size();i++) {
			if(choferes.get(i).getCategoria().getSueldo() > monto)
				cuantos++;
		}
		return cuantos;
		
	}
	
	
	
	public int cuantosChoferesSinColectivo() {
		int cuantos=0;
		for(int i = 0;i<choferes.size();i++) {
			if(choferes.get(i).getColectivo() == null)
				cuantos++;
		}
		return cuantos;
	}
	
	public String queCateSuperanMonto(double monto) {
		String s = "";
		for(int i = 0;i<categorias.size();i++) {
			if(categorias.get(i).getSueldo() > monto)
				s+= categorias.get(i).getNombreCategoria();
		}
		return s;
	}
	
	public  int cuantosChofACategoria(Categoria cat) {
		int cuantos = 0;
		for (int i = 0; i < this.choferes.size(); i++) {
			if(this.choferes.get(i).getCategoria() == cat)
				cuantos++;
			
		}
		return cuantos;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Chofer> getChoferes() {
		return choferes;
	}
	public void setChoferes(ArrayList<Chofer> choferes) {
		this.choferes = choferes;
	}

	public int cuantosColectivos() {
		return colectivos.size();
	}

	public void setColectivos(ArrayList<Colectivo> colectivos) {
		this.colectivos = colectivos;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
	
	
}
