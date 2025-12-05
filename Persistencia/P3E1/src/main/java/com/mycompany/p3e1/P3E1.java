package com.mycompany.p3e1;
public class P3E1 {
    public static void main(String[] args) {
        Manager manager = new Manager();

        boolean[] cuerdas1 = {true,true,true,true,true,true,true,true,true,true};
        boolean[] cuerdas2 = {true,false,false,false,false,false,false,true,true,true};

        Charango ch1 = new Charango("Madera", 10, cuerdas1);
        Charango ch2 = new Charango("Metal", 10, cuerdas2);
        Charango ch3 = new Charango("Plástico", 8, cuerdas1);

        manager.agregarChar(ch1);
        manager.agregarChar(ch2);
        manager.agregarChar(ch3);

        System.out.println("=== Todos los Charangos ===");
        manager.mostrarTodos();

        System.out.println(" Eliminando defectuosos");
        manager.eliminarChar();
        manager.mostrarTodos();

        System.out.println("Charangos de material Madera");
        for (Charango c : manager.listaMat("Madera")) {
            c.mostrarInfo();
        }

        System.out.println("Charangos con 10 cuerdas");
        for (Charango c : manager.buscCuerdas()) {
            c.mostrarInfo();
        }

        System.out.println("Ordenados por material");
        manager.ordenAlfabetico();
        manager.mostrarTodos();
    }
}
