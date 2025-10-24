package ej2;

import ej2.modelo.Calculadora;
import ej2.modelo.CalculadoraEsperandoOP1State;

public class Main {
    public static void main(String[] args) {
        // Crear calculadora sin estado inicial y establecer el estado inicial después
        Calculadora calc = new Calculadora(null);
        calc.setEstado(new CalculadoraEsperandoOP1State(calc));

        System.out.println("--- Simulación Calculadora State ---");
        System.out.println("Estado inicial: " + calc.getEstado().toString());

        System.out.println("\n1) Usuario apreta operando (OP1)");
        calc.getEstado().apretaOperando();
        System.out.println("val1 = " + calc.getVal1());
        System.out.println("Estado ahora: " + calc.getEstado().toString());

        System.out.println("\n2) Usuario apreta operando (OP - avanzar a OP2)");
        calc.getEstado().apretaOperando();
        System.out.println("val1 = " + calc.getVal1());
        System.out.println("Estado ahora: " + calc.getEstado().toString());

        System.out.println("\n3) Usuario pide calcular (esto en EsperandoOP2 seteara val2 y pasará a Calculando)");
        calc.getEstado().calcular();
        System.out.println("val2 = " + calc.getVal2());
        System.out.println("Estado ahora: " + calc.getEstado().toString());

        System.out.println("\n4) Llamar calcular en el estado actual (Calculando) -> debe imprimir el resultado");
        calc.getEstado().calcular();

        System.out.println("\n5) Probar apretaCE para volver a estado EsperandoOP1");
        calc.getEstado().apretaCE();
        System.out.println("Estado final: " + calc.getEstado().toString());

        System.out.println("--- Fin simulación ---");
    }
}