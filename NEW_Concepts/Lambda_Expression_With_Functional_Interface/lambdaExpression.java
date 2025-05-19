
// package FunctionalInterface;
// @FunctionalInterface
interface just{
    public void show();
    // public void see();
}
public class lambdaExpression {
    public static void main(String[] args) {
        just ob = () -> {
                    System.out.println("Using the lambda expression in the funcitonal interface.");
        };

        ob.show();
    }
} 
