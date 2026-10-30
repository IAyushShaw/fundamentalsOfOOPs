package Inheritance;

class Alpha{
    int a,b;
    public Alpha(){
        a=10;
        b=20;
        System.out.println("0 param constructor of Alpha");
    
    }
    public Alpha(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("param constructor of Alpha");
    }
}
class Beta extends Alpha{
    int x,y;

public Beta(){
    x=1;
    y=2;
    System.out.println("Beta 0 param constructor");
}
public Beta(int x,int y){
    this.x=x;
    this.y=y;
    System.out.println("Beta param constructor");


}
public void disp(){
    System.out.println("a :"+a);
    System.out.println("b :"+b);
    System.out.println("x :"+x);
    System.out.println("y :"+y);
}
}

public class LaunchInherit3 {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.disp();
    }
}
