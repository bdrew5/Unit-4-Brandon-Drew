import java.util.Scanner;
public class  BankClient {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter your routing number:");
  int rNum = scan.nextInt();
  System.out.println("Enter your account number:");
  int aNum = scan.nextInt();
  System.out.println("Enter your balance:");
  double bal = scan.nextDouble();
  System.out.println("Enter your interest Rate:");
  double intRate = scan.nextDouble();
  Bank account1 = new Bank(aNum, rNum, bal, intRate);
  System.out.print(account1);

  account1.deposit(22);
    System.out.println("You have deposited $22: " + account1);

  account1.withdraw(10);
    System.out.println("You have withdrawn $10: " + account1);


    System.out.println("Enter y if you want your card to be locked");
    String y = scan.next();
    if (y.equals("y")){
      account1.lockCard();
    }
    System.out.println("Enter y if you want your card to be replaced");
    String a = scan.next();
    if(a.equals("y")){
    System.out.print(account1);
    account1.newCard();
      System.out.println("You have been sent a new card.");
}

  account1.unlockCard();
  System.out.println(account1);




}
}
