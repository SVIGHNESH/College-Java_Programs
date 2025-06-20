/*
 * Abstract Class Have Constructor
 * We can Declare the Constructor as a Private
 */

abstract class Vehicle {
  private Vehicle() {
    System.out.println("Constructor of the Vehicle Class");
  }

  static Vehicle getInstance() {
    return new Vehicle();
  }
}

class PrivateAbstractConstructor extends Vehicle {
  PrivateAbstractConstructor() {
    Vehicle.getInstance();
    System.out.println("Constructor of the car is Called");
  }

  public static void main(String[] args) {
    PrivateAbstractConstructor c = new PrivateAbstractConstructor();

  }
}

/*
 * abstract class Vehicle{
 * // Vehicle()
 * // this(342);
 * // System.out.println("abstract Class Default Constructor");
 * 
 * // }
 * private Vehicle(int speed){
 * 
 * System.out.println("abstract Class parameterised Private Constructor" + speed
 * );
 * 
 * 
 * 
 * 
 * }
 * }
 * class Car extends Vehicle{
 * Car(){
 * // super(321);
 * }
 * }
 * 
 * class PrivateAbstractConstructor{
 * public static void main(String[] args) {
 * Car ob = new Car();
 * boolean yes = ob instanceof Car;
 * System.out.println(yes);
 * boolean isVehicle = ob instanceof Vehicle;
 * System.out.println(isVehicle);
 * 
 * 
 * }
 * }
 * 
 */
