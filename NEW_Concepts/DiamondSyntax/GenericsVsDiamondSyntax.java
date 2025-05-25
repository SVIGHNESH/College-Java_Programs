import java.util.*;
import java.util.function.*;

public class GenericsVsDiamondSyntax {
    
    public static void main(String[] args) {
        demonstrateGenerics();
        demonstrateDiamondSyntax();
        demonstrateEvolution();
    }
    
    // 1. GENERICS - The core feature (Java 5+)
    public static void demonstrateGenerics() {
        System.out.println("=== GENERICS (Java 5+) ===");
        
        // Before generics (Java 1.4 and earlier) - NOT type safe
        List rawList = new ArrayList();
        rawList.add("String");
        rawList.add(42); // Different types in same list!
        String str = (String) rawList.get(0); // Explicit casting required
        
        // With generics - Type safe
        List<String> stringList = new ArrayList<String>();
        stringList.add("Only strings allowed");
        // stringList.add(42); // Compile error!
        String safeStr = stringList.get(0); // No casting needed
        
        // Generic methods
        String[] array = {"a", "b", "c"};
        List<String> converted = Arrays.asList(array); // Generic method
        
        // Generic classes
        GenericBox<Integer> intBox = new GenericBox<Integer>();
        intBox.setValue(42);
        Integer value = intBox.getValue(); // Type safe
        
        System.out.println("Generic box value: " + value);
    }
    
    // 2. DIAMOND SYNTAX - Syntactic sugar for generics (Java 7+)
    public static void demonstrateDiamondSyntax() {
        System.out.println("\n=== DIAMOND SYNTAX (Java 7+) ===");
        
        // Without diamond syntax (verbose)
        List<String> verboseList = new ArrayList<String>();
        Map<String, List<Integer>> verboseMap = new HashMap<String, List<Integer>>();
        
        // With diamond syntax (concise) - Type inference
        List<String> conciseList = new ArrayList<>(); // <> is the diamond
        Map<String, List<Integer>> conciseMap = new HashMap<>();
        
        // Complex nested generics become much cleaner
        Map<String, Map<Integer, List<Double>>> complex = new HashMap<>();
        
        // Diamond syntax with anonymous classes (Java 9+)
        List<String> customList = new ArrayList<>() {
            @Override
            public boolean add(String item) {
                System.out.println("Adding: " + item);
                return super.add(item);
            }
        };
        
        customList.add("Test item");
        System.out.println("Custom list: " + customList);
    }
    
    // 3. Evolution of Java generics syntax
    public static void demonstrateEvolution() {
        System.out.println("\n=== EVOLUTION OF SYNTAX ===");
        
        // Java 1.4 and earlier - No type safety
        List java14Style = new ArrayList();
        
        // Java 5 - Introduction of generics
        List<String> java5Style = new ArrayList<String>();
        
        // Java 7 - Diamond syntax introduction
        List<String> java7Style = new ArrayList<>();
        
        // Java 8 - Streams and functional programming
        List<String> java8Style = new ArrayList<>();
        java8Style.add("hello");
        java8Style.stream()
                  .map(String::toUpperCase)
                  .forEach(System.out::println);
        
        // Java 9 - Diamond syntax with anonymous classes
        List<String> java9Style = new ArrayList<>() {
            {
                add("Java 9 feature");
            }
        };
        
        System.out.println("Java 9 style: " + java9Style);
    }
}

// Generic class example
class GenericBox<T> {
    private T value;
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
}

// Examples showing where diamond syntax can and cannot be used
class DiamondSyntaxLimitations {
    
    public void showLimitations() {
        
        // ✅ Diamond syntax works here
        List<String> list = new ArrayList<>();
        
        // ✅ Diamond syntax works with var (Java 10+)
        var autoList = new ArrayList<String>(); // Type inferred as ArrayList<String>
        
        // ❌ Diamond syntax cannot be used here - ambiguous context
        // List<String> ambiguous = new ArrayList<>(); // Won't compile in certain contexts
        
        // ✅ Method parameter - diamond syntax works
        processList(new ArrayList<>());
        
        // ✅ Return statement - diamond syntax works
        // return new ArrayList<>(); (if method returns List<String>)
    }
    
    private void processList(List<String> list) {
        // Process the list
    }
    
    // Generic method showing the difference
    public <T> List<T> createList() {
        // Both are valid, but diamond syntax is preferred
        return new ArrayList<>(); // Diamond syntax
        // return new ArrayList<T>(); // Explicit type
    }
}

// Advanced generics concepts (separate from diamond syntax)
class AdvancedGenerics {
    
    // Bounded type parameters
    public <T extends Number> void processNumbers(List<T> numbers) {
        for (T num : numbers) {
            System.out.println("Number: " + num.doubleValue());
        }
    }
    
    // Wildcards
    public void processUnknownList(List<?> list) {
        System.out.println("List size: " + list.size());
    }
    
    // Upper bounded wildcard
    public void processNumberList(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
    
    // Lower bounded wildcard
    public void addNumbers(List<? super Integer> numbers) {
        numbers.add(42);
        numbers.add(100);
    }
}