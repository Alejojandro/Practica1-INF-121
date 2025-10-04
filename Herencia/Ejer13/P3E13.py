class Empleado:
    def __init__(self, nombre, sueldo_mensual):
        self.nombre = nombre
        self.sueldo_mensual = sueldo_mensual

    def sueldo_total(self):
        return self.sueldo_mensual

    def mostrar(self):
        print(f"{self.__class__.__name__}: {self.nombre}, Sueldo base: {self.sueldo_mensual}")
class Administrativo(Empleado):
    def __init__(self, nombre, sueldo_mensual, cargo):
        super().__init__(nombre, sueldo_mensual)
        self.cargo = cargo

    def mostrar(self):
        super().mostrar()
        print(f"Cargo: {self.cargo}")

class Chef(Empleado):
    def __init__(self, nombre, sueldo_mensual, hora_extra, sueldo_hora):
        super().__init__(nombre, sueldo_mensual)
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        return self.sueldo_mensual + self.hora_extra * self.sueldo_hora

    def mostrar(self):
        super().mostrar()
        print(f"Horas extra: {self.hora_extra}, Sueldo por hora: {self.sueldo_hora}")

class Mesero(Empleado):
    def __init__(self, nombre, sueldo_mensual, hora_extra, sueldo_hora, propina):
        super().__init__(nombre, sueldo_mensual)
        self.hora_extra = hora_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self):
        return self.sueldo_mensual + self.hora_extra * self.sueldo_hora + self.propina

    def mostrar(self):
        super().mostrar()
        print(f"Horas extra: {self.hora_extra}, Sueldo por hora: {self.sueldo_hora}, Propina: {self.propina}")
class Main():
    chef1 = Chef("Remy", 3000, 10, 50)
    mesero1 = Mesero("Linguini", 2000, 5, 30, 200)
    mesero2 = Mesero("Colette", 2200, 8, 35, 150)
    admin1 = Administrativo("Skinner", 4000, "Gerente")
    admin2 = Administrativo("Django", 3500, "Contador")
    empleados = [chef1, mesero1, mesero2, admin1, admin2]
    X = 3500
    print(f"\n Empleados con sueldo base igual a {X}:")
    for e in empleados:
        if e.sueldo_mensual == X:
            e.mostrar()
    print("\n Sueldo total de cada empleado:")
    for e in empleados:
        print(f"{e.nombre} Sueldo total: {e.sueldo_total()}")