from symtable import Class


class Bailarin:
    def __init__(self, nombre, edad, facultad, fraternidad):
        self.nombre = nombre
        self.edad = edad
        self.facultad = facultad
        self.fraternidad = fraternidad

    def mostrar_info(self):
        print(f"Bailarín: {self.nombre}, Edad: {self.edad}, "
              f"Facultad: {self.facultad.nombre}, Fraternidad: {self.fraternidad.nombre}")


class Facultad:
    def __init__(self, nombre):
        self.nombre = nombre

    def mostrar_info(self):
        print(f"Facultad: {self.nombre}")


class Fraternidad:
    def __init__(self, nombre, encargado):
        self.nombre = nombre
        self.encargado = encargado
        self.bailarines = []

    def agregar_bailarin(self, bailarin):
        self.bailarines.append(bailarin)

    def mostrar_info(self):
        print(f"Fraternidad: {self.nombre}, Encargado: {self.encargado}")
        print("Bailarines:")
        for b in self.bailarines:
            print(f" - {b.nombre}")


class SistemaEntrada:
    def __init__(self):
        self.facultades = []
        self.fraternidades = []
        self.bailarines = []

    def registrar_facultad(self, facultad):
        self.facultades.append(facultad)

    def registrar_fraternidad(self, fraternidad):
        self.fraternidades.append(fraternidad)

    def registrar_bailarin(self, bailarin):
        # Verificar que no esté en más de una fraternidad
        for existente in self.bailarines:
            if existente.nombre == bailarin.nombre:
                print(f"ERROR: El bailarín {bailarin.nombre} ya está registrado en otra fraternidad.")
                return
        self.bailarines.append(bailarin)
        bailarin.fraternidad.agregar_bailarin(bailarin)
        print(f"Bailarín {bailarin.nombre} registrado correctamente.")

    def mostrar_estado(self):
        for f in self.facultades:
            f.mostrar_info()
        for fr in self.fraternidades:
            fr.mostrar_info()
        print(f"Total de bailarines: {len(self.bailarines)}")
class Main():
    sistema = SistemaEntrada()
    f1 = Facultad("Ingeniería")
    f2 = Facultad("Medicina")
    sistema.registrar_facultad(f1)
    sistema.registrar_facultad(f2)
    fr1 = Fraternidad("Fraternidad Andina", "Carlos Pérez")
    fr2 = Fraternidad("Fraternidad Amazónica", "María López")
    sistema.registrar_fraternidad(fr1)
    sistema.registrar_fraternidad(fr2)
    b1 = Bailarin("Juan", 20, f1, fr1)
    b2 = Bailarin("Ana", 22, f2, fr1)
    b3 = Bailarin("Luis", 19, f1, fr2)
    b4 = Bailarin("Sofía", 21, f2, fr2)
    b5 = Bailarin("Pedro", 23, f1, fr1)
    sistema.registrar_bailarin(b1)
    sistema.registrar_bailarin(b2)
    sistema.registrar_bailarin(b3)
    sistema.registrar_bailarin(b4)
    sistema.registrar_bailarin(b5)
    sistema.mostrar_estado()
