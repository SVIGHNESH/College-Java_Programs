class St {
  static void sayHello() {
    System.out.println("This is the SayHello Static method of the St Class");
  }
}

class StaticOverride extends St {

  // public static void main(String[] args) {
  // StaticOverride n = new StaticOverride();
  // n.sayHello();

  // }
  //
  public static void main() {
    St.sayHello();

  }
}
