package banking;

public class PremiumBankAccount extends BankAccount {

    private double outStandingLoan;

    public PremiumBankAccount (long accountNumber, String password, String holderName, double balance){
        super(accountNumber,password,holderName,balance);
        this.outStandingLoan = 0;
    }

    public double getOutStandingLoan(){
        return outStandingLoan;
    }

    public boolean withdraw(double withdrawAmount){
        if(withdrawAmount<= 0){
            return false;
        }
        if(withdrawAmount % 100 != 0){
            return false;
        }
        if (withdrawAmount > getBalance()){
            return false;
        }

//        balance -= withdrawAmount;
        setBalance(getBalance() - withdrawAmount);

        return true;
    }

    public boolean loan (double amount){
        if (amount <= 0){
            return false;
        }

        outStandingLoan += amount;
        setBalance(getBalance()+amount);
        return true;
    }

    @Override
    public String toString(){
        return String.format("[Premium Account] Holder: %s, Account Balance: $%,.2f", getHolderName(), getBalance());
    }
}
