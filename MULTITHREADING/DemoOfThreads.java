class A extends Thread{

    synchronized public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hi ");
            // try{
            // Thread.sleep(10);

            // }
            // catch(InterruptedException e ){
            //     System.out.println("Thrown the Interruption");
            // }


        }
    }
}
class  B extends Thread {

   synchronized public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello");
            // System.out.println("");
            // try{
            // Thread.sleep(15);

            // }
            // catch(InterruptedException e ){
            //     System.out.println("Thrown the Interruption");
            // }
            


        }
    }
}

public class DemoOfThreads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
        
        
        
    }
}
