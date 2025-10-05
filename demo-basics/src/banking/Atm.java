package banking;

public class Atm {
  
    private BankAccount[] bankAccounts;
    private BankAccount loginAccount;   //default null

    public Atm(){
        bankAccounts = new BankAccount[] {
                new BankAccount(1111,"1111", "Chan Tai Man",12345),
                new BankAccount(2222,"2222","Lee Siu Fai",34567),
                new PremiumBankAccount(3333,"3333","Lin Wai Chung",999999)
        };
    }

    public BankAccount login(long accountNumber, String password){
        for(int i=0; i< bankAccounts.length; i++){
            if(bankAccounts[i] == null){
                continue;
            }
            if(bankAccounts[i].getAccountNumber() != accountNumber){
                continue;
            }
            if(!bankAccounts[i].getPassword().equals(password)){
                continue;
            }

            loginAccount = bankAccounts[i];
            return loginAccount;
        }
        return null;
    }

    public boolean withdraw (double amount){
        return loginAccount.withdraw(amount);
    }

    public boolean requestLoan(double amount){
        if (loginAccount instanceof PremiumBankAccount) {
            return ((PremiumBankAccount)loginAccount).loan(amount);
        }
        return false;
    }

    public void logout(){
        loginAccount = null;
    }
}
