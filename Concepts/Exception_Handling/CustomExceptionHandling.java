import java.util.Scanner;

class InsufficientBankBalance extends Exception{
    
}

public class CustomExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Balance: ");
        Integer balance = sc.nextInt();

        try{
            if(balance < 1000){
                throw new InsufficientBankBalance();
            }
            else{
                System.out.println("sufficient balance");
            }


        }
        catch(InsufficientBankBalance e){
            System.out.println("NOt Sufficient Balance");
        }

        finally{
            sc.close();
        }
    }
}
