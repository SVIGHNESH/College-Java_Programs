import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>((s1,s2) -> 0);
        s.add("A");
        s.add("B");
        s.add("C");
        System.out.println(s.size());
    }
}
