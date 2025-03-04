package Punto;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2, 5);
        Punto p2 = new Punto(10, 9);
        Linea linea = new Linea(p1, p2);
        Circulo circulo = new Circulo(new Punto(5, 5), 5);

        System.out.println(linea);
        linea.dibujaLinea();
        System.out.println("-----------------------------");
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
