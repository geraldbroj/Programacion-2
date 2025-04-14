package papa;

class A{
    public int x;
    public int z;
    public A(int x, int z){
        this.x = x;
        this.z = z;
    }
    public void incrementaXZ(){
        this.x++;
        this.z++;
    }
    public void incrementaZ(){
        this.z++;
    }
}
class B{
    public int y;
    public int z;
    public B(int y, int z){
        this.y = y;
        this.z = z;
    }
    public void incrementaYZ(){
        this.y++;
        this.z++;
    }
    public void incrementaZ(){
        this.z++;
    }
}
class D{
    A a;
    B b;
    public D(int x, int y, int z){
        a = new A(x,z);
        b = new B(y,z);
    }
    public void incrementaXYZ(){
        a.x++;
        b.y++;
        a.z++;
    }
    /*
    public void Mostrar(){
        System.out.println("x = " + a.x + ", y = " + b.y + ", z = " + a.z);
    }
    */
}


public class ABC {
    
    public static void main(String[] args) {
        D cal = new D(1,2,3);
        System.out.println("x = " + cal.a.x + ", y = " + cal.b.y + ", z = " + cal.a.z);
        cal.incrementaXYZ();
        //
        cal.a.incrementaXZ();
        //
        cal.b.incrementaYZ();
        //
        cal.a.incrementaZ();
        System.out.println("x = " + cal.a.x + " y = "+ cal.b.y + " z = "+ cal.a.z);
    }
    
}