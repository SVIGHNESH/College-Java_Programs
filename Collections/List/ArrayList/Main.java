// import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Main{
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<Integer>();
    
        nums.add(53);
        nums.add(31);
        nums.add(22);
        nums.add(730);

        // System.out.println("The value at the index 2 is "+nums.get(2));
        // System.out.println("Index value of the 2 is "+nums.indexOf(2));

        Collections.sort(nums);
        for (int no : nums){
            System.out.println(no);
        }

    }
}