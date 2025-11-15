package com.mycompany.p5e4;
import java.util.ArrayList;
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public static class ProductoNoEncontradoException extends Exception {
        public ProductoNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    public static class StockInsuficienteException extends Exception {
        public StockInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }

    public void agregarProducto(Producto p) throws Exception {
        for (Producto prod : productos) {
            if (prod.getCodigo().equals(p.getCodigo())) {
                throw new Exception("Error: El código del producto ya existe.");
            }
        }
        if (p.getPrecio() < 0 || p.getStock() < 0) {
            throw new Exception("Error: Precio o stock no pueden ser negativos.");
        }
        productos.add(p);
    }

    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (Producto prod : productos) {
            if (prod.getCodigo().equals(codigo)) {
                return prod;
            }
        }
        throw new ProductoNoEncontradoException("Error: Producto con código " + codigo + " no encontrado.");
    }

    public void venderProducto(String codigo, int cantidad)
            throws ProductoNoEncontradoException, StockInsuficienteException {
        Producto prod = buscarProducto(codigo);
        if (prod.getStock() >= cantidad) {
            prod.setStock(prod.getStock() - cantidad);
            System.out.println("Venta realizada: " + cantidad + " unidades de " + prod.getNombre());
        } else {
            throw new StockInsuficienteException("Error: Stock insuficiente para el producto " + prod.getNombre());
        }
    }

    public void mostrarInventario() {
        for (Producto prod : productos) {
            System.out.println(prod);
        }
    }
}
