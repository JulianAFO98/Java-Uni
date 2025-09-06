package Ej5;

public class Prueba {

	 public static void main(String[] args) {
	        // Crear un auto automático
	        AutomovilAutomatico autoAuto = new AutomovilAutomatico("ABC123");
	        System.out.println(autoAuto);
	        
	        // Acelerar y mostrar marcha
	        autoAuto.acelerar(60);
	        System.out.println("Velocidad automática: " + autoAuto.getVelocidad() + " km/h");
	        System.out.println("Marcha automática: " + autoAuto.getMarcha());
	        
	        // Frenar y mostrar marcha
	        autoAuto.frenar(20);
	        System.out.println("Velocidad automática después de frenar: " + autoAuto.getVelocidad() + " km/h");
	        System.out.println("Marcha automática después de frenar: " + autoAuto.getMarcha());
	        
	        System.out.println("------------------------");
	        
	        // Crear un auto manual
	        AutomovilManual autoManual = new AutomovilManual("XYZ789", 180);
	        System.out.println(autoManual);
	        
	        // Acelerar y mostrar velocidad
	        autoManual.acelerar(50);
	        System.out.println("Velocidad manual: " + autoManual.getVelocidad() + " km/h");
	        
	        // Acelerar más allá de la velocidad máxima
	        autoManual.acelerar(200);
	        System.out.println("Velocidad manual tras intentar acelerar demasiado: " + autoManual.getVelocidad() + " km/h");
	        
	        // Frenar y mostrar velocidad
	        autoManual.frenar(30);
	        System.out.println("Velocidad manual después de frenar: " + autoManual.getVelocidad() + " km/h");
	    }

}
