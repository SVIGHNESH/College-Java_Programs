import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Iterator;



public class MytreeSet {
        public static void main(String[] args) {
            Collection<Integer> nms = new TreeSet<>();

            nms.add(34);
            nms.add(21);
            nms.add(64);
            nms.add(43);
            // nms.add(34);
            nms.add(4);

            Iterator<Integer> values =nms.iterator();
            while(values.hasNext())
                System.out.println(values.next());
            
        }  
}
