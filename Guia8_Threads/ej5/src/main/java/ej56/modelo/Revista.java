package ej56.modelo;

public class Revista {
    private int idRevista;
    private String titulo;
    
    public Revista(int idRevista, String titulo) {
        this.idRevista = idRevista;
        this.titulo = titulo;
    }

    public int getIdRevista() {
        return idRevista;
    }

    public void setIdRevista(int idRevista) {
        this.idRevista = idRevista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    
}
