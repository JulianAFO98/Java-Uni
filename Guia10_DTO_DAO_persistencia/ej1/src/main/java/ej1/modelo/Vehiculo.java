package ej1.modelo;



public class Vehiculo {
    private String n_Chasis;
    private int anio_fabricacion;

    
    public Vehiculo() {
    }

    
    public Vehiculo(String n_Chasis, int anio_fabricacion) {
        this.n_Chasis = n_Chasis;
        this.anio_fabricacion = anio_fabricacion;
    }
    public String getN_Chasis() {
        return n_Chasis;
    }
    public void setN_Chasis(String n_Chasis) {
        this.n_Chasis = n_Chasis;
    }
    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }
    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }


    
    
    
    
    

}
