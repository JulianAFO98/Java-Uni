package ej2.modelo.Persistencia;

import java.util.ArrayList;
import java.util.List;

import ej2.modelo.Pedido;

public class PersistenciaPedido implements DaoGenerico<Pedido> {

    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public Pedido guardarElemento(Pedido elem) {
        pedidos.add(elem);
        return elem;
    }

    @Override
    public void eliminarElemento(Pedido elem) {
        pedidos.remove(elem);
    }

    @Override
    public List<Pedido> listarElementos() {
        return new ArrayList<>(pedidos);

    }
}