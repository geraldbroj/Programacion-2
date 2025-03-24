import math

class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def getDiscriminante(self):
        return self.b**2 - 4 * self.a * self.c

    def getRaiz1(self):
        return (-self.b + math.sqrt(self.getDiscriminante())) / (2 * self.a)

    def getRaiz2(self):
        return (-self.b - math.sqrt(self.getDiscriminante())) / (2 * self.a)

    def resolver(self):
        discriminante = self.getDiscriminante()
        
        if discriminante > 0:
            raiz1 = self.getRaiz1()
            raiz2 = self.getRaiz2()
            print(f"La ecuación tiene dos raíces {raiz1:.5f} y {raiz2:.5f}")
        elif discriminante == 0:
            raiz = self.getRaiz1()
            print(f"La ecuación tiene una raíz {raiz:.0f}")
        else:
            print("La ecuación no tiene raíces reales")

es = input("Ingrese a, b, c: ")
a,b,c = map(float, es.split())
k = EcuacionCuadratica(a,b,c)
k.resolver()
