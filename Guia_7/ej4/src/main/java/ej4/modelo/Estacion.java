package ej4.modelo;

import java.util.ArrayList;

public class Estacion {
    private ArrayList<IDespachador> surtidores = new ArrayList<>();
    private String nombre;
    private int cantSurtidores;


    public Estacion(String nombre) {
        this.nombre = nombre;
        this.cantSurtidores = 0;
    }

    public void agregarSurtidor(IDespachador desp){
        surtidores.add(desp);
    }

    public void removerSurtidor(IDespachador desp) throws SurtidorInexistenteException{
        if(!surtidores.contains(desp))
            throw new SurtidorInexistenteException("No existe tal surtidor");
        surtidores.remove(desp);
        cantSurtidores--;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantSurtidores() {
        return cantSurtidores;
    }

    public void setCantSurtidores(int cantSurtidores) {
        this.cantSurtidores = cantSurtidores;
    }

    public ArrayList<IDespachador> getSurtidores() {
        return surtidores;
    }


    
}
