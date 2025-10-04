package com.mycompany.prog2e7;
public class Prog2E7 {
    public static void main(String[] args) {
        Mascota m1=new Mascota("Murcy","Gato",50);
        Mascota m2=new Mascota("Mila","Perro",80);
        m1.alimentar();
        m2.alimentar();
        m2.alimentar();
        m2.jugar();
        m1.alimentar();
        m2.jugar();
        m1.jugar();
        m1.jugar();
    }
}
