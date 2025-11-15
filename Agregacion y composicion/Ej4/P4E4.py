class Ropero():
    def __init__(self, material, nRopas):
        self._mat=material
        self._nroR=nRopas
        self._Ropa=[]
    def añadirRopa(self, ro:'Ropa'):
        self._Ropa.append(ro)
    def eliminarMaterial(self, m: str):
        self._Ropa = [r for r in self._Ropa if r.getMaterial() != m]

    def eliminarTipo(self, t: str):
        self._Ropa = [r for r in self._Ropa if r.getTipo() != t]

    def mostrarPrendas(self, ti: str, ma: str):
        for ro in self._Ropa:
            if ro.getTipo() == ti and ro.getMaterial() == ma:
                print(f"tipo: {ro.getTipo()}, material: {ro.getMaterial()}")
class Ropa():
    def __init__(self, tipo, material):
        self._tip=tipo
        self._mat=material
    def getTipo(self):
        return self._tip
    def getMaterial(self):
        return self._mat
class Main():
    r1 = Ropa("camisa", "algodón")
    r2 = Ropa("pantalón", "jean")
    r3 = Ropa("camisa", "seda")

    ropero = Ropero("madera", 3)
    ropero.añadirRopa(r1)
    ropero.añadirRopa(r2)
    ropero.añadirRopa(r3)

    ropero.mostrarPrendas("camisa", "seda")
    ropero.eliminarMaterial("algodón") 
    ropero.eliminarTipo("pantalón")




