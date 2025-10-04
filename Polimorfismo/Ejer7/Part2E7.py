class Parada:
    def __init__(self, nombreP="", admins_iniciales=None, autos_iniciales=None):
        self.nombreP = nombreP
        self.admins = [None] * 10
        self.autos = [[None, None, None] for _ in range(10)]  # modelo, conductor, placa

        if admins_iniciales:
            for i, admin in enumerate(admins_iniciales[:10]):
                self.admins[i] = admin

        if autos_iniciales:
            for i, auto in enumerate(autos_iniciales[:10]):
                for j in range(3):
                    self.autos[i][j] = auto[j]

    def mostrar(self):
        print(f"Nombre de la parada: {self.nombreP}")
        print("Administradores:")
        for admin in self.admins:
            if admin:
                print(f" - {admin}")
        print("Autos:")
        for auto in self.autos:
            if auto[0]:
                print(f"Modelo: {auto[0]}, Conductor: {auto[1]}, Placa: {auto[2]}")

    def adicionar_admin(self, nuevo_admin):
        for i in range(len(self.admins)):
            if self.admins[i] is None:
                self.admins[i] = nuevo_admin
                return
        print("No se puede añadir más administradores.")

    def adicionar_auto(self, modelo, conductor, placa):
        for i in range(len(self.autos)):
            if self.autos[i][0] is None:
                self.autos[i] = [modelo, conductor, placa]
                return
        print("No se puede añadir más autos.")
class Main():
    p1 = Parada()
    p1.adicionar_admin("Ana")
    p1.adicionar_admin("Luis")
    p1.adicionar_auto("Toyota Corolla", "Carlos", "123-ABC")
    p1.adicionar_auto("Honda Civic", "María", "456-DEF")

    print("=== Parada p1 ===")
    p1.mostrar()

    # Parada con datos iniciales
    admins_iniciales = ["Pedro", "Lucía"]
    autos_iniciales = [
        ["Mazda 3", "Jorge", "789-GHI"],
        ["Chevrolet Spark", "Sofía", "321-JKL"]
    ]
    p2 = Parada("Terminal Central", admins_iniciales, autos_iniciales)

    print("\n=== Parada p2 ===")
    p2.mostrar()