package com.mycompany.p3e3;
public class Leon extends Animal{
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " camina con fuerza por africa.");
    }
}
