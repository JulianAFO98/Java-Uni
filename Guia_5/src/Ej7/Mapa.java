package Ej7;

import java.util.ArrayList;

public class Mapa {
	private String nombre;
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
	
	public Mapa(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	public void ataca(Personaje p1,Personaje p2) throws AtaqueImposibleException {
		p1.ataca(p2);
	}
	
	public void mueve(Personaje p,double x,double y) {
		try {
			p.incrementaPos(x, y);
		} catch (IncrementoImposibleException e) {
			double distMaximaPermitida=e.getMaxDistanciaSoportada();
			double avanceX = x<=distMaximaPermitida ? x : distMaximaPermitida;
			double avanceY = y<=distMaximaPermitida ? y : distMaximaPermitida;
			p.getPos().incrementaPos(avanceX, avanceY);
		}
	}

	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Mapa clonado = (Mapa)super.clone();
		clonado.personajes = (ArrayList<Personaje>) this.personajes.clone();
		clonado.personajes.clear();
		for (int i=0;i<this.personajes.size();i++) {
			clonado.personajes.add((Personaje)this.personajes.get(i).clone());
		}
		return clonado;
	}





	public void agregarPersonaje(Personaje p) {
		personajes.add(p);
	}
		
	public void eliminarPersonaje(Personaje p) {
		personajes.remove(p);
	}

}
