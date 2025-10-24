package ej1.modelo;

public enum EstadoTamagochi {
    HAMBRE("Tiene hambre"),
    SUENIO("Tiene suenio"),
    JUGAR("Quiere jugar"),
    ENOJADO("Esta enojado!"),
    ABURRIDO("Esta aburrido!");
    private final String mensaje;

    EstadoTamagochi(String msg){
        this.mensaje=msg;
    }
     public String getMensaje() {
        return mensaje;
    }

}
