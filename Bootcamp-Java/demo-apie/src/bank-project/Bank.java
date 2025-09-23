public class Bank {
  // Open Account
  // 當我希望用 bank 找 account 之際, 可在 Class Bank 包含 private Account.
  private Account[] accounts;    

  public Bank() {
    this.accounts = new Account[0];
  }

  public int noOfAccounts() {
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
      // 1000 lines.equals(acctHolderName)) {          
      // it means account relates to acctHolderName, 不等於 account 擁有 acctHolderName.
        return account;  
      // }
    }
    return null;
  }

  public Account findAccount(int acctId) {
    for (Account account : this.accounts) {        // this.accounts 不可有 NULL.
      // 1000 lines
      // if (account.getAcctId().equals(acctId)) {          invalid, because only String can use method.
      if (account.getAcctId() == acctId) {
      // it means account relates to acctHolderName, 不等於 account 擁有 acctHolderName.
        return account;  
      }
    }
    return null;
  }
  
}
