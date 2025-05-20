interface C{
    public int add(int i,int j);
}

public class LambdaWithReturn {
    public static void main(String[] args) {
        C obj = (int i,int j ) -> i+j;
        // C obj = (int i,int j ) -> {return i+j;};

        int a = obj.add(34,34);
        System.out.println(a);
        
          
    }
}
