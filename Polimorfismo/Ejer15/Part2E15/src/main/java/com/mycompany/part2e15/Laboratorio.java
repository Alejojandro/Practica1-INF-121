package com.mycompany.part2e15;
import java.util.ArrayList;

public class Laboratorio {
    private String nombre;
    private int capacidad;
    private ArrayList<Ordenador> ordenadores;

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ordenadores = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public ArrayList<Ordenador> getOrdenadores() { return ordenadores; }

    public void agregarOrdenador(Ordenador o) {
        if (ordenadores.size() < capacidad) {
            ordenadores.add(o);
        } else {
            System.out.println("Capacidad máxima alcanzada en " + nombre);
        }
    }

    // Sobrecarga del método informacion
    public void informacion() {
        System.out.println("\nTodos los ordenadores en " + nombre + ":");
        for (Ordenador o : ordenadores) o.mostrar();
    }

    public void informacion(String estado) {
        System.out.println("\nOrdenadores en estado '" + estado + "' en " + nombre + ":");
        for (Ordenador o : ordenadores) {
            if (o.getEstado().equalsIgnoreCase(estado)) o.mostrar();
        }
    }

    public void informacion(int ramMinima) {
        System.out.println("\nOrdenadores con más de " + ramMinima + " GB de RAM en " + nombre + ":");
        for (Ordenador o : ordenadores) {
            if (o.getRam() > ramMinima) o.mostrar();
        }
    }

    public void mostrarSeriales() {
        System.out.print(nombre + " → Seriales: ");
        for (Ordenador o : ordenadores) {
            System.out.print(o.getSerial() + " ");
        }
        System.out.println();
    }

    public void eliminarPorSerial(String serial) {
        ordenadores.removeIf(o -> o.getSerial().equals(serial));
    }
}

