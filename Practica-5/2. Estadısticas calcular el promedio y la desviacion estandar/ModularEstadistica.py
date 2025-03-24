import math

def promedio(num):
    return sum(num) / len(num)
def desviacion(num):
    m = promedio(num)
    return math.sqrt(sum((x - m)**2 for x in num )/ (len(num)-1))

num = list(map(float, input().split()))
print(f"El promedio es {promedio(num):.2f}")
print(f"La desviación estandard es {desviacion(num):.5f}")

