public class Main {
    public static void main(String[] args) {
        accountManager manager =new accountManager();
        manager.deposit(100);
        System.out.println("hesap bakiyeniz:"+manager.getBalance());
        try{
            manager.withdraw(50);

        }catch(Exception exception){
            exception.getMessage();
        }
        System.out.println(manager.getBalance());
    }
}