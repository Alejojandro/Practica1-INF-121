package com.mycompany.p3e2;
public class Trabajador {
    private String nombre;
    private int carnet;
    private double salario;

    public Trabajador(String nombre, int carnet, double salario) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCarnet() {
        return carnet;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void mostrarInf(){
        System.out.println("El tabajador: "+nombre+" de carnet "+carnet+" y percibe un salario: "+salario);
    }
}
