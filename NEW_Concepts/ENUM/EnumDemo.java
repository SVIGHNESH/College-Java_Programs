package ENUM;
enum Status {
  Running, Failed, Pending, Success;
}

class EnumDemo {
  public static void main(String[] args) {
    // int i = 34;

    Status e = Status.Success;
    Status []ee = Status.values();
    
      // System.out.println(ee[2]);
    
    for(Status s : ee){
      System.out.println(s + " : " + s.ordinal());
    }

    // System.out.println(e);

  }
  }
