package Polymorphism;
class Aeroplane{
    public void takingOff()
    {
        System.out.println("Aeroplane must takeoff to fly");
    }
    public void fly()
    {
        System.out.println("Aeroplane must fly");
    }
    public void landing()
    {
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane extends Aeroplane{
                public void takingOff(){
                System.out.println("CargoPlane is taking off");
                }
                public void fly(){
                    System.out.println("CargoPlane is flying");
                }
    }
class FighterPlane extends Aeroplane{
        public void landing(){
            System.out.println("FighterPlane is landing");
        }
        public void fly(){
            System.out.println("FighterPlane is flying");
         }
}



public class LaunchPoly1 {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane();
       FighterPlane f=new FighterPlane();
       Aeroplane a;
       a=cp;
       a.takingOff();
       a.fly();
       a.landing();
       System.out.println("#######$$$$$$$*******");
       a=f;
       a.takingOff();
       a.landing();
       a.fly();
    }

}
