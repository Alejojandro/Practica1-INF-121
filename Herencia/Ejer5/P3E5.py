class Vehiculo:
    def __init__(self, conductor, placa, id_vehiculo):
        self.conductor = conductor
        self.placa = placa
        self.id = id_vehiculo

    def mostrar_info(self):
        print(f"Placa: {self.placa}, Conductor: {self.conductor}")

    def cambiar_conductor(self, nuevo_conductor):
        print(f"Cambiando conductor de {self.placa} de {self.conductor} a {nuevo_conductor}")
        self.conductor = nuevo_conductor
class Bus(Vehiculo):
    def __init__(self, conductor, placa, id_vehiculo, capacidad, sindicato):
        super().__init__(conductor, placa, id_vehiculo)
        self.capacidad = capacidad
        self.sindicato = sindicato

class Auto(Vehiculo):
    def __init__(self, conductor, placa, id_vehiculo, caballos_fuerza, descapotable):
        super().__init__(conductor, placa, id_vehiculo)
        self.caballos_fuerza = caballos_fuerza
        self.descapotable = descapotable

class Moto(Vehiculo):
    def __init__(self, conductor, placa, id_vehiculo, cilindrada, casco):
        super().__init__(conductor, placa, id_vehiculo)
        self.cilindrada = cilindrada
        self.casco = casco
class Main():
    bus1 = Bus("Carlos", "BUS-123", 1, 50, "Sindicato A")
    auto1 = Auto("Lucía", "AUTO-456", 2, 120, True)
    moto1 = Moto("Jorge", "MOTO-789", 3, 250, True)
    print(" Información de vehículos:")
    bus1.mostrar_info()
    auto1.mostrar_info()
    moto1.mostrar_info()
    print("\n Cambio de conductor:")
    bus1.cambiar_conductor("María")
    auto1.cambiar_conductor("Pedro")
    moto1.cambiar_conductor("Ana")
    print("\n Información actualizada:")
    bus1.mostrar_info()
    auto1.mostrar_info()
    moto1.mostrar_info()