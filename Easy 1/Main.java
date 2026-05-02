public class Main {
    public static void main(String[] args){
        BankAccount acc = new BankAccount("Gian Caparas", 0.0, "1010");

        acc.deposit(1000.0);
        acc.withdraw(500.0);
        System.out.println(acc);
    }
}