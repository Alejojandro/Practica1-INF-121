package com.mycompany.prog2e5;
public class Prog2E5 {
    public static void main(String[] args) {
        Persona p1=new Persona("Ale","Cory","Cornejo",19,8480654);
        Persona p2=new Persona("Zhu","Cory","Yuan",23,7598135);
        Persona p3=new Persona("Kitasan","Black","Carmine",14,546455);
        System.out.println("Datos persona 1:");
        p1.mostrarDatos();
        System.out.println("Datos persona 2");
        p2.mostrarDatos();
        p1.mayorEdad();
        p2.mayorEdad();
        p3.mayorEdad();
        p3.modificarEdad(18);
        p3.mayorEdad();
        if(p1.getPaterno().equals(p2.getPaterno())){
            System.out.println("Ambos tienen mismo apellido paterno");
        }else{
            System.out.println("No mismo ape Patern");
        }
    }
}
