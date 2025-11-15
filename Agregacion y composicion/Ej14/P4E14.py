class Empleado:
    def __init__(self, nombre, puesto, salario):
        self.nombre = nombre
        self.puesto = puesto
        self.salario = salario

    def mostrar_info(self):
        return f"Empleado: {self.nombre}, Puesto: {self.puesto}, Salario: {self.salario}"


class Empresa:
    def __init__(self, nombre):
        self.nombre = nombre
        self.empleados = []

    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)

    def mostrar_info(self):
        print(f"Empresa: {self.nombre}")
        if not self.empleados:
            print("  No hay empleados registrados.")
        else:
            for e in self.empleados:
                print("  " + e.mostrar_info())

    def buscar_empleado(self, nombre):
        for e in self.empleados:
            if e.nombre == nombre:
                return e.mostrar_info()
        return f"Empleado {nombre} no encontrado."

    def eliminar_empleado(self, nombre):
        for e in self.empleados:
            if e.nombre == nombre:
                self.empleados.remove(e)
                print(f"Empleado {nombre} eliminado.")
                return
        print(f"Empleado {nombre} no encontrado.")

    def promedio_salarial(self):
        if not self.empleados:
            return 0
        total = sum(e.salario for e in self.empleados)
        return total / len(self.empleados)

    def empleados_con_salario_mayor(self, valor):
        return [e for e in self.empleados if e.salario > valor]
class Main():
    empresa = Empresa("Tech Solutions")
    empresa.agregar_empleado(Empleado("Ana Gómez", "Ingeniera", 5000))
    empresa.agregar_empleado(Empleado("Luis Pérez", "Analista", 3500))
    empresa.agregar_empleado(Empleado("María López", "Gerente", 7000))
    empresa.mostrar_info()
    print(empresa.buscar_empleado("Luis Pérez"))
    empresa.eliminar_empleado("Ana Gómez")
    empresa.mostrar_info()
    print("Promedio salarial:", empresa.promedio_salarial())
    lista = empresa.empleados_con_salario_mayor(4000)
    print("Empleados con salario mayor a 4000:")
    for e in lista:
        print("  " + e.mostrar_info())