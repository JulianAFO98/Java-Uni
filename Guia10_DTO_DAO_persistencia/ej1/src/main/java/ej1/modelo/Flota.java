package ej1.modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Flota implements Serializable{
    private ArrayList<Automovil> autos = new ArrayList<>();
    private String nombre;
    public Flota(String nombre) {
        this.nombre = nombre;
    }
    public Flota() {
    }
    public ArrayList<Automovil> getAutos() {
        return autos;
    }
    public void setAutos(ArrayList<Automovil> autos) {
        this.autos = autos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Flota [autos=" + autos + ", nombre=" + nombre + "]";
    }

    
}
