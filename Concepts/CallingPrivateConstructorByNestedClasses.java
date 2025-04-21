class OuterClass {
    private OuterClass() {
        // Private constructor
    }

    class InnerClass {
        public OuterClass createInstance() {
            return new OuterClass(); // Accessing private constructor from inner class
        }
    }
}

public class CallingPrivateConstructorByNestedClasses {
    public static void main(String[] args) {
        OuterClass.InnerClass inner = OuterClass().new InnerClass();
        OuterClass obj = inner.createInstance();
    }
}

