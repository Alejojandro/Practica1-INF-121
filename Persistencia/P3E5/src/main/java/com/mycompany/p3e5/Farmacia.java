package com.mycompany.p3e5;
import java.util.*;
public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private List<Medicamento> medicamentos;

    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.medicamentos = new ArrayList<>();
    }

    public int getSucursal() { return sucursal; }
    public String getDireccion() { return direccion; }
    public String getNombreFarmacia() { return nombreFarmacia; }
    public List<Medicamento> getMedicamentos() { return medicamentos; }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public void mostrarMedicamentos() {
        for (Medicamento m : medicamentos) {
            m.mostInf();
        }
    }

    public void eliminarPorTipo(String tipo) {
        medicamentos.removeIf(m -> m.getTipo().equalsIgnoreCase(tipo));
    }
}
