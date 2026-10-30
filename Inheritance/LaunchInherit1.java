package Inheritance;

public class LaunchInherit1 {
    public static void main(String[] args) {
        Person p=new Person();
        p.disp();
    }
    
}
    class Student
    {
        int age=4;
        double weight;
        void disp()
        {
            //age=10;
            System.out.println("Student is " +age+ "yeras old");
        }
    }
    class Person extends Student
    {
       int age= 20;//why should i write int here
        
    }