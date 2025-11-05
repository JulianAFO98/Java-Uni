package ej2.modelo.Persistencia;

import java.util.List;

public interface DaoGenerico<E> {
    E guardarElemento(E elem);
    void eliminarElemento(E elem);
    List<E> listarElementos();

}
