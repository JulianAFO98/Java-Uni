package ej4.modelo;

public abstract  class Combustible {
    private double precio;
    private String nombre;
    public Combustible(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Combustible nombre" + nombre + " ,precio: "+precio;
    }

    
}
