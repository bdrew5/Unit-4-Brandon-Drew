public class ZombieDice
{
  Die d1 = new Die();
  Die d2 = new Die();
  Die d3 = new Die();
  private int brains;
  private int shots;
  private int side1;
  private int side2;
  private int side3;
  private int type1;
  private int type2;
  private int type3;


  public ZombieDice(){
    side1 = d1.getSide();
    side2 = d2.getSide();
    side3 = d3.getSide();
    type1 = d1.getType();
    type2 = d2.getType();
    type3 = d3.getType();


  }
  public int getBrains(){
    return brains;
  }
  public int getShots(){
    return shots;
  }
  public int getSide1(){
    return side1;
  }
  public int getSide2(){
    return side2;
  }
  public int getSide3(){
    return side3;
  }
  public int getType1(){
    return type1;
  }
  public int getType2(){
    return type2;
  }
  public int getType3(){
    return type3;
  }

  public void findDieFace(){
    if (type1 ==1){
      if (side1 <= 3)
      brains= brains + 1;
      else if (side1 ==4)
      shots= shots + 1;
  }
    if (type1 ==2){
      if (side1 <= 2)
      brains= brains + 1;
      else if (side1 <=4)
      shots= shots + 1;
  }
    if (type1 ==3){
      if (side1 == 1)
      brains= brains + 1;
      else if (side1 <=4)
      shots= shots + 1;
  }
  if (type2 ==1){
    if (side1 <= 3)
    brains= brains + 1;
    else if (side1 ==4)
    shots= shots + 1;
}
  if (type2 ==2){
    if (side1 <= 2)
    brains= brains + 1;
    else if (side1 <=4)
    shots= shots + 1;
}
  if (type2 ==3){
    if (side1 == 1)
    brains= brains + 1;
    else if (side1 <=4)
    shots= shots + 1;
}
if (type3 ==1){
  if (side1 <= 3)
  brains= brains + 1;
  else if (side1 ==4)
  shots= shots + 1;
}
if (type3 ==2){
  if (side1 <= 2)
  brains= brains + 1;
  else if (side1 <=4)
  shots= shots + 1;
}
if (type3 ==3){
  if (side1 == 1)
  brains= brains + 1;
  else if (side1 <=4)
  shots= shots + 1;
}
  }

  public void rollZombie(){
    d1.roll();
    d2.roll();
    d3.roll();
    type1 = d1.getType();
    type2 = d2.getType();
    type3 = d3.getType();
    side1 = d1.getSide();
    side2 = d2.getSide();
    side3 = d3.getSide();
  }

  public String toString(){
    String result = brains +"\n";
    result += shots + "";
  return result;

}


}
