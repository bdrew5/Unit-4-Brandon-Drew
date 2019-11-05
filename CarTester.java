public class CarTester{
  public static void main(String[] args){
    Car car1 = new Car("Ford", "Explorer", 29.0, 20.0);
    System.out.println(car1);

    car1.drive(50);
    System.out.println("Drove 50 miles: " +car1);

    car1.addFuel(3);
    System.out.println("Added 3 gallons: " +car1);

    Car car2 = new Car("Honda", "Prius", 59.0, 11.3);
    System.out.println(car2);

    car2.drive(150);
    System.out.println("Drove 150 miles: " +car2);

    car2.addFuel(2);
    System.out.println("Added 2 gallons: " +car2);

    Car car3 = new Car("Ferrari", "488", 22.0, 17.0);
    System.out.println(car3);

    car3.drive(60);
    System.out.println("Drove 60 miles: " +car3);

    car3.addFuel(2);
    System.out.println("added 2 gallons: " +car3);
  }
}
