class Operator{
    public static void main(String[] args){
        /* Arithmetic Operator */

        int a = 23;
        int b = 3;

        System.out.println(a + b );
        System.out.println(a - b );
        System.out.println(a * b );
        System.out.println(a / b );
        System.out.println(a % b );
        System.out.println(2^1 );
    }
}
class CharDemo2 {
        public static void main(String args[]) {
            char ch1;
            ch1 = 'X';
            System.out.println("ch1 contains " + ch1);
            ch1++; // increment ch1
            System.out.println("ch1 is now " + ch1);
    }
}
class BoolTest{
    public static void main(String args[]) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        // a boolean value can control the if statement
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        System.out.println("10 > 9 is " + (10 > 9));
    }
}