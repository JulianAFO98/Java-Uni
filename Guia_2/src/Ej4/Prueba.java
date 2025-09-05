package Ej4;

public class Prueba {

	public static void main(String[] args) {
		Domicilio d1 = new Domicilio("Matheu",2323);
		Empleado e1 = new Intermedio("Juan Perez",1234,d1,7,12000);
		Domicilio d2 = new Domicilio("Colon",5561);
		Empleado e2 = new Temporario("Julio Garcia",3209,d2,80,160);
		Domicilio d3 = new Domicilio("Mitre",3451);
		Empleado e3 = new Temporario("Martin Rodriguez",3210,d3,70,100);
		

		Departamento m = new Departamento("Mantenimiento");

		m.agregarEmpleado(e1);
		m.agregarEmpleado(e2);
		m.agregarEmpleado(e3);
		m.generarListaInformativa();
		
		
		Domicilio d4 = new Domicilio("Luro",3489);
		Empleado e4 = new Intermedio("Mara Anchorena",9876,d4,18,13000);
		Domicilio d5 = new Domicilio("Cordoba",3843);
		Empleado e5 = new Temporario("Sandra Fernandez",1276,d5,6,11500);
		Domicilio d6 = new Domicilio("Formosa",2354);
		Empleado e6 = new Temporario("Luis Gomez",1544,d6,2,10500);
		

		Departamento c = new Departamento("Contabilidad");

		c.agregarEmpleado(e4);
		c.agregarEmpleado(e5);
		c.agregarEmpleado(e6);
		c.generarListaInformativa();
		
		

	}

}
