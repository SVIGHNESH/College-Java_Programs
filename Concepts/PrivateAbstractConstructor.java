/*
 * Abstract Class Have Constructor
 * We can Declare the Constructor as a Private
 */

/*abstract class Vehicle{
     private  Vehicle(){
        System.out.println("Constructor of the Vehicle Class");
      }
     static Vehicle getInstance(){
       return new Vehicle;
     }
  } 
class car extends Vehicle{
  car(){
    Vehicle.getInstance();
    System.out.println("Constructor of the car is Called");
  }
  public static void main(String []args) {
      car c = new car();
      
  }
}
*/


abstract class Vehicle{
  Vehicle(){
      this(342);
      System.out.println("abstract Class Default Constructor");
      
  }
  private Vehicle(int speed){

      System.out.println("abstract Class parameterised Private Constructor" + speed );




  }
}
class Car extends Vehicle{
  Car(){
    }
}

class PrivateAbstractConstructor{
  public static void main(String[] args) {
    Car ob = new Car();
    
  }
} 
