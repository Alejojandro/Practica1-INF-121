class Departamento():
    def __init__(self, nom, area):
        self._nombre=nom
        self._area=area
        self._Empleado=[]
    def añadirEmpleado(self, e: 'Empleado'):
        self._Empleado.append(e)
    def mostrarEmpleados(self):
        for emp in self._Empleado:
            print(f"{emp._nombre} - {emp._cargo} - Sueldo: {emp._sueldo}")
    def cambioSalario(self, nsalario):
            for i in range(len(self._Empleado)):
                self._Empleado[i].setSueldo(nsalario)
    def yaenDep(self, em: 'Empleado'):
        for i in range(len(self._Empleado)):
            if(self._Empleado[i]==em):
                print("Este empleado pertenece a otro departamento")
    def moverDep(self, emp: 'Empleado', dep: 'Departamento'):
        if emp in self._Empleado:
            self._Empleado.remove(emp)
            dep.añadirEmpleado(emp)
class Empleado():
    def __init__(self, nom, cargo, suel):
        self._nombre=nom
        self._cargo=cargo
        self._sueldo=suel
    def getSueldo(self):
        return self._sueldo
    def setSueldo(self, nsueldo):
        self._sueldo=nsueldo
class Main():
    dep1=Departamento("Contabilidad","Finanzas")
    dep2=Departamento("Desarollo","Software")
    emp1=Empleado("Juan","jefe",2500)
    emp2=Empleado("Carlos","supervisor",1500)
    emp3=Empleado("Fernando","empleado",300)
    emp4=Empleado("Luis","empleado",500)
    emp5=Empleado("Ale","empleado",700)
    dep1.añadirEmpleado(emp1)
    dep1.añadirEmpleado(emp2)
    dep1.añadirEmpleado(emp3)
    dep1.añadirEmpleado(emp4)
    dep1.añadirEmpleado(emp5)
    dep1.mostrarEmpleados()
    dep1.cambioSalario(3000)
    dep1.mostrarEmpleados()
    dep1.yaenDep(emp2)
    dep1.moverDep(emp3,dep2)
    dep2.mostrarEmpleados()
