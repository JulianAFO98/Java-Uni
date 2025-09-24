package Ej1;

public class Usuario {
	String nombre;
	String contrasena;
	
	public Usuario(String nombre, String contrasena) throws NombreInvalidoException,ContrasenaInvalidaException{
		setNombre(nombre);
		setContrasena(contrasena);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreInvalidoException {
		if (nombre == null || nombre.isEmpty())
			throw new NombreInvalidoException("El nombre no puede ser null ni estar vacio");
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) throws ContrasenaInvalidaException {
		if(contrasena == null)
			throw new ContrasenaInvalidaException("La contrasena no puede ser null");
		if(contrasena.length()<6)
			throw new ContrasenaInvalidaException("La contrasena no puede tener menos de 6 caracteres");
		if(!empiezaConletra(contrasena))
			throw new ContrasenaInvalidaException("La contrasena debe empezar  con una letra");
		this.contrasena = contrasena;
	}

	private boolean empiezaConletra(String contrasena) {
		char primerLetra = contrasena.charAt(0);
		return Character.isLetter(primerLetra);
	}
	
	
	
	
	
}
