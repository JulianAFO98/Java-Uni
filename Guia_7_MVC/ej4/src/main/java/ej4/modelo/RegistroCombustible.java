package ej4.modelo;

public class RegistroCombustible implements IDespachador{
    private Combustible combustible;
    private String ultimoCombustible;
    private double ultimoMonto;
    private double cantCombustible;
    private double montoHistorico;
    private double cantMaximaCombustible;

    
    public RegistroCombustible(Combustible combustible, double cantCombustible) {
        this.combustible = combustible;
        this.ultimoCombustible = null;
        this.ultimoMonto = 0;
        this.cantMaximaCombustible = cantCombustible;
        this.cantCombustible = cantCombustible;
        this.montoHistorico=0;
    }



    @Override
    public void llenarCombustible(Combustible c) {
        this.cantCombustible=cantMaximaCombustible;
    }
    
    @Override
    public void extraerCombustible(Combustible c,double cantidad) throws FaltaCombustibleException {
        if(this.cantCombustible<cantidad)
            throw new FaltaCombustibleException("No se pudo extraer el total de la cantidad solicitada",new DatoCargaInvalida(c.getNombre(), cantidad));
    
        this.cantCombustible-=cantidad;
    }



    public String getUltimoCombustible() {
        return ultimoCombustible;
    }



    public void setUltimoCombustible(String ultimoCombustible) {
        this.ultimoCombustible = ultimoCombustible;
    }



    public double getUltimoMonto() {
        return ultimoMonto;
    }



    public void setUltimoMonto(double ultimoMonto) {
        this.ultimoMonto = ultimoMonto;
    }



    public double getCantCombustible() {
        return cantCombustible;
    }



    public void setCantCombustible(double cantCombustible) {
        this.cantCombustible = cantCombustible;
    }



    public double getMontoHistorico() {
        return montoHistorico;
    }



    public void setMontoHistorico(double montoHistorico) {
        this.montoHistorico = montoHistorico;
    }



    public Combustible getCombustible() {
        return combustible;
    }



    @Override
    public String toString() {
         return "RegistroCombustible {\n" +
           "  Combustible: " + combustible + "\n" +
           "  Último Combustible: " + ultimoCombustible + "\n" +
           "  Último Monto: " + ultimoMonto + "\n" +
           "  Cantidad de Combustible: " + cantCombustible + "\n" +
           "  Monto Histórico: " + montoHistorico + "\n" +
           "  Capacidad Máxima: " + cantMaximaCombustible + "\n" +
           "}";
}



    @Override
    public void agregarCombustible(Combustible c, double cantidad) {
        
    }


    
    

}
