public class one{
    public static void main(String[] args) {
        int num[] = {3,7,2};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

        num[0] = 22;
        num[1] = 33;
        num[2] = 44;
        num[3] = 44;
        num[4] = 44;

        System.out.println(num[0]);
        System.out.println(num[5]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        int arr[] = new int[4];
        for(int i = 0;i<5;i++){
            System.out.print(arr[i]+ "\t" );
        }System.out.println();

        arr[0] = 34;
        arr[1] = 47;
        arr[2] = 4;
        arr[3] = 34;
        for(int i = 0;i<5;i++){
            System.out.print(arr[i]+ "\t" );
        }System.out.println();


    }
    
}
