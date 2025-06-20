import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamMain{  
  public static void main(String[] args) throws IllegalStateException {
    List<Integer> names = Arrays.asList(143, 200 , 30 , 44,  5);
    Stream<Integer> data = names.stream();

    // long count = data.count();
    // System.out.println(count);
    // Stream<Integer> sortStream = data.sorted();
    // sortStream.forEach(System.out::println);
    Stream<Integer> filteredData = data.filter(n -> n%2 != 0);
    filteredData.forEach(System.out::println);
    

    // ystem.out.println("this is to
    // fter it is consumed once the strean can not be used");
    // // 
    // tream<Integer> sortedData = data.sorted();
    // ata.forEach(n -> System.out.println(n));
    // ortedData.forEach(s -> System.out.println(s));

    // edData.forEach(n -> System.out.println(n));
    
  }
}
  
