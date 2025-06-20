
interface just{
    public void show(int i );
    // public void see();
}
class Hello implements just{
        
        public void show(int i){
            System.out.println("in the show of the Hello Class");
        }

}
public class lambdaExpression {
    public static void main(String[] args) {
        Hello ob = new Hello();
        ob.show(34);

        // just ob = (i ) -> System.out.println("Using the lambda expression in the funcitonal interface." + i );
        just ob2 = (i)->System.out.println("ajdf;g");
    
        

        // ob.show(5);
    }
} 
