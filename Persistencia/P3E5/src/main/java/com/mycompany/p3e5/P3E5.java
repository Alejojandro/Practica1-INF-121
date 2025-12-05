package com.mycompany.p3e5;
public class P3E5 {

    public static void main(String[] args) {
        ArchFarmacia archivo = new ArchFarmacia();
        Medicamento m1 = new Medicamento("Tapsin", 101, "Tos", 25.0);
        Medicamento m2 = new Medicamento("Ibuprofeno", 102, "Dolor", 18.0);
        Medicamento m3 = new Medicamento("Paracetamol", 103, "Fiebre", 20.0);
        Medicamento m4 = new Medicamento("JarabeTos", 104, "Tos", 30.0);

        Farmacia f1 = new Farmacia("Farmacia Central", 1, "Av. Siempre Viva");
        Farmacia f2 = new Farmacia("Farmacia Norte", 2, "Calle Luna");

        f1.agregarMedicamento(m1);
        f1.agregarMedicamento(m2);
        f2.agregarMedicamento(m3);
        f2.agregarMedicamento(m4);

        archivo.agregarFarmacia(f1);
        archivo.agregarFarmacia(f2);

        System.out.println("=== Medicamentos para la tos en sucursal 1 ===");
        archivo.mostrarMedicamentosTos(1);

        System.out.println("\n=== Farmacias que tienen Tapsin ===");
        archivo.buscarFarmaciasCon("Tapsin");

        System.out.println("\n=== Medicamentos de tipo 'Tos' ===");
        archivo.buscarPorTipo("Tos");

        System.out.println("\n=== Ordenando farmacias por dirección ===");
        archivo.ordenarPorDireccion();
        archivo.mostrarTodas();

        System.out.println("\n=== Moviendo medicamentos de tipo 'Tos' de sucursal 2 a 1 ===");
        archivo.moverMedicamentos("Tos", 2, 1);
        archivo.mostrarTodas();
    }
}
