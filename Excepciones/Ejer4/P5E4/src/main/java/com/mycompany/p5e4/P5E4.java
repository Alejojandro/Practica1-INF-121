package com.mycompany.p5e4;
public class P5E4 {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        try {
            // Agregar productos válidos
            inventario.agregarProducto(new Producto("P001", "Laptop", 5000, 10));
            inventario.agregarProducto(new Producto("P002", "Mouse", 50, 100));
            inventario.agregarProducto(new Producto("P003", "Teclado", 100, 50));

            // Caso de error: código repetido
            inventario.agregarProducto(new Producto("P001", "Tablet", 2000, 5));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        inventario.mostrarInventario();

        try {
            // Buscar producto existente
            Producto p = inventario.buscarProducto("P002");
            System.out.println("Encontrado: " + p);

            // Caso de error: producto no encontrado
            inventario.buscarProducto("P999");

        } catch (Inventario.ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Venta correcta
            inventario.venderProducto("P001", 2);

            // Caso de error: stock insuficiente
            inventario.venderProducto("P001", 50);

        } catch (Inventario.ProductoNoEncontradoException | Inventario.StockInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        inventario.mostrarInventario();
    }
}
