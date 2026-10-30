package Encapsulation;

public class Encap1 {
    public static void main(String[] args) {
     //  sdc
    }

}

class Book/*
           * No matter whether this class is placed below the main class or above the main
           * class
           */
{
    int pageno;
    String name;

    void disp() {
        System.out.println("story of my life is present at : " + pageno);
    }
}
