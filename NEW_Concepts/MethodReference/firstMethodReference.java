interface Parser {
        String parse(String str);
    
}
class StringParser{
    public static String convert(String s){
        if(s.length() <= 3)
           s = s.toUpperCase();
        else
           s = s.toLowerCase();

        return s;
    }
}
class MyPrinter{
    public void print(String str,Parser p){
            str = p.parse(str);

             System.out.println(str);    
    }
}

class firstMethodReference{
        public static void main(String[] args) {
            String str = "Vig";
            MyPrinter ob = new MyPrinter();
            // ob.print(str,(String s) ->{
            //               return  StringParser.convert(s);

            // }); 

            // ob.print(str, (s -> StringParser.convert(s)));
            ob.print(str, (StringParser::convert));   
        }
}