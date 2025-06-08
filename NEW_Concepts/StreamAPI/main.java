import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Main  
  blic static void main(String[] args) throws IllegalStateException {
    <Integer> names = Arrays.asList(143, 200 , 30 , 4 4,  5);
    am<Integer> data = names.stream();

    ong count = data.count();
    

    ystem.out.println("this is to
    fter it is consumed once the strean can not be used");
    // 
    tream<Integer> sortedData = data.sorted();
    ata.forEach(n -> System.out.println(n));
    ortedData.forEach(s -> System.out.println(s));

    edData.forEach(n -> System.out.println(n));
    

  
