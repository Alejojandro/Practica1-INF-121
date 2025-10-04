package com.mycompany.prog2e7;
public class Mascota {
    private String nombre;
    private String tipo;
    private int energia;
    public Mascota(String nombre, String tipo, int energia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;
    }
    public void alimentar(){
        if(energia>=100){
            System.out.println(nombre+" ya comio demasioado");
        }else{
            energia=energia+20;
            System.out.println(nombre+" comio y esta feliz se sienete con una energia de: "+energia);
        }
    }
    public void jugar(){
        if(energia<=1){
            System.out.println(nombre+" esta muy cansada por hoy");
        }else{
            energia=energia-15;
            System.out.println(nombre+" esta feliz, jugo y se canso, su energia es: "+energia);
        }
    }
}
