public class Car {
  //fields
  private String make;
  private String model;
  private boolean isConvertible;
  private int numPassengers;
  //constructor - always public
  public Car(String mk, String mdl, boolean convert, int numPass) {
    this.make = mk;
    this.model = mdl;
    this.isConvertible = convert;
    this.numPassengers = numPass;
  }
  //methods - always public
  public void addNumPassengers(int numPassengersToAdd) {
    this.numPassengers += numPassengersToAdd;
  }
  public void printMakeModel() {
    System.out.println(this.make + " " + this.model);
  }
  public void printBooInt() { 
    System.out.println(this.numPassengers);
    System.out.println(this.isConvertible);
  }
} 
// Car myCar = new Car("honda", "accord", false, 4);
// myCar.printMakeModel();

