 class A1 {
    public  void m1(){
      System.out.println("M1 of the class A");
    } 
    public  void m2(){
      System.out.println("M2 of the class A");
    } 



 }

class B1 extends A1{
    public void m1(){
        super.m1();
    System.out.println("M1 of the class B");
  }

public void m3(){
    System.out.println("M3 of the class B");
  }

}

class C1{
  public static void name() {
    A1 ob = new B1();
    B1 ob1 = new B1();
    
    ob.m1();
    ob.m2();
   // ob.m3();

    ob1.m1();
    ob1.m2();
    ob1.m3();
  }
}
