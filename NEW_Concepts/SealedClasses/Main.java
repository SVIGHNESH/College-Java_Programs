sealed class A permits B,C{
       void ShowofA(){
        System.out.println("In the show of the A");
       } 
}

sealed class B extends A permits D{

       void ShowofB(){
        System.out.println("In the show of the B");
       } 
}
non-sealed class C extends A{

       void ShowofC(){
        System.out.println("In the show of the C");
       } 
}

final class D extends B{

       void ShowofD(){
        System.out.println("In the show of the D");
       } 
}


public class Main {
    public static void main(String[] args) {
        var n = new D();
        n.ShowofA();
        n.ShowofB();
        n.ShowofB();
    
    }
}
