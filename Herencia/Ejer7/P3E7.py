from multimethod import multimethod
class Persona:
    def __init__(self, nombre, paterno, materno, edad):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
    @multimethod
    def mostrar(self):
        print(f"{self.nombre} {self.paterno} {self.materno}, Edad: {self.edad}")
class Docente(Persona):
    def __init__(self, nombre, paterno, materno, edad, sueldo, reg_profesional):
        super().__init__(nombre, paterno, materno, edad)
        self.sueldo = sueldo
        self.reg_profesional = reg_profesional
    @multimethod
    def mostrar(self):
        super().mostrar()
        print(f"Docente | Sueldo: {self.sueldo}, Registro Profesional: {self.reg_profesional}")

class Estudiante(Persona):
    def __init__(self, nombre, paterno, materno, edad, ru, matricula):
        super().__init__(nombre, paterno, materno, edad)
        self.ru = ru
        self.matricula = matricula
    @multimethod
    def mostrar(self):
        super().mostrar()
        print(f"Estudiante | RU: {self.ru}, Matrícula: {self.matricula}")

    def promedioEdad(estudiantes):
        if not estudiantes:
            return 0
        total = sum(e.edad for e in estudiantes)
        return total / len(estudiantes)

    def modificarEdad(persona, nueva_edad):
        print(f"Modificando edad de {persona.nombre} de {persona.edad} a {nueva_edad}")
        persona.edad = nueva_edad

    def compararEdades(estudiante, docente):
        return estudiante.edad == docente.edad
class Main():
    e1 = Estudiante("Ana", "Gómez", "López", 20, "RU001", "MAT123")
    e2 = Estudiante("Luis", "Pérez", "Torres", 22, "RU002", "MAT456")
    d1 = Docente("María", "Cruz", "Vargas", 22, 5000, "REG789")
    print(" Información:")
    e1.mostrar()
    e2.mostrar()
    d1.mostrar()
    prom = promedioEdad([e1, e2])
    print(f"\n Promedio de edad de estudiantes: {prom:.2f} años")
    modificarEdad(e1, 23)
    iguales = compararEdades(e2, d1)
    print(f"\n ¿Edad de {e2.nombre} igual a la de {d1.nombre}? {'Sí' if iguales else 'No'}")