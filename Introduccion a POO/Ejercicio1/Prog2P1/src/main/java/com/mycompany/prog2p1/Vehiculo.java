package com.mycompany.prog2p1;
public class Vehiculo {
    private String marca;
    private int modelo;
    private int velocidadAct;

    public Vehiculo(String marca, int modelo, int velocidadAct) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadAct = velocidadAct;
    }
    public void acelerar(){
        velocidadAct=velocidadAct+10;
        System.out.println("La velocidad actual es: "+velocidadAct);
        
    }
    public void frenar(){
        if(velocidadAct<=0){
            System.out.println("El vehiculo se ah detenido");
        }else{
            velocidadAct= velocidadAct-10;
            System.out.println("La velocidad reduce a: "+velocidadAct);
        }
    }
    void mostrar(){
        System.out.println("El "+marca+" tiene una velocidad de: "+velocidadAct);
    }
}
