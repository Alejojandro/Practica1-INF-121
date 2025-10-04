package com.mycompany.part2e15;
public class Ordenador {
    private String serial;
    private int numero;
    private int ram;
    private String procesador;
    private String estado; // "activo" o "inactivo"

    public Ordenador(String serial, int numero, int ram, String procesador, String estado) {
        this.serial = serial;
        this.numero = numero;
        this.ram = ram;
        this.procesador = procesador;
        this.estado = estado;
    }

    public String getSerial() { return serial; }
    public int getRam() { return ram; }
    public String getEstado() { return estado; }

    public void mostrar() {
        System.out.println("Serial: " + serial + ", Número: " + numero +
            ", RAM: " + ram + " GB, Procesador: " + procesador + ", Estado: " + estado);
    }
}

