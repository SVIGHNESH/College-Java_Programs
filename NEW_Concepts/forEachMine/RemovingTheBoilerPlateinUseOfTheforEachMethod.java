import java.util.Arrays;
import java.util.List;

public class RemovingTheBoilerPlateinUseOfTheforEachMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(34,22,4,3,4,2);
        nums.forEach(n -> System.out.println(n));
    }
}
