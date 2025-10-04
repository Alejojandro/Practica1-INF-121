package com.mycompany.part2e15;
public class Part2E15 {

    public static void main(String[] args) {
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 5);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 5);

        Ordenador o1 = new Ordenador("A001", 1, 4, "Intel i3", "activo");
        Ordenador o2 = new Ordenador("A002", 2, 8, "Intel i5", "inactivo");
        Ordenador o3 = new Ordenador("A003", 3, 16, "Intel i7", "activo");
        Ordenador o4 = new Ordenador("A004", 4, 12, "Ryzen 5", "activo");
        Ordenador o5 = new Ordenador("A005", 5, 6, "Intel i5", "inactivo");
        Ordenador o6 = new Ordenador("A006", 6, 32, "Ryzen 7", "activo");

        lasin1.agregarOrdenador(o1);
        lasin1.agregarOrdenador(o2);
        lasin1.agregarOrdenador(o3);
        lasin2.agregarOrdenador(o4);
        lasin2.agregarOrdenador(o5);
        lasin2.agregarOrdenador(o6);

        lasin1.informacion("activo");
        lasin2.informacion(8);
        lasin2.informacion();

        GestorLaboratorios.trasladar(lasin1, lasin2, new String[]{"A001", "A003"});
    }
}
