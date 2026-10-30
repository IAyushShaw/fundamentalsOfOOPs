package Inheritance;
class Demo1{
     String name ="Ayush";//to ensure encapsulation agar yeh private rhta toh hm ishe niche access nhi kr pate
    void disp(){
        System.out.println("Name "+name+ " Bro");
    }

}

class Alien extends Demo1{
    void disp2(){
        name="alien";
    }
}
public class LaunchInherit2 {
    public static void main(String[] args) {
        Alien a=new Alien();
        a.disp();
    }
}
