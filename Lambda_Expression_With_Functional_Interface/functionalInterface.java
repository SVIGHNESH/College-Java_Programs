package Lambda_Expression_With_Functional_Interface;
// package FunctionalInterface;
// @FunctionalInterface
interface A {
    public void show();
    // public void see();
}
public class functionalInterface {
    public static void main(String[] args) {
        A ob = new A(){
                @Override
                public void show(){
                    System.out.println("In the Show when implementing from the anonymously directly directly without implmenting the interface in the another class");
                }
        };

        ob.show();
    }
} 
