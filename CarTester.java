public class CarTester{
  public static void main(String[] args){
    Car myCar = newCar("");

    System.out.println(myCar);

    myCar.drive(12.2);//drive the car for 12.2 miles

    System.out.println("Drove 12.2 miles: " +myCar);

    myCar.addFuel(10.5); //adds 10.5 gallons

    System.out.println("added")
  }
}
