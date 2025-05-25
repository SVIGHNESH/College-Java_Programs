import java.util.*;
import java.util.function.*;

public class DiamondSyntaxExample {
    
    public static void main(String[] args) {
        
        // 1. Basic diamond syntax with List (Java 7+)
        List<String> list1 = new ArrayList<>(); // Diamond operator infers String type
        
        // 2. Diamond syntax with anonymous inner class (Java 9+)
        List<String> list2 = new ArrayList<>() {
            {
                add("Item 1");
                add("Item 2");
            }
            
            @Override
            public boolean add(String item) {
                System.out.println("Adding: " + item);
                return super.add(item);
            }
        };
        
        // 3. Diamond syntax with Comparator anonymous class
        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };
        
        // 4. Diamond syntax with custom generic interface
        GenericProcessor<String> processor = new GenericProcessor<>() {
            @Override
            public String process(String input) {
                return input.toUpperCase();
            }
        };
        
        // 5. Complex example with nested generics
        Map<String, List<Integer>> complexMap = new HashMap<>() {
            {
                put("numbers", new ArrayList<>() {{
                    add(1);
                    add(2);
                    add(3);
                }});
                put("more_numbers", Arrays.asList(4, 5, 6));
            }
        };
        
        // 6. Diamond syntax with functional interface (though lambda is preferred)
        Function<String, Integer> lengthFunction = new Function<>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        
        // Demonstrate usage
        System.out.println("List2 contents: " + list2);
        
        List<String> names = Arrays.asList("John", "alice", "Bob");
        names.sort(comparator);
        System.out.println("Sorted names: " + names);
        
        System.out.println("Processed: " + processor.process("hello world"));
        System.out.println("Complex map: " + complexMap);
        System.out.println("Length of 'Hello': " + lengthFunction.apply("Hello"));
        
        // 7. More advanced example with bounded wildcards
        Container<? extends Number> numberContainer = new Container<>() {
            private Integer value = 42;
            
            @Override
            public Integer getValue() {
                return value;
            }
            
            @Override
            public void setValue(Number value) {
                this.value = value.intValue();
            }
        };
        
        System.out.println("Container value: " + numberContainer.getValue());
    }
}

// Custom generic interface
interface GenericProcessor<T> {
    T process(T input);
}

// Custom generic class
abstract class Container<T> {
    public abstract T getValue();
    public abstract void setValue(T value);
}

// Example showing diamond syntax limitations and considerations
class DiamondLimitations {
    
    public void demonstrateLimitations() {
        
        // This works - diamond with anonymous class (Java 9+)
        List<String> goodExample = new ArrayList<>() {
            @Override
            public boolean isEmpty() {
                System.out.println("Checking if empty...");
                return super.isEmpty();
            }
        };
        
        // Before Java 9, you had to specify the full type
        List<String> oldWay = new ArrayList<String>() {
            @Override
            public boolean isEmpty() {
                System.out.println("Checking if empty...");
                return super.isEmpty();
            }
        };
        
        // Diamond syntax with method chaining
        Map<String, Integer> chainedMap = new HashMap<String, Integer>() {
            {
                put("one", 1);
                put("two", 2);
            }
        }.entrySet()
         .stream()
         .collect(HashMap::new, 
                  (map, entry) -> map.put(entry.getKey().toUpperCase(), entry.getValue()),
                  HashMap::putAll);
        
        System.out.println("Chained map: " + chainedMap);
    }
}

// Advanced example with multiple type parameters
class AdvancedDiamondExample {
    
    public static void advancedUsage() {
        
        // Diamond syntax with multiple type parameters
        BiFunction<String, Integer, String> formatter = new BiFunction<>() {
            @Override
            public String apply(String format, Integer number) {
                return String.format(format, number);
            }
        };
        
        // Complex nested generics with diamond syntax
        Map<String, Map<Integer, List<Double>>> nestedStructure = new HashMap<>() {
            {
                put("category1", new HashMap<>() {{
                    put(1, new ArrayList<>() {{
                        add(1.1);
                        add(2.2);
                        add(3.3);
                    }});
                    put(2, Arrays.asList(4.4, 5.5, 6.6));
                }});
            }
        };
        
        System.out.println("Formatted: " + formatter.apply("Number: %d", 42));
        System.out.println("Nested structure: " + nestedStructure);
    }
}