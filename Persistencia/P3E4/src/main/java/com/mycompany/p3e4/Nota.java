package com.mycompany.p3e4;
public class Nota {
    private String materia;
    private double notaFinal;
    private Estudiante estudiante;

    public Nota(String materia, double notaFinal, Estudiante estudiante) {
        this.materia = materia;
        this.notaFinal = notaFinal;
        this.estudiante = estudiante;
    }

    public String getMateria() {
        return materia;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public Estudiante getEstdiante() {
        return estudiante;
    }
    public void mostrarInf(){
        System.out.println("El estudiante "+estudiante.getNombre()+" tiene una nota de "+notaFinal+" en la materia de "+materia);
    }
}
