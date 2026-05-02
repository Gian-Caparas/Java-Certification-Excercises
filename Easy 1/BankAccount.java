public class BankAccount {
    private String accountHolder;
    private double balance;
    private String accountNumber;

    // Constructor
    public BankAccount(String accountHolder, double balance, String accountNumber){
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    // Setters
    public void setAccountHolder(String accountHolder){this.accountHolder = accountHolder;}
    public void setBalance(double balance){this.balance = balance;}
    public void setAccountNumber(String accountNumber){this.accountNumber = accountNumber;}

    // Getters
    public String getAccountHolder(){return accountHolder;}
    public double getBalance(){return balance;}
    public String getAccountNumber(){return accountNumber;}

    public void deposit(double amount){
        if(amount <= 0.0){
            throw new IllegalArgumentException("Deposit must be greater than zero\n");
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new IllegalArgumentException("Cannot withdraw! Your balance is: " + balance);
        }
        balance -= amount;
    }

    public String toString() {
        return "Account Holder: " + accountHolder +
               "\nAccount Balance: " + balance +
               "\nAccount Number: " + accountNumber;
    }
}