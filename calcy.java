 class add{
        int x,y,result;
        int addition(){
            result = x + y ;
            return result;

  }

}

class subtract{
         int x,y,result;     
        int subtract(){
          result = x -y ;

            return result;
    }
}


class multiply{
         int x,y,result;     
        int multiply(){

          result = x * y ;

            return result;
  }
} 

class div{
         int x,y,result;     
        int div(){
          if(x == 0 ){
            System.out.println("Something Went Wrong!")
          }

          result = x / y ;

            return result;
  }
} 

class Calcy{

    public static void main(String[] args){
    
        add ob1 = new add();
        subtract ob2 = new subtract();
        multiply ob3 = new multiply();
        div ob4 = new div();
        
        int res1 = ob1.addition();
        int res2 = ob2.subtract();
        int res3 = ob3.multiply();
        int res4 = ob4.div();
        
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res2);
	System.out.println("this is the one ");
        
        
    }
    
}
