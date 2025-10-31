package ej1.modelo.DTO;

import ej1.modelo.Motor;

public class AutomovilDTO extends VehiculoDTO{
    private String marca;
    private String modelo;
    private String patente;
    private MotorDTO motorDTO;

    
    public AutomovilDTO() {
    }
    
    public AutomovilDTO(String n_Chasis, int anio_fabricacion, String marca, String modelo, String patente, MotorDTO motor) {
        super(n_Chasis, anio_fabricacion);
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.motorDTO = motor;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public MotorDTO getMotorDTO() {
        return motorDTO;
    }

    public void setMotorDTO(MotorDTO motorDTO) {
        this.motorDTO = motorDTO;
    }
    

    
}
