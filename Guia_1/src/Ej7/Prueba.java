package Ej7;

public class Prueba {

	public static void main(String[] args) {
        // Crear agenda
        Agenda miAgenda = new Agenda("Mi Agenda");

        // Crear contactos
        Contacto c1 = new Contacto("Juan", "1234", "555-1111");
        Contacto c2 = new Contacto("Ana", "5678");
        Contacto c3 = new Contacto("Luis");
        
        // Agregar contactos
        miAgenda.agregarContacto(c1);
        miAgenda.agregarContacto(c2);
        miAgenda.agregarContacto(c3);

        // Mostrar agenda
        System.out.println("Agenda inicial:");
        System.out.println(miAgenda);

        // Buscar contacto
        System.out.println("\nBuscando contacto 'Ana':");
        System.out.println(miAgenda.buscarPorNombre("Ana"));

        // Modificar nombre de contacto
        System.out.println("\nModificando nombre de 'Luis' a 'Luisito':");
        miAgenda.modificarNombreContacto("Luis", "Luisito");
        System.out.println(miAgenda);

        // Modificar teléfono fijo
        System.out.println("\nModificando telFijo de 'Juan':");
        miAgenda.modificarTelFijo("Juan", "9999");  // ⚠ ojo, tu método actualmente modifica el nombre por error
        System.out.println(miAgenda);

        // Eliminar contacto
        System.out.println("\nEliminando contacto 'Ana':");
        miAgenda.eliminarContacto(c2);
        System.out.println(miAgenda);

        // Agregar celular a un contacto
        System.out.println("\nAgregando celular a 'Luisito':");
        Contacto luisito = miAgenda.buscarPorNombre("Luisito");
        if (luisito != null) {
            luisito.agregarCelular("555-2222");
        }
        System.out.println(miAgenda);
    }

}
