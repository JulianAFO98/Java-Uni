package Ej1;

public class Prueba {

	public static void main(String[] args) {
		Usuario u = null;

		try {
			u = new Usuario("Juan", "J123456");
		} catch (NombreInvalidoException e) {
			System.out.println(e.getMsg());
		} catch (ContrasenaInvalidaException e) {
			System.out.println(e.getMsg());
		}

		
		
		try {
			u.setNombre(null);
		} catch (NombreInvalidoException e) {
			System.out.println(e.getMsg());
		}

		try {
			u.setContrasena("ABC1234");
		} catch (ContrasenaInvalidaException e) {
			System.out.println(e.getMsg());
		}
	}

}
