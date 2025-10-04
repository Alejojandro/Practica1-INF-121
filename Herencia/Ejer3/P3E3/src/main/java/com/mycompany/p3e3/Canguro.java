package com.mycompany.p3e3;
public class Canguro extends Animal{
    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " salta velozmente por oceania.");
    }
}
