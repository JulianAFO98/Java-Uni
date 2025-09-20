package Ej7;

public class Prueba {
	public static void main(String[] args) {
		Mazo m = Mazo.getInstance();
		IPersonaje guerreroFuego = PersonajeFactory.crearPersonaje("guerrero", "fuego");
        IPersonaje elfoAgua = PersonajeFactory.crearPersonaje("elfo", "agua");
        IPersonaje hechiceraAire = PersonajeFactory.crearPersonaje("hechicera", "aire");
        IPersonaje dragonTierra = PersonajeFactory.crearPersonaje("dragon", "tierra");
        IPersonaje magoFuego = PersonajeFactory.crearPersonaje("mago", "fuego");

        
        m.agregarPersonaje(guerreroFuego);
        m.agregarPersonaje(elfoAgua);
        m.agregarPersonaje(hechiceraAire);
        m.agregarPersonaje(dragonTierra);
        m.agregarPersonaje(magoFuego);
        m.mostrarPersonajes();
        
        
        IPersonaje adversario = m.eligeAdversario();
        
        
     
        
       
	}
}
