import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class anotherScanner {
   public static void main (String []args) throws IOException{
    int num = 0;
    
    try( BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){
            // InputStreamReader in = new InputStreamReader(System.in);

            // bf = new BufferedReader(in);

         
          num = Integer.parseInt(bf.readLine());

    
    }
   } 
}
