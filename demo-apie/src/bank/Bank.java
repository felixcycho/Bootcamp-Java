package src.bank;

public class Bank {
  // Open Account
  private Account[] accounts;

  public Bank() {
    this.accounts = new Account[0];
  }

  public void add(Account newAccount) {
    Account[] accounts = new Account[this.accounts.length + 1];
    for (int i = 0; i < this.accounts.length; i++) {
      accounts[i] = this.accounts[i];
    }
    accounts[accounts.length - 1] = newAccount;
    this.accounts = accounts;
  }



}
