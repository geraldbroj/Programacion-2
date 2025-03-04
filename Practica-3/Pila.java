package pila;

class Pila {
	private float/*long*/ arreglo[];
	private int top;
	private int n;
	
	public Pila(int n) {
		this.n = n;
		arreglo = new float/*long*/[n + 1];
		this.top = 0;
	}
	public void push(/*long*/float e) {
		if (isFull()) {
			System.out.println("Pila llenaa");
		}else {
			this.top = this.top + 1;
			arreglo[this.top] = e;
		}
	}
	public float /*long*/ pop() {
		float dato = 0;
		dato = arreglo[this.top];
		this.top = this.top - 1;
		return dato;
	}
	public float /*long*/ peek() {
		return arreglo[this.top];
	}
	public boolean isEmpty() {
		return this.top == 0;
	}
	public boolean isFull() {
		return this.top == n;
	}
	
	public class principal {
		public static void main(String[] args) {
			System.out.println("aaaaaaaaaaaa");
			Pila z = new Pila(9);
			z.push(9);
			z.push(4);
			z.push(2);
			
			//z.mostrar(z);
		}
	}
	public static void mostrar(Pila pila) {
		Pila aux = new Pila(20);
		while(! pila.isEmpty()) {
			float dato = pila.pop();
			System.out.println(dato);
			aux.push(dato);
		}
		while(! pila.isEmpty()) {
			float dato = aux.pop();
			pila.push(dato);
		}
	}

	
}
