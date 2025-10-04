class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se desplaza de forma genérica.")
class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina con fuerza por la sabana.")

class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada ágilmente en aguas frías.")

class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta velozmente por la pradera.")
class Main():
    animales = [
        Leon("Simba", 5),
        Pinguino("Pingu", 3),
        Canguro("Kangy", 4),
        Leon("Nala", 6),
        Pinguino("Glacier", 2)
    ]

    print("Desplazamientos:")
    for animal in animales:
        animal.desplazarse()
