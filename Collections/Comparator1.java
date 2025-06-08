import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student{
    int age;
    String name;

    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}

public class Comparator1 {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                if(i%10>j%10)
                    return 1;
                else
                    return -1;

            }
        };
        List<Student> Studs = new ArrayList<>();
        Studs.add(new Student(20, "Vighnesh"));
        Studs.add(new Student(20, "Suresh"));
        Studs.add(new Student(2, "Ritik"));
        Studs.add(new Student(16, "Devang"));
        //Collections.sort(nums,com);
        for(Student st: Studs){
            System.out.println(st);
        }
        // System.out.println(nums);
    
    }
}
