public class Product{
  private String product = "";
  private double price;

  public Product( String pro, double pri){
    product = pro;
    price = pri;
  }

  public String getProduct(){
    return product;
  }

  public double getPrice(){
    return price;
  }

  public String toString(){
    String result = "";
    result = "\nPrice = " +price;
    result += "\nProduct = " +product;
    return result;
  }

  public void reducePrice(double perc){
    price = price - (price * perc);
  }

}
