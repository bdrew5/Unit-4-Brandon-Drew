public class CarTester{
  public static void main(String[] args){
    Car myCar = new Car("Ford", "Explorer", 30.0, 25.0);

    System.out.println(myCar);

    myCar.drive(50);//drive the car for 12.2 miles

    System.out.println("Drove 50 miles: " +myCar);



    System.out.println("Added 10.5 gallons: " +myCar);
  }
}
