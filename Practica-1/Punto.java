package Punto;

class Punto {
	public float x;
	public float y;
	
	public Punto(float X, float Y) {
		x = X;
		y  = Y;
	}
	
	public String coord_cartesianas(){
		return "Cordenadas Cartesianas ("+ x +" , "+ y +")";
	}
	public String coord_polares() {
		double p1 = Math.sqrt(x * x + y * y);
		double p2 = Math.toDegrees(Math.atan2(y, x));
		return "Coordenadas polares ("+p1+" , "+p2+")";
	}
	public String toString(){
		return "punto ("+x+" , "+y+")";
		
	}
	public static void main(String[]args) {
		Punto p = new Punto(3, 4);
		System.out.println(p.coord_cartesianas());
		System.out.println(p.coord_polares());
		System.out.println(p.toString());
	}
}
