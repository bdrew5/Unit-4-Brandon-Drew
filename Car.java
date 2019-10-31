/*
Implement a class called Car with the following properties and behaviors.

A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a toString method that prints out a report on the current state of the car.

Create a client class with 3 instances of the car class. The client class should test all of the methods from the Car class and print out relevant information to prove the proper functionality of your Car class.

*/
public class Car{
  private String make;
  private String model;
  private double mpg; //miles per gallon
  private double amtFuel;
  private double tankSize;


  private final int TOYOTA = 0;
  private final int FORD = 1;
  private final int BMW = 2;


  public Car(String carMake, String carModel, double carMpg, double carTankSize){
  make = carMake;
  model = carModel;
  mpg = carMpg;
  amtFuel = tankSize;
  tankSize = carTankSize;
}
  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public double getMpg(){
    return mpg;
  }
  public double getTankSize(){
    return tankSize;
  }

  public String toString(){
    String result = "";
    result += "Make: " +make+ "\n";
    result += "Model: " +model+ "\n";
    result += "MPG: " +mpg+ "\n";
    return result += "Fuel: " +amtFuel+ "\n";
  }
}
