import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(34,32,3,26,4,6,4);
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer i){
                    // System.out.println(i);
                    System.out.println(i*2);
            }
        };
        nums.forEach(con);
        
    }
}
