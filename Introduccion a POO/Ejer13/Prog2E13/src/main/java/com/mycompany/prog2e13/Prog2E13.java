package com.mycompany.prog2e13;
public class Prog2E13 {
    public static void main(String[] args) {
        String[] v={"K","E","D"};
        String[] s={"A","D","C"};
        String[] c={"E","C","G"};
        String[] p={"M","D","A"};
        Fruta f1=new Fruta("Kiwi","subtropical",3,v);
        Fruta f2=new Fruta("Sandia","Fresca");
        Fruta f3=new Fruta("Frutilla",c);
        Fruta f4=new Fruta("Papaya",p);
        Fruta[] frutas= {f2, f3, f4};
        System.out.println("Fruta con mas vitaminas");
        Fruta mayor = frutas[0];
        for (Fruta f : frutas) {
            if (f.getnroVit() > mayor.getnroVit()) {
                mayor = f;
            }
        }
        System.out.println("Fruta con mas vitaminas"+mayor.getNombre());
        System.out.println("\nVitaminas ordenadas alfabéticamente por fruta:");
        for (Fruta f : frutas) {
            f.mostrarOrdenadas();
        }
        System.out.println("-----------------------");
        f2.mostrarVitaminas();
        int totalCitricas = 0;
        for (Fruta f : frutas) {
            totalCitricas += f.sonCit();
        }
        System.out.println("Total de vitaminas cítricas: " + totalCitricas);
    }
}
