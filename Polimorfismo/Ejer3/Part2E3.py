class Matriz:
    TAM = 10
    def __init__(self, valores=None):
        if valores is None:
            self.matriz = [[1.0 if i == j else 0.0 for j in range(self.TAM)] for i in range(self.TAM)]
        else:
            if len(valores) != self.TAM or any(len(fila) != self.TAM for fila in valores):
                raise ValueError("La matriz debe ser de 10x10")
            self.matriz = [fila[:] for fila in valores]
    def sumar(self, otra):
        resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(self.TAM)] for i in range(self.TAM)]
        return Matriz(resultado)
    def restar(self, otra):
        resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(self.TAM)] for i in range(self.TAM)]
        return Matriz(resultado)
    def igual(self, otra):
        return all(self.matriz[i][j] == otra.matriz[i][j] for i in range(self.TAM) for j in range(self.TAM))
    def imprimir(self):
        for fila in self.matriz:
            print(" ".join(f"{elem:6.2f}" for elem in fila))
class Main():
    A = Matriz()  # identidad
    B = Matriz([[2.0] * 10 for _ in range(10)])  # matriz llena de 2.0
    C = A.sumar(B)
    D = B.restar(A)
    C.imprimir()
    D.imprimir()
    C.igual(D)
