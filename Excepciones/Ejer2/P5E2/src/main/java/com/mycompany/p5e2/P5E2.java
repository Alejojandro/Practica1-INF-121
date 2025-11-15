package com.mycompany.p5e2;
public class P5E2 {

    public static void main(String[] args) {
        try {
            System.out.println("Suma: " + Calculadora.sumar(10, 5));
            System.out.println("Resta: " + Calculadora.restar(10, 5));
            System.out.println("Multiplicación: " + Calculadora.multiplicar(10, 5));
            System.out.println("División: " + Calculadora.dividir(10, 5));
            System.out.println("División con cero: " + Calculadora.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Conversión a entero: " + Calculadora.convertirAEntero("123"));
            System.out.println("Conversión inválida: " + Calculadora.convertirAEntero("abc"));
        } catch (Calculadora.NumeroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
