// package FunctionalInterface;
// @FunctionalInterface
interface A {
    public void show();
    // public void see();
}
public class functionalInterface {
    public static void main(String[] args) {
        A ob = new A(){
                public void show(){
                    System.out.println("In the Show when implementing from the anonymously directly directly without implmenting the interface in the another class");
                }
        };

        ob.show();
    }
}
