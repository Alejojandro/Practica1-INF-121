class Vehiculo():
    def __init__(self, marca, modelo, velAct):
        self.__marca=marca
        self.__modelo=modelo
        self.__velAct=velAct
    def acelerar(self):
        self.__velAct=self.__velAct+10
        print("Se acelera",self.__velAct)
    def frenar(self):
        if(self.__velAct<=0):
            print("El auto freno")
        else:
            self.__velAct=self.__velAct-10
            print("La velocidad actual es ",self.__velAct)
    def __str__(self):
        return f"velocidad actual: {self.__velAct}"
class Main():
    a1=Vehiculo("Nissan",2005,45)
    a2=Vehiculo("Toyota",2020,65)
    print(a1)
    print(a2)
    print("INICIA LA CARRERA")
    a1.frenar()
    a2.acelerar()
    a2.acelerar()
    a1.acelerar()
    print("Termina la carrera")
    print(a1)
    print(a2)
