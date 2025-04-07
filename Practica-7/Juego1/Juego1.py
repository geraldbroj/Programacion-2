import random

class Juego:
    def __init__(self, numeroDeVidas):
        self.numeroDeVidas = numeroDeVidas
        self.vidasActuales = numeroDeVidas
        self.record = 0

    def actualizaRecord(self):
        if self.vidasActuales > self.record:
            self.record = self.vidasActuales
            print("record actualizadas")

    def reiniciaPartida(self):
        self.vidasActuales = self.numeroDeVidas
        print("Partida reiniciada")

    def quitaVida(self):
        self.vidasActuales -= 1
        print(f"Vida perdida: {self.vidasActuales}")
        return self.vidasActuales > 0

class JuegoAdivinaNumero(Juego):
    def __init__(self, numeroDeVidas):
        super().__init__(numeroDeVidas)
        self.numeroAAdivinar = None
    def validaNumero(self, num):
        return 0 <= num and num <= 10
    def juega(self):
        self.reiniciaPartida()
        self.numeroAAdivinar = random.randint(0,10)
        while self.vidasActuales > 0:
            try:
                intento = int(input("Adivina un numero entre 0 y 10: "))
            except ValueError:
                print("Ingresar numero valido!!!")
                continue
            if intento == self.numeroAAdivinar:
                print("Acertaste!!")
                self.actualizaRecord()
                break
            else:
                if self.quitaVida():
                    if intento < self.numeroAAdivinar:
                        print("El numero es mayor")
                    else:
                        print("El numero es menor")
                else:
                    print("Fin del Juego")
                    break
#--------------------------------Juego2-----------------------------------------------------
class JuegoAdivinaPar(JuegoAdivinaNumero):
    def validaNumero(self, num):
        if 0 <= num <=  10 and num % 2 == 0:
            return True 
        elif 0 <= num <= 10:
            print("El numero es impar")
        else:
            print("FUERA DE RANGO!!!!")
        return False

class JuegoAdivinaImpar(JuegoAdivinaNumero):
    def validaNumero(self, num):
        if 0<= num <= 10 and num % 2 != 0:
            return True
        elif 0 <= num <= 10:
            print ("EL numero es par")
        else:
            print("NO ESTA EN EL RANGO!!!!")
        return False        
        

juego = JuegoAdivinaNumero(3)
juego.juega()
#PAR
print("---------Adivina número par----------")

juego2 = JuegoAdivinaPar(3)
juego2.juega()
#IMPAR
print("---------Adivina número impar----------")

juego3 = JuegoAdivinaImpar(3)
juego3.juega()