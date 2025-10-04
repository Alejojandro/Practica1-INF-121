class Producto():
    def __init__(self, nombre, precio, stock):
        self.__nombre=nombre
        self.__precio=precio
        self.__stock=stock
    def vender(self):
        self.__stock=self.__stock-1
        print("se vendio", self.__nombre," su stock actual es ",self.__stock)
    def reabastecer(self):
        self.__stock=self.__stock+1
        print("Se reabastece", self.__nombre," se tiene: ",self.__stock)
    def __str__(self):
        return f"Hay {self.__stock} de {self.__nombre}"
class Main:
    p1=Producto("Papitas",8,10)
    p2=Producto("Pilfrut",2,6)
    print(p1)
    print(p2)
    p1.vender()
    p1.vender()
    p1.vender()
    p1.vender()
    p1.reabastecer()
    p2.vender()
    p2.vender()
    p2.vender()
    p2.vender()
    p2.vender()
    p2.reabastecer()
    print(p1)
    print(p2)