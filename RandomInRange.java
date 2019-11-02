public class RandomInRange{
  private int num1;
  private int num2;
  private int num3;
  private int random;

  public RandomInRange(int num4, int num5){
    num1 = num4;
    num2 = num5;
    num3 = (num2 - num1) + 1;
}
  public int rand(){
    random = (int) (Math.random() * num3);
    random = random + num1;
    return random;
  }
}
