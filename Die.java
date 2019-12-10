public class Die {
    private int sideYellow;
    private int sideRed;
    private int sideGreen;
    private int dieTypeRandom1;
    private int dieTypeRandom2;
    private int dieType;
    private int x = 13;
    private int green = 6;
    private int yellow = 10;


    public Die(){
        sideGreen = (int) (Math.random()*6 +1);
        sideYellow = (int) (Math.random()*6 +1);
        sideRed = (int) (Math.random()*6 +1);
        dieTypeRandom1 = (int) (Math.random()*13 +1);
        dieTypeRandom2 =dieTypeRandom1;
    }

    public int getSide() {
        if (dieTypeRandom1 <= green){
        dieType = 1;
        return sideGreen;
      }
        else if (dieTypeRandom1 <= yellow){
        dieType = 2;
        return sideYellow;
      }
        else{
        dieType = 3;
        return sideRed;
      }
    }

    public int getType() {
        return dieType;
    }

    public void roll(){
      x=x-1;
      sideGreen = (int) (Math.random()*6 +1);
      sideYellow = (int) (Math.random()*6 +1);
      sideRed = (int) (Math.random()*6 +1);
      dieTypeRandom2 = (int) (Math.random()*x +1);
      if (dieTypeRandom1 >= green){
        green--;
        yellow--;
      }
      else if (dieTypeRandom1 >= yellow)
      yellow--;

    }


}
