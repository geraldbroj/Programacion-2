package practica4;

import java.util.Iterator;
import java.util.Scanner;

class Estadisticas {
	private double[] num;
	public Estadisticas(double[] num) {
		this.num = num;
	}
	public double promedio() {
		double sum = 0;
		for(double n : num) {
			sum += n;
		}
		return sum / num.length;
	}
	
	public double desviacion() {
		double m = promedio();
		double sum = 0;
		for(double n : num) {
			sum += Math.pow(n - m, 2);
		}
		return Math.sqrt(sum / (num.length - 1));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] en = scanner.nextLine().split(" ");
		double[] num = new double[en.length];
		for (int i = 0; i < en.length; i++) {
			num[i] = Double.parseDouble(en[i]);
		
		}
		Estadisticas es = new Estadisticas(num);
		System.out.printf("El promedio es %.2f%n", es.promedio());
        System.out.printf("La desviación estándar es %.5f%n", es.desviacion());
        scanner.close();
	}
}
