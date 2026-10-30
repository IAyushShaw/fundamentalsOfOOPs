package Encapsulation;

class Book{
    private int pageno;
    void SetPageno(int pg){
        if(pg>=0) pageno=pg;
        else System.out.println("Page number can't be negative");
    }
    int getPageno(){
      return pageno;
    }
    void disp(){
        System.out.println("story of my life is present at : " + pageno);
    }
    
}
public class Eccap2{
    public static void main(String[] args) {
      Book bk = new Book();
        bk.SetPageno(-22);
        System.out.println(bk.getPageno());
        bk.disp();
    }
}

