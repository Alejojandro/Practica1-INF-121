package com.mycompany.p3e3;
import java.util.*;
public class ArchivoProducto {
    private List<Producto> listaProd;

    public ArchivoProducto() {
        listaProd = new ArrayList<>();
    }
    public void agregarProd(Producto p){
        listaProd.add(p);
    }
    public Producto buscarProd(int codigo){
        for(Producto p: listaProd){
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    public float calcuPromPrec(){
        if(listaProd.isEmpty()) return 0;
        float suma=0;
        for(Producto p: listaProd){
            suma+=p.getPrecio();
        }
        return suma / listaProd.size();
    }
    public Producto mostrarProdCaro(){
        if(listaProd.isEmpty()) return null;
        Producto Caro = listaProd.get(0);
        for(Producto p: listaProd){
            if(p.getPrecio()> Caro.getPrecio()){
                Caro=p;
            }
        }
        return Caro;
    }
    public void mostrarTod(){
        for(Producto p: listaProd){
            p.mostrarInf();
        }
    }
}
