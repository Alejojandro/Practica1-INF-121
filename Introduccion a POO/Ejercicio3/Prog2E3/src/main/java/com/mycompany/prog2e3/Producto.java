package com.mycompany.prog2e3;
public class Producto {
    private String nombre;
    private int precio;
    private int stock;

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public int vender(){
        return stock=stock-1;
    }
    public int reabastecer(){
        return stock=stock+1;
    }
    void mostrar(){
        System.out.println("La cantidad de "+nombre+" es "+stock);
    }
}
