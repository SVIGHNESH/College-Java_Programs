package ENUM;
enum Sts{
    Pending,Running,Success,Failed;

}
public class EnumIf {
    public static void main(String[] args) {
        Sts s = Sts.Pending;
        if(s == Sts.Running){
            System.out.println("IT is Running");    
        }
        else if(s == Sts.Pending){
            System.out.println("Please Wait");

        }
        else if(s == Sts.Failed){
            System.out.println("It is Not able to run");
        }
        else{
            System.out.println("all right it is working");
        }
    }
    
}
