public class ZombieDice
{
  Die d1 = new Die();
  private int brains;
  private int shots;
  private int side;
  private int color;
  private int totalBrains;
  private int counter = 0;


  public ZombieDice(){
    side = d1.getSide();
    color = d1.getType();


  }
  public int getBrains(){
    return brains;
  }
  public int getShots(){
    return shots;
  }
  public int getSide(){
    return side;
  }
  public int getColor(){
    return color;
  }


  public void findDieFace(){
    if (color ==1){
      counter++;
      if (side <= 3)
      brains= brains + 1;
      else if (side ==4)
      shots= shots + 1;
  }
    if (color ==2){
      counter++;
      if (side <= 2)
      brains= brains + 1;
      else if (side <=4)
      shots= shots + 1;
  }
    if (color ==3){
      counter++;
      if (side == 1)
      brains= brains + 1;
      else if (side <=4)
      shots= shots + 1;
  }
    if (shots < 3 && counter % 3 == 0)
    totalBrains += brains;
}

  public void rollZombie(){
    d1.roll();
    color = d1.getType();
    side = d1.getSide();
  }

  public void nextTurn(){
    shots=0;
    brains = 0;
  }

  public String toString(){
    String result = brains +"\n";
    result += shots + "";
  return result;

}


}
