package com.mycompany.porg2e15;
import java.util.ArrayList;
import java.util.List;
public class Buzon {
    private int nro;
    private List<Carta> cartas;

    public Buzon(int nro) {
        this.nro = nro;
        this.cartas = new ArrayList<>();
    }
    public void agregarCarta(Carta c) {
        cartas.add(c);
    }
    public List<Carta> getCartas() {
        return cartas;
    }
    @Override
    public String toString() {
        return "Buzón #" + nro + " con " + cartas.size() + " cartas.";
    }
}
