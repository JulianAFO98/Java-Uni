package Ej6;

public class Prueba {
    public static void main(String[] args) {
        Estacion estacion = new Estacion("YPF");
        
        // Agregar surtidores
        Surtidor s1 = new Surtidor(20000);
        Surtidor s2 = new Surtidor(20000);
        estacion.agregarSurtidor(s1);
        estacion.agregarSurtidor(s2);
        
        // Simulaciones
        s1.extraerGasoil(500);
        s1.extraerPremium(800);
        s2.extraerSuper(1000);
        s2.extraerSuper(500);
        
        // Probar funcionalidades
        System.out.println("Cantidad de surtidores: " + estacion.getCantSurtidores());
        System.out.println("Litros disponibles de Gasoil: " + estacion.cantLitrosCombustible(1));
        System.out.println("Surtidor con más ventas de Super: " + estacion.surtidorConMasVentasDeUnTipo(3));
        System.out.println("Histórico Premium de toda la estación: " + estacion.getHistoricoCombustible(2));
        System.out.println("Histórico surtidor 1: " + estacion.getHistoricoSurtidores(s1.getId()));
        System.out.println("Histórico estación: " + estacion.getHistoricoEstacion());
    }
}
