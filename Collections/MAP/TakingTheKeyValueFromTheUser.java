import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class TakingTheKeyValueFromTheUser {
    public static void main(String[] args) throws InputMismatchException{
        Map<String,Integer> marks = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        try
        {
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        // sc.nextLine(); // consume the leftover newline
        
        // Input loop
        for(int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter marks for " + name + ": ");

            int mark = sc.nextInt();
            sc.nextLine(); // consume the leftover newline
            
            marks.put(name, mark);
        }
        
        System.out.println("\nAll Students and Marks: " + marks);
        
        // Search for a specific student
        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();
        if(marks.containsKey(searchName)) {
            System.out.println(searchName + "'s marks is " + marks.get(searchName));
        } else {
            System.out.println("Student not found!");
        }
    }
        
        sc.close();
    }
}
