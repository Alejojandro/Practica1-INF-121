package com.mycompany.p3e3;

public class P3E3 {

    public static void main(String[] args) {
        ArchivoProducto archivo = new ArchivoProducto();
        Producto p1 = new Producto(101, "Laptop", 3500.50f);
        Producto p2 = new Producto(102, "Mouse", 150.75f);
        Producto p3 = new Producto(103, "Monitor", 1200.00f);
        archivo.agregarProd(p1);
        archivo.agregarProd(p2);
        archivo.agregarProd(p3);
        System.out.println("Todos los productos");
        archivo.mostrarTod();
        System.out.println("Buscar productocon codigo");
        Producto buscado = archivo.buscarProd(102);
        if (buscado != null) buscado.mostrarInf();
        System.out.println("Promedio de precios");
        System.out.println("Promedio: " + archivo.calcuPromPrec());
        System.out.println("Producto más caro");
        Producto caro = archivo.mostrarProdCaro();
        if (caro != null) caro.mostrarInf();
    }
}
