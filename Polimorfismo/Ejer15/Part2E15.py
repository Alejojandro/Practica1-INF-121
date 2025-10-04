class Ordenador():
    def __init__(self, serial, numero, ram, procesador, estado):
        self.serial = serial
        self.numero = numero
        self.ram = ram
        self.procesador = procesador
        self.estado = estado

    def mostrar(self):
        print(f"Serial: {self.serial}, Número: {self.numero}, RAM: {self.ram} GB, Procesador: {self.procesador}, Estado: {self.estado}")
class Laboratorio():
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []

    def agregar_ordenador(self, ordenador):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(ordenador)
        else:
            print(f"{self.nombre} está lleno.")
    def informacion(self, estado=None, ram_min=None):
        print(f"\nInformación del laboratorio {self.nombre}:")
        for o in self.ordenadores:
            if estado and o.estado != estado:
                continue
            if ram_min and o.ram <= ram_min:
                continue
            o.mostrar()
    def mostrar_seriales(self):
        return [o.serial for o in self.ordenadores]
    def trasladar(lab_origen, lab_destino, seriales_a_trasladar):
        print("\n🔄 Estado antes del traslado:")
        print(f"{lab_origen.nombre}: {lab_origen.mostrar_seriales()}")
        print(f"{lab_destino.nombre}: {lab_destino.mostrar_seriales()}")

        trasladados = []
        for serial in seriales_a_trasladar:
            for o in lab_origen.ordenadores:
                if o.serial == serial:
                    if len(lab_destino.ordenadores) < lab_destino.capacidad:
                        lab_destino.agregar_ordenador(o)
                        trasladados.append(o)
                    else:
                        print(f"{lab_destino.nombre} no tiene espacio para {serial}")
                    break
        lab_origen.ordenadores = [o for o in lab_origen.ordenadores if o.serial not in seriales_a_trasladar]
        print("\n✅ Estado después del traslado:")
        print(f"{lab_origen.nombre}: {lab_origen.mostrar_seriales()}")
        print(f"{lab_destino.nombre}: {lab_destino.mostrar_seriales()}")
class Main():
    lasin1 = Laboratorio("Lasin 1", 5)
    lasin2 = Laboratorio("Lasin 2", 5)
    o1 = Ordenador("A001", 1, 4, "Intel i3", "activo")
    o2 = Ordenador("A002", 2, 8, "Intel i5", "inactivo")
    o3 = Ordenador("A003", 3, 16, "Intel i7", "activo")
    o4 = Ordenador("A004", 4, 12, "Ryzen 5", "activo")
    o5 = Ordenador("A005", 5, 6, "Intel i5", "inactivo")
    o6 = Ordenador("A006", 6, 32, "Ryzen 7", "activo")
    lasin1.agregar_ordenador(o1)
    lasin1.agregar_ordenador(o2)
    lasin1.agregar_ordenador(o3)
    lasin2.agregar_ordenador(o4)
    lasin2.agregar_ordenador(o5)
    lasin2.agregar_ordenador(o6)
    lasin1.informacion(estado="activo")
    lasin2.informacion(ram_min=8)
    lasin2.informacion()