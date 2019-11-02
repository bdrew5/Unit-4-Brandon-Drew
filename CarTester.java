public class CarTester{
  public static void main(String[] args){
    Car myCar = newCar("Honda, CRV, 20, 50");

    System.out.println(myCar);

    myCar.drive(50);//drive the car for 12.2 miles

    System.out.println("Drove 50 miles: " +myCar);

    

    System.out.println("added");
  }
}
