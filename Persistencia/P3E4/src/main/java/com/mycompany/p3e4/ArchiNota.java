package com.mycompany.p3e4;
import java.util.*;
public class ArchiNota {
    private String nombreArchi;
    private List<Nota> listaN;

    public ArchiNota(String nombreArchi) {
        this.nombreArchi = nombreArchi;
        this.listaN = new ArrayList<>();
    }
    public void agregarNot(List<Nota> notas){
        listaN.addAll(notas);
    }
    public double promedioN(){
        if(listaN.isEmpty()) return 0;
        double suma=0;
        for(Nota n: listaN){
            suma += n.getNotaFinal();
        }
        return suma/ listaN.size();
    }
    public  List<Nota> mejN(){
        List<Nota> resultado =new ArrayList<>();
        if(listaN.isEmpty()) return resultado;
        double Mej = listaN.get(0).getNotaFinal();
        for(Nota n: listaN){
            if(n.getNotaFinal()>Mej){
                Mej=n.getNotaFinal();
            }
        }
        for (Nota n: listaN){
            if(n.getNotaFinal() == Mej){
                resultado.add(n);
            }
        }
        return resultado;
    }
    public void eliminarxMat(String maeteria){
        listaN.removeIf(n -> n.getMateria().equalsIgnoreCase(maeteria));
    }
    public void mostrarTod(){
        for(Nota n: listaN){
            n.mostrarInf();
        }
    }
}
