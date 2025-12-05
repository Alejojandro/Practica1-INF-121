package com.mycompany.p3e2;
import java.util.*;
public class ArchivoTrabajador {
    private List<Trabajador> listaTrab;

    public ArchivoTrabajador() {
        listaTrab =new ArrayList<>();
    }
    public void agregarT(Trabajador t){
        listaTrab.add(t);
    }
    public void aumentarSal(double aumento, Trabajador t){
        t.setSalario(t.getSalario()+aumento);
    }
    public Trabajador buscarMayorSal(){
        if(listaTrab.isEmpty()) return null;
        Trabajador May= listaTrab.get(0);
        for (Trabajador t: listaTrab){
            if(t.getSalario() > May.getSalario()){
                May=t;
            }
        }
        return May;
    }
    public void ordSalario(){
        listaTrab.sort(Comparator.comparing(Trabajador::getSalario));
    }
    public void mostrarTod(){
        for(Trabajador t: listaTrab){
            t.mostrarInf();
        }
    }
    
}
