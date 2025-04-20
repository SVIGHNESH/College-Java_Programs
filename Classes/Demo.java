class Calculator{
            int add(int n1,int n2)    {
                return n1+n2;
            }
            int add(int n1){
             return  ++n1;
            }
            String add(){
                    return "Enter The NUMBER to Add What I am going to do when you don't even pass the numbers.";
            }
            int add(int n1,int n2,int n3){
                return n1+n2+n3;

            }
}
class Demo{
    public static void main(String []a)
        {
            Calculator obj = new Calculator();
        System.out.println(obj.add(23,23));
        System.out.println(obj.add(35,121));
        System.out.println(obj.add(23));
        System.out.println(obj.add());
        System.out.println(obj.add(24,34,12));
    }
    
    
}