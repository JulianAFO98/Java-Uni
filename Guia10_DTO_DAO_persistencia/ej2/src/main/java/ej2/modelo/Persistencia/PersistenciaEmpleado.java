package ej2.modelo.Persistencia;


import java.util.ArrayList;
import java.util.List;

import ej2.modelo.Empleado;

public class PersistenciaEmpleado implements DaoGenerico<Empleado>{

    //Esto no deberia estar asi pero bueno
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public Empleado guardarElemento(Empleado elem) {
        empleados.add(elem);
        return elem; // Devuelvo el empleado guardado
    }

    @Override
    public void eliminarElemento(Empleado elem) {
        empleados.remove(elem);
    }

    @Override
    public List<Empleado> listarElementos() {
        return new ArrayList<>(empleados);
    }
}

