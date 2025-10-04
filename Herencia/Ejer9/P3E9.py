class Politico:
    def __init__(self, profesion, anios_exp):
        self.profesion = profesion
        self.anios_exp = anios_exp
class Partido:
    def __init__(self, nombre_partido, rol):
        self.nombre_partido = nombre_partido
        self.rol = rol
class Presidente(Politico, Partido):
    def __init__(self, nombre, apellido, profesion, anios_exp, nombre_partido, rol):
        Politico.__init__(self, profesion, anios_exp)
        Partido.__init__(self, nombre_partido, rol)
        self.nombre = nombre
        self.apellido = apellido
    def mostrar(self):
        print(f"{self.nombre} {self.apellido} | Profesión: {self.profesion}, Exp: {self.anios_exp} años")
        print(f"Partido: {self.nombre_partido}, Rol: {self.rol}")
class Main():
    p1 = Presidente("Luis", "Arce", "Economista", 20, "MAS", "Líder")
    p2 = Presidente("Carlos", "Mesa", "Abogado", 15, "Comunidad Ciudadana", "Candidato")
    p3 = Presidente("Eva", "Copa", "Socióloga", 10, "Jallalla", "Presidenta Municipal")
    presidentes = [p1, p2, p3]
    print(" Lista de presidentes:")
    for p in presidentes:
        p.mostrar()