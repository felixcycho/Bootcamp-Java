package banking;

public class BankAccount {

    private long accountNumber;
    private String password;
    private String holderName;
    private double balance;

    public BankAccount(long accountNumber, String password, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.password = password;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getHolderName(){
        return holderName;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public String getPassword(){
        return password;
    }

    public boolean withdraw(double withdrawAmount){
        if(withdrawAmount<= 0 || withdrawAmount > 10000){
            return false;
        }
        if(withdrawAmount % 100 != 0){
            return false;
        }
        if (withdrawAmount > balance){
            return false;
        }

        balance -= withdrawAmount;
        return true;
    }

    @Override
    public String toString(){
        return String.format("[Normal Account] Holder: %s, Account Balance: $%,.2f", holderName, balance);
    }
}
