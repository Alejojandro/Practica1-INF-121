package com.mycompany.prog2p1;
public class Prog2P1 {
    public static void main(String[] args) {
        Vehiculo v1=new Vehiculo("Nissan",2005,50);
        Vehiculo v2=new Vehiculo("BMW",2020,40);
        v1.mostrar();
        v2.mostrar();
        System.out.println("Comienza la carrera");
        v1.acelerar();
        v2.acelerar();
        v1.frenar();
        v1.frenar();
        v2.acelerar();
        v2.acelerar();
        v1.frenar();
        v2.acelerar();
        v2.acelerar();
        System.out.println("FIN DE LA CARRERA");
        v1.mostrar();
        v2.mostrar();
    }
}
