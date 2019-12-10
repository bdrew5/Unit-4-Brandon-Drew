import java.util.Scanner;
public class ProductClient{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the product you are buying?");
    String pro = scan.next();
    System.out.println("How much was the " + pro + "?");
    Double pri = scan.nextDouble();

    Product product1 = new Product(pro, pri);
    System.out.println(product1);

    System.out.println("How much was the " + pro + " on sale?");
    Double x = scan.nextDouble();
    product1.reducePrice(x);
    System.out.println("The " + pro + " was " + (x*100) + "% off" + product1);
  }
}
