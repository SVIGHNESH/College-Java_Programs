class Second{
    public static void main(String []arr){
        int x = 60;
        int y = 700;
        int z = 80;

        // if(x>y){

        //     if(x > z){
        //     System.out.println("X is the Greatest Element.");
        //     }
        //      else{

        //     System.out.println("Z is the Greatest Element.");
        //      }   
        // }
        // else{
        //     if(y>z)
        //     {
        //         System.out.println("Y is the Greatest Element.");

        //     }
        //     else{
        //         System.out.println("Z is the Greatest Element");
        //     }

        if(x>y && x>z)
            System.out.println("X is the Greatest one here.");
        else if (y>x && y >z)
            System.out.println("Y is The GReatest one Here.");
        else
            System.out.println("Z is the Greatest one here.");
            
        }
        
    }
