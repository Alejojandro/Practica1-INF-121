package com.mycompany.part2e7;
public class Parada {
    private String nombreP;
    private String[] admins;
    private String[][] autos;

    // Constructor por defecto
    public Parada() {
        nombreP = "";
        admins = new String[10];
        autos = new String[10][3]; // modelo, conductor, placa
    }

    // Constructor con datos
    public Parada(String nombreP, String[] adminsIniciales, String[][] autosIniciales) {
        this.nombreP = nombreP;
        this.admins = new String[10];
        this.autos = new String[10][3];

        for (int i = 0; i < adminsIniciales.length && i < 10; i++) {
            this.admins[i] = adminsIniciales[i];
        }

        for (int i = 0; i < autosIniciales.length && i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                this.autos[i][j] = autosIniciales[i][j];
            }
        }
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("Nombre de la parada: " + nombreP);
        System.out.println("Administradores:");
        for (String admin : admins) {
            if (admin != null) System.out.println(" - " + admin);
        }

        System.out.println("Autos:");
        for (String[] auto : autos) {
            if (auto[0] != null) {
                System.out.println("Modelo: " + auto[0] + ", Conductor: " + auto[1] + ", Placa: " + auto[2]);
            }
        }
    }

    // Método adicionar(x): añadir un admin
    public void adicionar(String nuevoAdmin) {
        for (int i = 0; i < admins.length; i++) {
            if (admins[i] == null) {
                admins[i] = nuevoAdmin;
                return;
            }
        }
        System.out.println("No se puede añadir más administradores.");
    }

    // Método adicionar(x, y, z): añadir un auto
    public void adicionar(String modelo, String conductor, String placa) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i][0] == null) {
                autos[i][0] = modelo;
                autos[i][1] = conductor;
                autos[i][2] = placa;
                return;
            }
        }
        System.out.println("No se puede añadir más autos.");
    }
}
