import math
from multimethod import multimethod
class FiguraGeo():
    def __init__(self, r=0.0,l=0, b=0, al=0):
        self.__radio=r
        self.__lado=l
        self.__base=b
        self.__al=al
    @multimethod
    def area(self):
        return self.__radio*self.__radio*math.pi
    @multimethod
    def area(self, lado:int):
        return lado*lado
    @multimethod
    def area(self, base:int, al:int):
        return (base*al)/2
    @multimethod
    def perimetro(self):
        return self.__radio*2*math.pi
    @multimethod
    def perimetro(self, bas:int, alt:int):
        return 2*bas+2*alt
class Main():
    cir =FiguraGeo(2.5)
    cua =FiguraGeo()
    tri = FiguraGeo()
    rect =FiguraGeo()
    print(cir.area())
    print(cua.area(2))
    print(tri.area(4,5))
    print(cir.perimetro())
    print("El perimetro del rectangulo es:",rect.perimetro(5,4))