public class Bank{

  private int routingNumber;
  private int accountNumber;
  private double balance;
  private boolean lockCard = false;

  public Bank(int rNum, int aNum, double bal){
    routingNumber = rNum;
    accountNumber = aNum;
    balance = bal;
  }

  public String toString(){
    String result = "";
    if (lockCard)
    System.out.println("Sorry, your card is locked and unable to be used at this time.");
    else{
    result += "Balance: " +balance + "\n";
    result += "Account Number: " +accountNumber+ "\n";
    result += "Routing Number: " +routingNumber+ "\n";
    return result;
  }
  }
   public String getRoutingNumber(){
     return routingNumber;
   }
   public String getAccountNumber(){
     return accountNumber;
   }
   public String getbalance(){
     return balance;
   }
   public void setBalance(double newBalance){
     balance = newBalance;
     balanceLeft = balance-withdraw;
     if (balance = 0) noBalanceLeft = true;
     else noBalanceLeft = false;
   }
     public int withdraw(int withdraw){
     balance = balance - withdraw;
     return balance;
   }
   public int deposit(int deposit){
     balance = balance + deposit;
     return balance;
   }
   public void lockCard(){
     lockCard = true;
     }

   public void newCard(){
     accountNumber = Math.random() * 1000000000000;
     routingNumber =Math.random() * 1000000000;
   }

   public void unlockCard(){
     lockCard = false;
   }


}
