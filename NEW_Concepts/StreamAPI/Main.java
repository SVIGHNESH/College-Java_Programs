import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


class Main {
  public static void main(String[] args) throws IllegalStateException {
    List<Integer> names = Arrays.asList(143, 200, 30, 44, 5);
  Stream<Integer> mappedNames = names.stream().map(n-> n*2);
  mappedNames.forEach(n -> System.out.println(n));
    



    // Stream<Integer> data = names.stream();
    // Stream<Integer> filteredData = data.filter(n -> n%2 == 0);
    // filteredData.forEach(n -> System.out.println(n));
    
    //  data.forEach(n -> System.out.println(n));
    // long count = data.count();

    // System.out.println(count);
    // System.out.println("this is to show tha.t the stream will only used once
    // after it is consumed once the strean can not be used");
    // Stream<Integer> sortedData = data.sorted();
    // data.forEach(n -> System.out.println(n));
    // sortedData.forEach(s -> System.out.println(s));

    // Stream<Integer> mappedData = data.map(n -> n * 2);
    // mappedData.forEach(n -> System.out.println(n));

  }
}
