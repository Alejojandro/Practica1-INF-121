package com.mycompany.p3e2;
public class P3E2 {

    public static void main(String[] args) {
        ArchivoTrabajador archivo = new ArchivoTrabajador();
        Trabajador t1 = new Trabajador("Ana", 123, 2500);
        Trabajador t2 = new Trabajador("Luis", 456, 3000);
        Trabajador t3 = new Trabajador("Maria", 789, 2800);
        archivo.agregarT(t1);
        archivo.agregarT(t2);
        archivo.agregarT(t3);
        System.out.println(" Todos los trabajadores");
        archivo.mostrarTod();
        System.out.println("Aumentando salario de Ana");
        archivo.aumentarSal(500, t1);
        archivo.mostrarTod();
        System.out.println("Trabajador con mayor salario");
        Trabajador mayor = archivo.buscarMayorSal();
        if (mayor != null) mayor.mostrarInf();
        System.out.println("Ordenados por salario");
        archivo.ordSalario();
        archivo.mostrarTod();
    }
}
