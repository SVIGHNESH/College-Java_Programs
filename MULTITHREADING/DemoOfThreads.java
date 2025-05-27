class Counter{
    int count;
    public void increament(){
        count++;
    }
}
// class A extends Thread{
//     Counter c = new Counter();
//     public void run() {
         
//         for (int i = 0; i < 1000; i++) {
//            c.increament();

//             // System.out.println("Hi ");
//             // try{
//             // Thread.sleep(10);

//             // }
//             // catch(InterruptedException e ){
//             //     System.out.println("Thrown the Interruption");
//             // }


//         }
//     }
// }
// class  B extends Thread {
//     Counter c = new Counter();
//    public void run() {
        
//         for (int i = 0; i < 1000; i++) {
//             c.increament();
//            // System.out.println("Hello");
//             // System.out.println("");
//             // try{
//             // Thread.sleep(15);

//             // }
//             // catch(InterruptedException e ){
//             //     System.out.println("Thrown the Interruption");
//             // }
            


//         }
//     }
// }

public class DemoOfThreads {
    public static void main(String[] args) {

        Counter c = new Counter();


        Runnable obj1 = () -> 
            {
                for(int i=0;i<1000;i++){
                        c.increament();
                }
            };
        Runnable obj2 = () -> 
            {
                for(int i=0;i<1000;i++){
                        c.increament();
                }
                
            };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        

        t1.start();
        t2.start();
        System.out.println(c.count);











        // Counter c = new Counter();
        // A obj1 = new A();
        // B obj2 = new B();
        // System.out.println(c.count);
        // obj1.start();
        // obj2.start();

        // System.out.println(c.count);
        
        
        
    }
}
