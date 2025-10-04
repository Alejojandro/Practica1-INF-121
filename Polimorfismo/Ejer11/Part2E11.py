class Pasajero:
    def __init__(self, nombre, edad, genero):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero

class Crucero:
    def __init__(self, nombre, pais_origen, pais_destino, nro_habitacion):
        self.nombre = nombre
        self.pais_origen = pais_origen
        self.pais_destino = pais_destino
        self.nro_habitacion = nro_habitacion
        self.pasajeros = []
        self.costos = []

    def agregar_pasajero(self, pasajero, costo):
        self.pasajeros.append(pasajero)
        self.costos.append(costo)

    def mostrar(self):
        print(f"Crucero: {self.nombre}, Origen: {self.pais_origen}, Destino: {self.pais_destino}, Habitación: {self.nro_habitacion}")
        for i, p in enumerate(self.pasajeros):
            print(f" - {p.nombre}, {p.genero}, Costo: {self.costos[i]}")

    def __eq__(self, otro):
        return sum(self.costos) == sum(otro.costos)

    def __add__(self, otro):
        return len(self.pasajeros) == len(otro.pasajeros)

    def __mul__(self, otro=None):
        hombres = sum(1 for p in self.pasajeros if p.genero == "M")
        mujeres = sum(1 for p in self.pasajeros if p.genero == "F")
        print(f"{self.nombre} → Hombres: {hombres}, Mujeres: {mujeres}")
class Main():
    c1 = Crucero("Titanic", "UK", "USA", 502)
    c2 = Crucero("Aurora", "Chile", "México", 600)

    c1.agregar_pasajero(Pasajero("Juan Vargas", 35, "M"), 500)
    c1.agregar_pasajero(Pasajero("Martina Vasques", 28, "F"), 1003)

    c2.agregar_pasajero(Pasajero("Wilmer Montero", 40, "M"), 925)
    c2.agregar_pasajero(Pasajero("Lucía Pérez", 30, "F"), 500)
    c2.agregar_pasajero(Pasajero("Carlos Ríos", 45, "M"), 78)

    c1.mostrar()
    c2.mostrar()

    print("\n¿Costos iguales?", c1 == c2)
    print("¿Misma cantidad de pasajeros?", c1 + c2)

    c1 * None
    c2 * None