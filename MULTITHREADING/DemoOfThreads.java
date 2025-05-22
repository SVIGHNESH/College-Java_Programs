class A extends Thread{

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hi ");


        }
    }
}
class  B extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello");
            System.out.println("");
            


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
