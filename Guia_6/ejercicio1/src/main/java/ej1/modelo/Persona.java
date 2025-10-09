package ej1.modelo;

public class Persona implements Comparable{
    private String nombre;
    private String dni;
    private int edad;
    private String apellido;
    public Persona(String nombre,String apellido, String dni, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        return true;
    }




    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }



   


    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", apellido=" + apellido + "]";
    }






    @Override
    public int compareTo(Object otro) {
        Persona p = (Persona) otro;
        int compare = this.nombre.compareTo(p.nombre);
        if(compare == 0){
            compare = this.apellido.compareTo(p.apellido);
        }
        return compare;
    }
    
    
    
}
