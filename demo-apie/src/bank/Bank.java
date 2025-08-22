package src.Bank;

public class Bank {
  // Open Account
  private Account[] accounts;    // 當我希望用 Account 找 bank 之際, 可

  public Bank() {
    this.accounts = new Account[0];
  }

  public int noOfAccount() {
    return this.accounts.length;
  }

  public void add(Account newAccount) {
    Account[] accounts = new Account[this.accounts.length + 1];
    for (int i = 0; i < this.accounts.length; i++) {
      accounts[i] = this.accounts[i];
    }
    accounts[accounts.length - 1] = newAccount;
    this.accounts = accounts;
  }

  // Return Account by account holder name
  public Account findAccount(String acctHolderName) {
    for (Account account : this.accounts) {        // this.accounts 不可有 NULL.
      // 1000 lines
      if (account.getAcctHolderName().equals(acctHolderName)) {          
      // it means account relates to acctHolderName, 不等於 account 擁有 acctHolderName.
        return account;  
      }
    }
    return null;
  }

}
