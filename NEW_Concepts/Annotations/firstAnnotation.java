

class A{
    void showTheFirstNameOfTheFunctionCaller(){
        System.out.println(" in the A show");
    }
}

class B extends A{
    @Override
    void showTheFirstNameOfTheFunctionCaller(){
        System.out.println("in the B Show");
    }
}

public class firstAnnotation{
    public static void main(String[] args) {
        B b = new B();
        b.showTheFirstNameOfTheFunctionCaller();
    }
}

