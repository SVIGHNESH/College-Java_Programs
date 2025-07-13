import java.util.HashMap;
public class CountTheWord {
    public static void main(String []args){
        String text = "This is the one of the Major Drawback of the java to be the verbose";
        
        
        HashMap<String,Integer> wordCount = new HashMap<>();

        String[] str = text.toLowerCase().split(" ");

        for(String s : str){
            if(wordCount.containsKey(s)){
                wordCount.put(s,wordCount.get(s) + 1);
            }

            else{
                wordCount.put(s,1);
            }
        }

        System.out.println("The Count of the Words in the Given String is the :");
        for(String s : wordCount.keySet()){
            System.out.println(s + " : " + wordCount.get(s));

        }

        
    }
}
