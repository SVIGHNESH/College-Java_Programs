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

        System.out.println(nums.get(2));
        // for(Integer n : nums){
        //     System.out.println(n);
        // }
        // System.out.println(nums);

    }
}