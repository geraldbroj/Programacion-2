package practica4;

import java.util.Scanner;

class EcuacionPOO {
	private double a, b, c;

    public EcuacionPOO(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1() {
        return (-b + Math.sqrt(getDiscriminante()))/(2*a);
    }

    public double getRaiz2() {
        return (-b - Math.sqrt(getDiscriminante()))/(2 * a);
    }

    public void resolver() {
        double discriminante = getDiscriminante();

        if (discriminante > 0) {
            System.out.printf("La ecuación tiene dos raíces %.6f y %.6f%n", getRaiz1(), getRaiz2());
        } else if (discriminante == 0) {
            System.out.printf("La ecuación tiene una raíz "+ getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        String input = scanner.nextLine();
        String[] valores = input.split(" ");
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);
        EcuacionPOO p = new EcuacionPOO(a,b,c);
        p.resolver();
        scanner.close();
    }
}
