package com.mycompany.prog2e13;

import java.util.Arrays;

public class Fruta {
    private String nombre;
    private String tipo;
    private int nroVit;
    private String v[];

    public Fruta(String nombre, String tipo, int nroVit, String[] v) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVit = nroVit;
        this.v = v;
    }
    public Fruta(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVit = 2;
        this.v = new String[0];
    }
    public Fruta(String nombre, String[]v){
        this.nombre=nombre;
        this.tipo = "citrico";
        this.nroVit=2;
        this.v=v;
    }
    public void mostrarP(){
        System.out.println("La fruta"+nombre+" es "+tipo+" tiene "+nroVit+" vitaminas");
        for(String vitaminas :v){
            System.out.print(vitaminas+",");
        }
    }
    public String getNombre(){
        return nombre;
    }
    public int getnroVit(){
        return nroVit;
    }
    public void mostrarVitaminas(){
        for(String vitaminas:v){
            System.out.println("Posee las vitaminas:");
            System.out.print(vitaminas);
        }
    }
    public int sonCit(){
        String[] citricas ={"C"};
        int contador=0;
        for(String vitaminas : v){
                for(String c: citricas){
                    if(vitaminas.equalsIgnoreCase(c)){
                        contador++;
                    }
                }
            }
        return contador;
    }
    public void mostrarOrdenadas() {
        String[] ordenadas = v.clone();
        Arrays.sort(ordenadas);
        System.out.println("Vitaminas ordenadas de " + nombre + ": " + Arrays.toString(ordenadas));
    }
    
}
