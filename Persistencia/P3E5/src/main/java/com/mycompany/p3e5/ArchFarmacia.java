package com.mycompany.p3e5;
import java.util.*;
public class ArchFarmacia {
    private List<Farmacia> listaFarmacias;

    public ArchFarmacia() {
        listaFarmacias = new ArrayList<>();
    }

    public void agregarFarmacia(Farmacia f) {
        listaFarmacias.add(f);
    }

    // a) Mostrar medicamentos para la tos de sucursal X
    public void mostrarMedicamentosTos(int sucursal) {
        for (Farmacia f : listaFarmacias) {
            if (f.getSucursal() == sucursal) {
                for (Medicamento m : f.getMedicamentos()) {
                    if (m.getTipo().equalsIgnoreCase("Tos")) {
                        m.mostInf();
                    }
                }
            }
        }
    }
    public void buscarFarmaciasCon(String nombreMed) {
        for (Farmacia f : listaFarmacias) {
            for (Medicamento m : f.getMedicamentos()) {
                if (m.getNombre().equalsIgnoreCase(nombreMed)) {
                    System.out.println("Sucursal: " + f.getSucursal() + 
                                       ", Dirección: " + f.getDireccion());
                }
            }
        }
    }
    public void buscarPorTipo(String tipo) {
        for (Farmacia f : listaFarmacias) {
            for (Medicamento m : f.getMedicamentos()) {
                if (m.getTipo().equalsIgnoreCase(tipo)) {
                    m.mostInf();
                }
            }
        }
    }

    public void ordenarPorDireccion() {
        listaFarmacias.sort(Comparator.comparing(Farmacia::getDireccion));
    }
    public void moverMedicamentos(String tipo, int origen, int destino) {
        Farmacia fOrigen = null, fDestino = null;

        for (Farmacia f : listaFarmacias) {
            if (f.getSucursal() == origen) fOrigen = f;
            if (f.getSucursal() == destino) fDestino = f;
        }

        if (fOrigen != null && fDestino != null) {
            Iterator<Medicamento> it = fOrigen.getMedicamentos().iterator();
            while (it.hasNext()) {
                Medicamento m = it.next();
                if (m.getTipo().equalsIgnoreCase(tipo)) {
                    fDestino.agregarMedicamento(m);
                    it.remove();
                }
            }
        }
    }

    public void mostrarTodas() {
        for (Farmacia f : listaFarmacias) {
            System.out.println("Farmacia: " + f.getNombreFarmacia() + 
                               ", Sucursal: " + f.getSucursal() + 
                               ", Dirección: " + f.getDireccion());
            f.mostrarMedicamentos();
        }
    }
}
