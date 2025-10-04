package com.mycompany.part2e7;
public class Part2E7 {

    public static void main(String[] args) {
        Parada p1 = new Parada();

        // Adicionar administradores
        p1.adicionar("Ana");
        p1.adicionar("Luis");

        // Adicionar autos
        p1.adicionar("Toyota Corolla", "Carlos", "123-ABC");
        p1.adicionar("Honda Civic", "María", "456-DEF");

        // Mostrar contenido
        System.out.println("=== Parada p1 ===");
        p1.mostrar();

        // Crear instancia con constructor parametrizado
        String[] adminsIniciales = {"Pedro", "Lucía"};
        String[][] autosIniciales = {
            {"Mazda 3", "Jorge", "789-GHI"},
            {"Chevrolet Spark", "Sofía", "321-JKL"}
        };

        Parada p2 = new Parada("Terminal Central", adminsIniciales, autosIniciales);

    }
}
