import math

class Estadisticas:
    def __init__(self, num):
        self.num = num
    def promedio(self):
        return sum(self.num)/len(self.num)
    def desviacion(self):
        m = self.promedio()
        return math.sqrt((sum((x-m)**2 for x in self.num))/ (len(self.num)-1))
    
num = list(map(float, input().split()))
e = Estadisticas(num)
print(f"El promedio es {e.promedio():.2f}")
print(f"La desviacion estandar es {e.desviacion():.5f}")