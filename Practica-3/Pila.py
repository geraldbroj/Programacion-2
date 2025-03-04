class Pila:
    def __init__(self,n):
        self.__n = n
        self.__arreglo = [0] * n
        self.__top = -1
    def push(self, e):
        if not self.isFull():
            self.__top +=1
            self.__arreglo[self.__top] = e
        else:
            print("Pila llena")
    def pop(self):
        if self.isEmpty():
            print("pila vacia!!")
        else:
            elemento = self.__arreglo[self.__top]
            self.__top -= 1
            return elemento
    def peek(self):
        if self.isEmpty():
            print("Pila vacia")
        else:
            return self.__arreglo[self.__top]
    def isEmpty(self):
        return self.__top == -1
    def isFull(self):
        return self.__top == self.__n -1

    
p = Pila(9)
p.push(6)
p.push(23)
p.push(9)
p.push(7)
p.push(0)
p.push(1)
p.pop()
p.pop()


if p.isEmpty():
    print("Pila vacia")
else:
    print("Pila: ")
    for i in range(p._Pila__top + 1):
        print(p._Pila__arreglo[i])  
    print()
