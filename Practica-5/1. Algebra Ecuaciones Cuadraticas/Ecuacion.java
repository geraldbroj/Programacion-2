package practica4;

public class Ecuacion {
	//Programacion modular estructurada
	public static double getDiscriminante(double a,double b, double c) {
		return b*b - 4*a*c;
	}
	public static double getRaiz1(double a, double b, double discriminante ) {
		return (-b + Math.sqrt(discriminante))/ (2*a);
	}
	public static double getRaiz2(double a, double b, double discriminante ) {
		return (-b- Math.sqrt(discriminante))/(2*a);
	}
	public static void resolver(double a,double b, double c) {
		double discriminante = getDiscriminante(a, b, c);
		if(discriminante > 0) {
			double raiz1 = getRaiz1(a, b, discriminante);
			double raiz2 = getRaiz2(a, b, discriminante);
			System.out.printf("Dos raices %.6f y %.6f%n", raiz1, raiz2);
		} else if(discriminante == 0) {
			double raiz = getRaiz1(a, b, discriminante);
			System.out.printf("Una raiz"+ raiz);
		} else {
			System.out.println("NO tiene raices");
		}
	}
	public static void main(String[] args) {
		resolver(1.0,3,1);
	}
}


