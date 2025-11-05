package ej2.modelo.Persistencia;

import java.util.ArrayList;
import java.util.List;

import ej2.modelo.Producto;

public class PersistenciaProducto implements DaoGenerico<Producto>{

   private List<Producto> productos = new ArrayList<>();

    @Override
    public Producto guardarElemento(Producto elem) {
        productos.add(elem);
        return elem;
    }

    @Override
    public void eliminarElemento(Producto elem) {
        productos.remove(elem);
    }

    @Override
    public List<Producto> listarElementos() {
        return new ArrayList<>(productos);

    }

}
