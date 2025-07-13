import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapImplementation {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> CH = new ConcurrentHashMap();

        CH.putIfAbsent("Vighnesh", 33);
        CH.putIfAbsent("Suresh", 30);
        CH.putIfAbsent("Ritik", 22);
        CH.putIfAbsent("Devang", 11);
        CH.forEach((k,v) -> System.out.println("The Name is " + k + " and the Roll No. is " + v));


    }
}
