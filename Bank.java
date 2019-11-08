/*
Properties that a bank account should have:
Account number
Balance
Routing number
Behaviors a bank account should have:
Withdraw
Deposit
Request a new card
Lock your current card
Display current balance
*/
public class Bank{

  private int routingNumber;
  private int accountNumber;
  private double balance;
  private boolean lockCard = false;
  private double interest;

  public Bank(int rNum, int aNum, double bal, double intRate){
    routingNumber = rNum;
    accountNumber = aNum;
    balance = bal;
    interest = intRate;
  }

  public String toString(){
    String result = "";
    if (lockCard)
    System.out.println("Sorry, your card is locked and unable to be used at this time.");
    else{
    result += "Balance: " +balance + "\n";
    result += "Account Number: " +accountNumber+ "\n";
    result += "Routing Number: " +routingNumber+ "\n";
    result += "Interest Rate : " +interest+ "\n";
  }
  return result;
  }
   public int getRoutingNumber(){
     return routingNumber;
   }
   public int getAccountNumber(){
     return accountNumber;
   }
   public double getbalance(){
     return balance;
   }
   public void setBalance(double newBalance){
     balance = newBalance;


   }
     public double withdraw(double withdraw){
     balance = balance - withdraw;
     if (balance == 0)
     System.out.println("You don't have any money in your account");
     return balance;
   }
   public double deposit(double deposit){
     balance = balance + deposit;
     return balance;
   }
   public void lockCard(){
     lockCard = true;

     }

   public void newCard(){
     accountNumber = (int) (Math.random() * 1000000000);
     routingNumber = (int) (Math.random() * 1000000000);
   }

   public void unlockCard(){
     lockCard = false;
   }


}
