class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
class Empleado:
    def __init__(self, sueldo, cargo):
        self.sueldo = sueldo
        self.cargo = cargo
class Policia:
    def __init__(self, grado, unidad):
        self.grado = grado
        self.unidad = unidad
class JefePolicia(Persona, Empleado, Policia):
    def __init__(self, nombre, edad, sueldo, cargo, grado, unidad):
        Persona.__init__(self, nombre, edad)
        Empleado.__init__(self, sueldo, cargo)
        Policia.__init__(self, grado, unidad)

    def mostrar_datos(self):
        print(f"‍️Jefe: {self.nombre}, Edad: {self.edad}")
        print(f"Sueldo: {self.sueldo}, Cargo: {self.cargo}")
        print(f"Grado: {self.grado}, Unidad: {self.unidad}")
class Main():
    jefe1 = JefePolicia("Carlos", 45, 8000, "Comandante", "Teniente", "Antinarcóticos")
    jefe2 = JefePolicia("Lucía", 50, 9500, "Inspectora", "Teniente", "Tránsito")
    jefe1.mostrar_datos()
    jefe2.mostrar_datos()
    mayor = jefe1 if jefe1.sueldo > jefe2.sueldo else jefe2
    print(f"\n El jefe con mayor sueldo es: {mayor.nombre}")
    mismo_grado = jefe1.grado == jefe2.grado
    print(f" ¿Tienen el mismo grado? {'Sí' if mismo_grado else 'No'}")