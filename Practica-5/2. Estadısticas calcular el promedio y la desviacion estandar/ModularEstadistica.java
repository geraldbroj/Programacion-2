package practica4;

import java.util.Iterator;
import java.util.Scanner;

public class ModularEstadistica {
	//Programacion modular estructurada
	public static double promedio(double[] num) {
		double suma = 0;
		for (double n : num) {
			suma += n;
		}
		return suma / num.length;
	}
	public static double desviacion(double[] num) {
		double m = promedio(num);
		double sum = 0;
		for (double n : num) {
			sum += Math.pow(n - m, 2);
		}
		return Math.sqrt(sum/(num.length - 1));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] en = scanner.nextLine().split(" ");
		double[] num = new double[en.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Double.parseDouble(en[i]);
		}
		System.out.printf("El promedio es %.2f%n",promedio(num));
		System.out.printf("La desviacion estandar es %.5f%n", desviacion(num));
		
		scanner.close();
	}
}
