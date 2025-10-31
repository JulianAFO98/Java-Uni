package ej1.modelo;


public class Motor {
    private String n_Serie;
    private String tipoCombustible;

    
    public Motor(String n_Serie, String tipoCombustible) {
        this.n_Serie = n_Serie;
        this.tipoCombustible = tipoCombustible;
    }

    
    public Motor() {
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


    @Override
    public String toString() {
        return "Motor [n_Serie=" + n_Serie + ", tipoCombustible=" + tipoCombustible + "]";
    }

    
}
