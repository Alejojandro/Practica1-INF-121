package com.mycompany.p3e1;
public class Persona {
    private String nombre;
    private String apellido;
    private String ci;

    public Persona() {
        this.nombre="Ale";
        this.apellido="Cory";
        this.ci="8480654";
    }
    
    
    public String getNombre(){
    return nombre;
    }
    void mostrar(){
        System.out.println("El usuario "+" "+nombre +" "+ apellido+" tienen un ci de "+ci);
    }
}
