import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {        
        ArrayList<String> names = new ArrayList<>(5);
        names.add("Vighnesh");
        names.add("Ritik");
        names.add("Suresh");
        names.add("Devang");
        names.add("Ganesh");
       
        names.forEach(System.out::println);
        //here we are passing the method as a pararameter 
    }
}
