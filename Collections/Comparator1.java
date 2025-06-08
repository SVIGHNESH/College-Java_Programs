import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
<<<<<<< HEAD
import java.util.Comparator;

public class Comparator1 {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                if(i%10>j%10)
                    return 1;
                else
                    return -1;

            }
        };
=======

public class Comparator1 {
    public static void main(String[] args) {
>>>>>>> Something
        List<Integer> nums = new ArrayList<>();
        nums.add(13);
        nums.add(54);
        nums.add(32);
        nums.add(43);
        nums.add(80);
        Collections.sort(nums,);
        System.out.println(nums);
    
    }
}
