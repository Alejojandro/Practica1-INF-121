class Celular():
    def __init__(self, nroTel=0,dueño="", espacio=0, ram=0, nroApp=0 ):
        self.nT=nroTel
        self.d=dueño
        self.es=espacio
        self.ram=ram
        self.nA=nroApp
    def __add__(self,o):
        return self.nA+10
    def __sub__(self, o):
        return self.es-5
    def __str__(self):
        return f"EL celular de numero {self.nT} de propietario {self.d} con espacio de {self.es} gb, con {self.nA} apps y con {self.ram} de ram "
class Main():
    c1=Celular(68025385, "Juan", 64, 8, 15)
    c2=Celular(72556799, "Luis", 256, 16, 20)
    print(c1)
    d=c1+10
    c1 = Celular(68025385, "Juan", 64, 8, d)
    print(c1)


