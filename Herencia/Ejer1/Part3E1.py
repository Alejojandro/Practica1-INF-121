class Persona:
    def __init__(self):
        self.__nombre = "Ale"
        self.__apellido = "Cory"
        self.__ci = "8480654"

    def get_nombre(self):
        return self.__nombre

    def mostrar(self):
        print(f"El usuario {self.__nombre} {self.__apellido} tiene un CI de {self.__ci}")
class Cliente(Persona):
    def __init__(self, nro_compra, id_cliente, nombre_cliente):
        super().__init__()  # inicializa nombre, apellido, ci desde Persona
        self.nro_compra = nro_compra
        self.id_cliente = id_cliente
        self.nombre_cliente = nombre_cliente  # evita conflicto con self._nombre

    def mostrar_cliente(self):
        print(f"Cliente {self.nombre_cliente} con ID {self.id_cliente} realizó la compra {self.nro_compra}")
class Jefe(Persona):
    def __init__(self, sucursal="", ci="", tipo=""):
        self.__sucursal = sucursal
        self.__ci = ci
        self.__tipo = tipo

    # Métodos de acceso (getters)
    def get_sucursal(self):
        return self.__sucursal

    def get_ci(self):
        return self.__ci

    def get_tipo(self):
        return self.__tipo

    # Método para mostrar la información
    def mostrar(self):
        print(f"Sucursal: {self.__sucursal}, CI: {self.__ci}, Tipo: {self.__tipo}")
class Main():
    p1 = Persona()
    p1.mostrar()

