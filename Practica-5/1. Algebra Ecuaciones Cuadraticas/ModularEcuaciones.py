import math

def get_discriminante(a, b, c):
    return b**2 - 4 * a * c

def get_raiz1(a, b, discriminante):
    return (-b + math.sqrt(discriminante)) / (2 * a)

def get_raiz2(a, b, discriminante):
    return (-b - math.sqrt(discriminante)) / (2 * a)

def resolver(a, b, c):
    discriminante = get_discriminante(a, b, c)

    if discriminante > 0:
        raiz1 = get_raiz1(a, b, discriminante)
        raiz2 = get_raiz2(a, b, discriminante)
        print(f"La ecuación tiene dos raíces {raiz1:.5f} y {raiz2:.5f}")
    elif discriminante == 0:
        raiz = get_raiz1(a, b, discriminante)
        print(f"La ecuación tiene una raíz {raiz}")
    else:
        print("La ecuación no tiene raíces reales")

es = input("Ingrese a, b, c: ")
a,b,c = map(float, es.split())
k = resolver(a,b,c)

