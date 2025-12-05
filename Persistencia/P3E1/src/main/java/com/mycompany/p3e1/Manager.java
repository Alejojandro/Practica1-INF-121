package com.mycompany.p3e1;
import java.util.*;
import java.io.*;
public class Manager {
    private List<Charango> listaCharangos;

    public Manager() {
        listaCharangos= new ArrayList<>();
    }
    public void agregarChar(Charango c){
        listaCharangos.add(c);
    }
    public void eliminarChar(){
        listaCharangos.removeIf(c -> c.contadorCuerdas() > 6);
    }
    public List<Charango> listaMat(String mat){
        List<Charango> resultado= new ArrayList<>();
        for(Charango c: listaCharangos){
            if(c.getMaterial().equalsIgnoreCase(mat)){
                resultado.add(c);
            }
        }
        return resultado;
    }
    public List<Charango> buscCuerdas(){
        List<Charango> resultado =new ArrayList<>();
        for(Charango c: listaCharangos){
            if(c.getNroCuerdas() == 10){
                resultado.add(c);
            }
        }
        return resultado;
    }
    public void ordenAlfabetico(){
        listaCharangos.sort(Comparator.comparing(Charango:: getMaterial));
    }
    public void mostrarTodos(){
        for(Charango c : listaCharangos){
            c.mostrarInfo();
        }
    }
}
