package ej4.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Surtidor implements IDespachador {
    ArrayList<RegistroCombustible> registros = new ArrayList<>();

    @Override
    public void llenarCombustible(Combustible c) throws NoExisteCombustibleException{
        RegistroCombustible r = buscarRegistro(c);
        if(!registros.contains(r))
            throw new NoExisteCombustibleException("No existe el combustible solicitado en este surtidor",c.getNombre());
        r.llenarCombustible(c);
    }

    @Override
    public void extraerCombustible(Combustible c,double cantidad) throws FaltaCombustibleException,NoExisteCombustibleException {
        RegistroCombustible r = buscarRegistro(c);
        if(!registros.contains(r))
            throw new NoExisteCombustibleException("No existe el combustible solicitado en este surtidor",c.getNombre());
        
        r.extraerCombustible(c,cantidad);

    }

    private RegistroCombustible buscarRegistro(Combustible c){
        Iterator<RegistroCombustible> r = registros.iterator();
        RegistroCombustible reg=null;
        boolean encontrado = false;
        while(r.hasNext() && !encontrado){
            reg = r.next();
            encontrado = c.getNombre().equalsIgnoreCase(reg.getCombustible().getNombre());
        }
        return reg;
    }

    @Override
    public String toString() {
        return "Surtidor registros:" + registros ;
    }

    @Override
    public void agregarCombustible(Combustible c,double cantidad) {
        this.registros.add(new RegistroCombustible(c, cantidad));
    }

    
    
}
