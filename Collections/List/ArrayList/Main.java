import java.util.HashSet;
import java.util.Set;

class Main{
    public static void main(String[] args) {


        Set<Integer> nums = new HashSet<>();
    
        nums.add(5);
        nums.add(3);
        nums.add(3);
        nums.add(2);
        nums.add(7);

        // System.out.println("The value at the index 2 is "+nums.get(2));
        // System.out.println("Index value of the 2 is "+nums.indexOf(2));


        for (int n : nums){
            System.out.println(n);
        }

    }
}