public class accountManager {
    private double balance=0;

    public void deposit(double amount){
        balance=getBalance() + amount;
    }
    public void withdraw(double amount) throws Exception{
        if (balance>=amount){
            balance = getBalance()-amount;
        }
        else {
            throw new Exception("bakiyeniz yetersiz");
          //  System.out.println("bakiyeniz yetersiz .para çekilemedi");
        }
    }
    public double getBalance(){
        return balance;
    }


}
