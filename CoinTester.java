/*
Creates instances of the coin class and test their attributes and behaviors
*/
public class CoinTester{
  public static void main(String[] args){
    Coin myCoin = new Coin();
    Coin yourCoin = new Coin();
    int heads = 0;

    System.out.println("My Coin = " + myCoin.toString());
    System.out.println("Your Coin = " + yourCoin.toString());

    for (int num = 0; num < 10; num++){
      if (myCoin.equalsTo(HEADS)) {
        heads++;
      }
    }
    int tails = 10 - heads;
    System.out.println("Heads was flipped " + heads + " times");
    System.out.println("Tails was flipped " + tails + " times");
  }
}
