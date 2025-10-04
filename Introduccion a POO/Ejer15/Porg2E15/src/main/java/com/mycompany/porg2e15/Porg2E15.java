package com.mycompany.porg2e15;
public class Porg2E15 {
    public static void main(String[] args) {
        Carta c1 = new Carta("C123", "Hola Peter, te mando saludos desde Bolivia.", "Juan Álvarez", "Peter Chaves");
        Carta c2 = new Carta("C456", "Querido amigo, te escribo para decirte que aún te recuerdo con cariño.", "Pepe Mujica", "Wilmer Pérez");
        Carta c3 = new Carta("C789", "Con amor y esperanza, te deseo lo mejor.", "Paty Vasquez", "Pepe Mujica");

        Buzon b1 = new Buzon(1);
        Buzon b2 = new Buzon(2);
        Buzon b3 = new Buzon(3);

        b1.agregarCarta(c1);
        b1.agregarCarta(c2);
        b1.agregarCarta(c3);

        b2.agregarCarta(new Carta("C101", "Amor eterno desde el sur.", "Luis", "Pepe Mujica"));
        b2.agregarCarta(new Carta("C102", "Sin amor no hay vida.", "Ana", "Wilmer Pérez"));
        b2.agregarCarta(new Carta("C103", "Te amo, aunque no lo sepas.", "Carlos", "Peter Chaves"));

        b3.agregarCarta(new Carta("C201", "Carta sin amor.", "Pedro", "Juan Álvarez"));
        b3.agregarCarta(new Carta("C202", "Amor, paz y libertad.", "Lucía", "Pepe Mujica"));
        b3.agregarCarta(new Carta("C203", "Sin palabras clave.", "Mario", "Wilmer Pérez"));
    }

    public static void contarCartasRecibidas(String destinatario, Buzon... buzones) {
        int total = 0;
        for (Buzon b : buzones) {
            for (Carta c : b.getCartas()) {
                if (c.getDestinatario().equalsIgnoreCase(destinatario)) {
                    total++;
                }
            }
        }
        System.out.println(destinatario + " recibió " + total + " cartas.");
    }
    public static void verificarRemitente(String remitente, Buzon... buzones) {
        boolean encontrado = false;
        for (Buzon b : buzones) {
            for (Carta c : b.getCartas()) {
                if (c.getRemitente().equalsIgnoreCase(remitente)) {
                    encontrado = true;
                    System.out.println(" Carta con remitente " + remitente + ": " + c);
                }
            }
        }
        if (!encontrado) System.out.println(" No hay cartas con remitente " + remitente);
    }

    public static void buscarPorPalabraClave(String palabra, Buzon... buzones) {
        System.out.println("Buscando palabra clave: \"" + palabra + "\"");
        for (Buzon b : buzones) {
            for (Carta c : b.getCartas()) {
                if (c.getDescripcion().toLowerCase().contains(palabra.toLowerCase())) {
                    System.out.println("Coincidencia en carta " + c.getCodigo() + ":");
                    System.out.println("   Remitente: " + c.getRemitente());
                    System.out.println("   Destinatario: " + c.getDestinatario());
                }
            }
        }
    }
}
