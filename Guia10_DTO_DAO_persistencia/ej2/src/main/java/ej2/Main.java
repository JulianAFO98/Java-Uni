package ej2;

import ej2.modelo.Empleado;
import ej2.modelo.LineaDePedido;
import ej2.modelo.Pedido;
import ej2.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        // Prueba de las clases del modelo
        Producto prod1 = new Producto("Laptop", 1500.0);
        Producto prod2 = new Producto("Mouse", 25.0);

        Empleado emp = new Empleado("Ana", "123456789", "ana@email.com");

        LineaDePedido linea1 = new LineaDePedido();
        linea1.setP(prod1);
        linea1.setCantidadProductos(2);

        LineaDePedido linea2 = new LineaDePedido();
        linea2.setP(prod2);
        linea2.setCantidadProductos(5);

        Pedido pedido = new Pedido();
        pedido.setE(emp);
        pedido.setFecha(new java.util.Date());
        try {
            pedido.agrega(linea1);
            pedido.agrega(linea2);
        } catch (Exception e) {
            System.out.println("Error al agregar línea de pedido: " + e.getMessage());
        }

        System.out.println("Empleado: " + emp.getNombre());
        System.out.println("Pedido realizado el: " + pedido.getFecha());
        System.out.println("Detalle del pedido:");
        pedido.mostrarPedidos();
        System.out.println("Precio total del pedido: $" + pedido.obtenerPrecioTotalPedido());
    }
}