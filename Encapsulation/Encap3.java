// public class Encap3 {
//     public static void main(String[] args) {
//         Learner l1= new Learner();
//         l1.setId(3);
//         l1.getId();
//     }
// }
class Learner
{
    private int id;
    private String name;
    private String city;
    //setter
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;

    }
    //getter
    int getId()
    {
        return id;
    }
      
    String getName()
    {
        return name;
    }
}
class Encap3 {
    public static void main(String[] args) {
        Learner l1= new Learner();
        l1.setId(3);
        System.out.print(l1.getId());
    }
}