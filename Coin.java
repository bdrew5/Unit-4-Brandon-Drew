/*
This is the coin class
It is the blueprint for how to make a coin object
*/
public class Coin {
  //These are the declarations for the attributes of a coin
  private int face;
  private final int HEADS = 0; //constants difining heads and tails
  private final int TAILS = 1;

  /*
  The coin constructor that defines what happens when a coin object is made
  When a coin object is made it gets flipped
  */
  public Coin(){
    flip();
  }

  /*
  Tis is the section of the class containing the methods (behaviors) of a Coin

  The flip method assigns a randomly chosen value to the face of the coin
  */
  public void flip(){
    face = (int) (Math.random() * 2);
  }

  /*
  The isHeads methods tells us if the coin's face is a heads or not
  */
  public boolean isHeads(){
    return (face == 0);
  }

  /*
  the toString method prints out information about the current state of a coin
  */
  public String toString(){
    String result = "";
    if (face == HEADS){
      result = "HEADS";
    }
    else {
      result = "TAILS";
    }
    return result;
  }  
}
