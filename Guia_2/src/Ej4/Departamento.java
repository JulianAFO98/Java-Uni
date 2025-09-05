package Ej4;

import java.util.ArrayList;

public class Departamento {
	
	private String nombreDepartamento;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	
	public Departamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	public void eliminarEmpleado(Empleado e) {
		empleados.remove(e);
	}
	
	public void generarListaInformativa() {
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
	}
	
	
	
}
