package com.mycompany.prog2e3;
public class Prog2E3 {
    public static void main(String[] args) {
        Producto p1=new Producto("Papas",7,10);
        Producto p2=new Producto("Pilfruts",2,8);
        p1.mostrar();
        p2.mostrar();
        p1.vender();
        p1.vender();
        p1.reabastecer();
        p2.vender();
        p2.vender();
        p2.vender();
        p2.vender();
        p2.vender();
        p2.vender();
        p2.vender();
        p2.vender();
        p2.reabastecer();
        p1.mostrar();
        p2.mostrar();
    }
}
