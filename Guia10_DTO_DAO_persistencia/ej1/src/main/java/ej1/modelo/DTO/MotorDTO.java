package ej1.modelo.DTO;

import java.io.Serializable;

public class MotorDTO implements Serializable{
    private String n_Serie;
    private String tipoCombustible;

    
    public MotorDTO(String n_Serie, String tipoCombustible) {
        this.n_Serie = n_Serie;
        this.tipoCombustible = tipoCombustible;
    }

    
    public MotorDTO() {
    }


    public String getN_Serie() {
        return n_Serie;
    }
    public void setN_Serie(String n_Serie) {
        this.n_Serie = n_Serie;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    
}
