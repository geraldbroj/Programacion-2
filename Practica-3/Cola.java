package cola;

class Cola {
	private long[] arreglo;
	private int inicio;
	private int fin;
	private int n;
	
	public Cola(int n) {
		this.arreglo = new long[n];
		this.n = n;
		this.inicio = 0;
		this.fin= 0;
	}
	public void insert(long e) {
		if (isFull()) {
			System.out.println("Cola llena");
		} else {
			this.fin = this.fin + 1;
			this.arreglo[this.fin] = e;
		}
	}
	public long remove() {
		if (isEmpty()){
			System.out.println("cola vacia");
			return -1;
		} else {
			this.inicio = this.inicio + 1;
			long dato = this.arreglo[this.inicio];
			if(this.inicio == this.fin) {
				this.inicio = 0;
				this.fin = 0;
			}
			return dato;
		}
	}
	public long peek() {
		return this.arreglo[this.inicio + 1];
		
	}
	public boolean isEmpty() {
		return (this.inicio == 0 && this.fin == 0);
	}
	public boolean isFull() {
		return (this.fin == this.n);
	}
	public int size() {
		return (this.fin - this.inicio);
	}
	
	public static void main(String[] args) {
		Cola z = new Cola(9);
		z.insert(9);
		z.insert(4);
		z.insert(2);
		z.insert(1);
		z.insert(21);
		z.insert(0);
		z.insert(0);
		z.insert(0);
		
			
		System.out.println(z.size());
		System.out.println("------------------------------");
		
		while (! z.isEmpty()) {
			System.out.println(z.remove());
			
		}
		
		//z.mostrar(z);
		}
	}

