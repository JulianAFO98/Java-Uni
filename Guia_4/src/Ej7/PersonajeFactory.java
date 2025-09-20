package Ej7;

public class PersonajeFactory {

	public static IPersonaje crearPersonaje(String tipo,String elemento) {
        IPersonaje p = null;
        
        if(tipo.equalsIgnoreCase("guerrero")) {
            p = new Guerrero(100,100,1500);
        }else if(tipo.equalsIgnoreCase("elfo")) {
            p = new Elfo(20,100,1000);
        }else if(tipo.equalsIgnoreCase("hechicera")) {
            p = new Hechicera(70,50,1000);
        }else if(tipo.equalsIgnoreCase("dragon")) {
            p = new Dragon(500,200,10000);
        }else if(tipo.equalsIgnoreCase("mago")) {
            p = new Mago(50,70,500);
        }

        
        if(p != null) {
            switch(elemento.toLowerCase()) {
                case "agua": p = new DecoratorElementoAgua(p); break;
                case "fuego": p = new DecoratorElementoFuego(p); break;
                case "tierra": p = new DecoratorElementoTierra(p); break;
                case "aire": p = new DecoratorElementoAire(p); break;
                default: break;
            }
        }
        
        
        
        return p;
        
    }
}
