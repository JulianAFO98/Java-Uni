package Ej7;

import java.util.HashMap;

public class Agenda {
	
	String nombreAgenda;
	private HashMap<String,Contacto> contactos = new HashMap<String,Contacto>();
	
	public Agenda(String nombreAgenda) {
		this.nombreAgenda = nombreAgenda;
	}
	
	public void agregarContacto(Contacto cont) { // alta
		if(!contactos.containsKey(cont.getNombre())) {
			contactos.put(cont.getNombre(), cont);
		}else {
			System.out.println("No se puede agregar un contacto existente");
		}
	}
	
	public void eliminarContacto(Contacto cont) { //baja
		if(contactos.containsKey(cont.getNombre())) {
			contactos.remove(cont.getNombre());
		}else {
			System.out.println("El contacto a eliminar no existe");
		}
	}
	
	public void modificarNombreContacto(String clave,String nuevoNombre) { // Modificar
		if(contactos.containsKey(clave)) {
			Contacto c = contactos.get(clave);
			c.setNombre(nuevoNombre);
			contactos.remove(clave);
			agregarContacto(c);
		}else {
			System.out.println("El contacto a modificar no existe");
		}
	}
	
	public void modificarTelFijo(String clave,String nuevoNumero) { // Modificar
		if(contactos.containsKey(clave)) {
			Contacto c = contactos.get(clave);
			c.setNombre(nuevoNumero);
		}else {
			System.out.println("El contacto a modificar no existe");
		}
	}
	
	public Contacto buscarPorNombre(String nombre) {
		return contactos.get(nombre);
	}

	@Override
	public String toString() {
		return "Agenda [nombreAgenda=" + nombreAgenda + ", contactos=" + contactos + "]";
	}
	
	
	
}
