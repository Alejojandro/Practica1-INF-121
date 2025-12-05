package com.mycompany.p3e4;
import java.util.*;
public class P3E4 {

    public static void main(String[] args) {
        ArchiNota archivo = new ArchiNota("Notas2025");
        Estudiante e1 = new Estudiante(101, "Ana", "Perez", "Lopez", 20);
        Estudiante e2 = new Estudiante(102, "Luis", "Gomez", "Diaz", 22);
        Estudiante e3 = new Estudiante(103, "Maria", "Suarez", "Torrez", 21);
        Nota n1 = new Nota("Matemáticas", 85, e1);
        Nota n2 = new Nota("Matemáticas", 90, e2);
        Nota n3 = new Nota("Historia", 90, e3);
        archivo.agregarNot(Arrays.asList(n1, n2, n3));
        System.out.println("=== Todas las notas ===");
        archivo.mostrarTod();
        System.out.println("\n=== Promedio de notas ===");
        System.out.println("Promedio: " + archivo.promedioN());
        System.out.println("\n=== Estudiantes con la mejor nota ===");
        for (Nota n : archivo.mejN()) {
            n.mostrarInf();
        }
        System.out.println("\n=== Eliminando notas de Matemáticas ===");
        archivo.eliminarxMat("Matemáticas");
        archivo.mostrarTod();
    
    }
}
