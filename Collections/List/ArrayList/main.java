import java.util.ArrayList;

import java.util.List;

class main{
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(3);
        nums.add(2);
        nums.add(7);

        System.out.println("The value at the index 2 is "+nums.get(2));
        System.out.println("Index value of the 2 is "+nums.indexOf(2));
        for (int n : nums){
            System.out.println(n);
        }

    }
}