class Cola:
    def __init__(self, n):
        self.__arreglo = [0] *(n +1)
        self.__n = n
        self.__inicio = 0
        self.__fin = 0
    def insert(self, e):
        if (self.__fin == self.__n):
            print("cola llena!!")
            return None
        else:
            self.__fin = self.__fin + 1
            self.__arreglo[self.__fin] = e

    def remove(self):
        if self.isEmpty():
            print("cola vacia")
            return None
        else:
            self.__inicio = (self.__inicio + 1)
            valor = self.__arreglo[self.__inicio]
            
            if (self.__inicio == self.__fin):
                self.__inicio = 0
                self.__fin = 0
            return valor
    def peek(self):
        return self.__arreglo[self.__inicio + 1]
    #--------------
    def isEmpty(self):
        return self.__fin == 0 and self.__inicio == 0
    def isFull(self):
        return self.__n == self.__fin
    def size(self):
        aux = Cola(self.__n)
        cont = 0
        while(not self.isEmpty()):
            dato = self.remove()
            aux.insert(dato)
            cont = cont + 1
        while(not aux.isEmpty()):
            dato = aux.remove()
            self.insert(dato)
        return cont
    def nroElem2(self): # size
        return self.__fin - self.__inicio
    
    


c = Cola(20)
c.insert(6)
c.insert(8)
c.insert(98)
c.insert(3)
c.insert(0)
c.insert(7)
c.remove()

print(c.size())

aux = Cola(20)

while (not c.isEmpty()):
    dat = c.remove()
    aux.insert(dat)
    print(dat, end=" ")
while(not aux.isEmpty()):
    dat = aux.remove()
    c.insert(dat)
        