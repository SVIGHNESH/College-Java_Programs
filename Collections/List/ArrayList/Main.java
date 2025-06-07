// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Main{
    public static void main(String[] args) {


        Set<Integer> nums = new TreeSet<Integer>();
    
        nums.add(53);
        nums.add(31);
        nums.add(22);
        nums.add(730);

        // System.out.println("The value at the index 2 is "+nums.get(2));
        // System.out.println("Index value of the 2 is "+nums.indexOf(2));


        for (int no : nums){
            System.out.println(no);
        }

    }
}