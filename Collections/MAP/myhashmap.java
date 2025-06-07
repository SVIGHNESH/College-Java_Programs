import java.util.HashMap;
import java.util.Map;
public class myhashmap {
    public static void main(String[] args) {
        Map<String,Integer> Students = new HashMap<>();
        Students.put("V",43);
        Students.put("D",33);
        Students.put("R",23);

        System.out.println(Students);
        for(String name : Students.keySet()){
            System.out.println(name + " : " + Students.get(name));
        }

    }
}
