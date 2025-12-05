package com.mycompany.p3e1;
import java.io.Serializable;
public class Charango implements Serializable{
    private String material;
    private int NroCuerdas;
    private boolean[] cuerdas;

    public Charango(String material, int NroCuerdas, boolean[] cuerdas) {
        this.material = material;
        this.NroCuerdas = NroCuerdas;
        this.cuerdas = cuerdas;
    }

    public String getMaterial() {
        return material;
    }

    public int getNroCuerdas() {
        return NroCuerdas;
    }

    public boolean[] getCuerdas() {
        return cuerdas;
    }
    public int contadorCuerdas(){
        int contador=0;
        for (boolean c: cuerdas){
            if(!c) contador++;
        }
        return contador;
    }
    public void mostrarInfo(){
        System.out.println("El charango de material: "+material+" Con "+NroCuerdas+" cuerdas.");
    }
    
}
