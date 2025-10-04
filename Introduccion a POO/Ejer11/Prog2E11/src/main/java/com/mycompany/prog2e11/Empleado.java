package com.mycompany.prog2e11;
public class Empleado {
    private String nombre;
    private String rol;

    public Empleado(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    void mostrar(){
        System.out.println("El empleado "+nombre+"de rol"+rol);
    }
}
