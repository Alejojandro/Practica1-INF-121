package com.mycompany.p3e3;
public class P3E3 {

    public static void main(String[] args) {
        Animal[] animales = new Animal[5];
        animales[0] = new Leon("Simba", 5);
        animales[1] = new Pinguino("Pingu", 3);
        animales[2] = new Canguro("Kangy", 4);
        animales[3] = new Leon("Nala", 6);
        animales[4] = new Pinguino("Glacier", 2);

        System.out.println("Desplazamientos:");
        for (Animal a : animales) {
            a.desplazarse();
        }
    }
}
