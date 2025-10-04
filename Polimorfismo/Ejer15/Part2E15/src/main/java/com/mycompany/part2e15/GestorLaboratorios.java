package com.mycompany.part2e15;
public class GestorLaboratorios {
    public static void trasladar(Laboratorio origen, Laboratorio destino, String[] seriales) {
        System.out.println("\n🔄 Estado antes del traslado:");
        origen.mostrarSeriales();
        destino.mostrarSeriales();

        for (String s : seriales) {
            Ordenador trasladado = null;
            for (Ordenador o : origen.getOrdenadores()) {
                if (o.getSerial().equals(s)) {
                    trasladado = o;
                    break;
                }
            }
            if (trasladado != null) {
                destino.agregarOrdenador(trasladado);
                origen.eliminarPorSerial(s);
            }
        }

        System.out.println("\n✅ Estado después del traslado:");
        origen.mostrarSeriales();
        destino.mostrarSeriales();
    }
}
