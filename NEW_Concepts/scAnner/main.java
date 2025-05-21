

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{
        System.out.print("enter a number:");
           int num =  System.in.read();
           System.out.println("The ASCII value for the given number is " + num);
           System.out.println("The value for the given number is " + (num - 48));
    }
}
