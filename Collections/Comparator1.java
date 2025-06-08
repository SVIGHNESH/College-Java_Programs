import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int age;
    String name;
    

    

    public int compareTo(Student that) {
        if(this.age>that.age)
                    return 1;
                else
                    return -1;
    }


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

        Comparator<Student> com =(Student i,Student j)-> i.age>j.age?1:-1;
       
        
        List<Student> Studs = new ArrayList<>();
        Studs.add(new Student(20, "Vighnesh"));
        Studs.add(new Student(20, "Suresh"));
        Studs.add(new Student(2, "Ritik"));
        Studs.add(new Student(16, "Devang"));
        Collections.sort(Studs,com);
        Collections.sort(Studs);
        for(Student st: Studs){
            System.out.println(st);
        }
        // System.out.println(nums);
    
    }
}
