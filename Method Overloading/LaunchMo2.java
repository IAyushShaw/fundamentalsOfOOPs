class Mul

{
    double mul(int x,int y,double z)
    {
    System.out.println("2 int 1 Double");
    return x*y*z;
    }

    // double mul(double x,int y,int z)/*ambiguous with double mul(double x,int y,int z) */
    // {
    //   System.out.println("1 Double 2 int");
    //   return x*y*z;
    // }

    double mul(int x,double y,double z)/* ambiguous with  double mul(double x,double y,int z)*/
    {
    System.out.println("1 int 2 Double");
    return x*y*z;
    }

    // double mul(double x,double y,int z)
    // {
    //   System.out.println("2 Double 1 int");
    //   return x*y*z;
    // }
}
public class LaunchMo2 
{
    public static void main(String[] args) 
    {
    Mul m =new Mul();
    //System.out.println(m.mul(4,50)); --gives compile time error
      System.out.println(m.mul(4,50,1));/*--> priority int,int,int>int,int,double>int,double,double>double,int,int>double,double,int>double,double,double*/
      /* Ambiguous method shoud be absent(method having same types of parameters but placed differently)  */
    }

}