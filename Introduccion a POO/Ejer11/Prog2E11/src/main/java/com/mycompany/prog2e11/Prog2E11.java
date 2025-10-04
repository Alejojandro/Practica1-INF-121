package com.mycompany.prog2e11;
public class Prog2E11 {
    public static void main(String[] args) {
        Empleado e1=new Empleado("Juan","Varista");
        Pedido p1=new Pedido("Cafe","En proceso");
        p1.mostrar();
        e1.mostrar();
    }
}
