import java.util.HashSet;
import java.util.*;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();
        
        numbers.add(32);
        numbers.add(3);
        numbers.add(342);
        numbers.add(2345);
        numbers.add(32432);

        for(int n : numbers){
            System.out.println(n);
        }

    }
}
