package com.mycompany.prog2e5;
public class Persona {
   private String nombre;
   private String apeP;
   private String apeM;
   private int edad;
   private int CI;

    public Persona(String nombre, String apeP, String apeM, int edad, int CI) {
        this.nombre = nombre;
        this.apeP = apeP;
        this.apeM = apeM;
        this.edad = edad;
        this.CI = CI;
    }
    public void mostrarDatos()  {
        System.out.println("La Persona de nombre:" + nombre + ", apellido Paterno: " + apeP + ", apellido Materno: " + apeM + ", edad: " + edad + " y CI: " + CI);
    }
    public void mayorEdad(){
        if(edad>=18){
            System.out.println(nombre+" Es mayor de edad");
        }else{
            System.out.println(nombre+"Es tribilin niño");
        }
    }
    public void modificarEdad(int e){
        edad=e;
        System.out.println("La edad de la persona es: "+edad);
    }
    public String getPaterno(){
        return apeP;
    }
}
