package com.mycompany.p3e3;
public class Pinguino extends Animal{
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " nada ágilmente en el polo sur.");
    }
}
