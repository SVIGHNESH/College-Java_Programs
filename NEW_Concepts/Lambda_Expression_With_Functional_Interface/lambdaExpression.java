
// package FunctionalInterface;
// @FunctionalInterface
interface just{
    public void show(int i );
    // public void see();
}
public class lambdaExpression {
    public static void main(String[] args) {
        just ob = (i ) -> System.out.println("Using the lambda expression in the funcitonal interface." + i );

        

        ob.show(5);
    }
} 
