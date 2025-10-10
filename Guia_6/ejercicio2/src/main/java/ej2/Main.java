package ej2;

import ej2.modelo.ListaConPrioridades;
import ej2.modelo.Llamado;
import ej2.modelo.OperadoraEmergencias;
import ej2.modelo.Socio;

public class Main {
    public static void main(String[] args) {
        ListaConPrioridades<Llamado> llamados = new ListaConPrioridades<Llamado>();
        Socio s1 = new Socio(41431184, "Colon 2332", "Julian");
        Socio s2 = new Socio(42431284, "Independencia 2332", "Agustin");
        Socio s3 = new Socio(44435288, "Guemes 2332", "Laura");

        Llamado l1 = new Llamado(5, s1);
        Llamado l2 = new Llamado(2, s2);
        Llamado l3 = new Llamado(15, s3);

        llamados.agrega(l1);
        llamados.agrega(l2);
        llamados.agrega(l3);

        System.out.println(llamados.getElemento()); 
        OperadoraEmergencias op = new OperadoraEmergencias();
        op.agrega(l1);
        op.agrega(l2);
        op.agrega(l3);
        System.out.println(op.getElemento());
        System.out.println(op.cantidadLlamados(s1));
        System.out.println(op.getSocioMasEmergencias());
    }
}