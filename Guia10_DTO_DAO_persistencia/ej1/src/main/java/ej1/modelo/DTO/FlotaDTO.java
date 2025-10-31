package ej1.modelo.DTO;

import java.io.Serializable;
import java.util.ArrayList;

import ej1.modelo.Automovil;

public class FlotaDTO implements Serializable{

    private ArrayList<AutomovilDTO> autos = new ArrayList<>();
    private String nombre;

    public FlotaDTO(String nombre) {
        this.nombre = nombre;
    }
    public FlotaDTO() {
    }
    

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<AutomovilDTO> getAutos() {
        return autos;
    }
    public void setAutos(ArrayList<AutomovilDTO> autos) {
        this.autos = autos;
    }
   

}
