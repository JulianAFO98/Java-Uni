package EJ6;

import java.util.Date;

public class Prueba {
	public static void main(String[] args) {
        // Crear archivos simples
        Archivo archivo1 = new Archivo("archivo1.txt", new Date(), new Date(), 10);
        Archivo archivo2 = new Archivo("archivo2.txt", new Date(), new Date(), 20);

        // Crear link
        Link link1 = new Link("link1", new Date(), new Date(), 1);

        // Crear subdirectorio
        Directorio subDir = new Directorio("subDirectorio",new Date());
        subDir.agregarArchivo(archivo2);

        // Crear directorio principal
        Directorio principal = new Directorio("DirectorioPrincipal",new Date());
        
        principal.agregarArchivo(archivo1);
        principal.agregarArchivo(link1);
        principal.agregarDirectorio(subDir);

        // Crear archivo comprimido
        Comprimido zip = new Comprimido("archivoComprimido.zip", new Date(), new Date(), 0, 0.50);
        zip.agregarArchivo(new Archivo("fileInZip.txt", new Date(), new Date(), 40));
        zip.agregarDirectorio(subDir); // incluir subdirectorio dentro del comprimido

        // Agregar comprimido al directorio principal
        principal.agregarArchivo(zip);

        // Mostrar tamaños
        System.out.println("Tamaño total del directorio: " + principal.obtenerTamanioDirectorio() + "kb");
        System.out.println("Tamaño del archivo comprimido: " + zip.calcularTamanioComprimido() + "kb");

        // Listar directorios y archivos
        System.out.println("\nListado del directorio principal:");
        System.out.println(principal.toString());

        System.out.println("\nListado del archivo comprimido:");
        System.out.println(zip.toString());
    }
}
