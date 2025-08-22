package src.bank;

import java.math.BigDecimal;

public class Account {
  private static int acctIdCounter = 0;
  private int acctId;
  private double acctBalance;
  private AcctHolderInfo acctHolderInfo;
  private Transaction[] transactions;

  public Account(AcctHolderInfo acctHolderInfo) {
    this.acctId = ++acctIdCounter;
    this.acctBalance = 0.0;
    this.acctHolderInfo = acctHolderInfo;
    this.transactions = new Transaction[0];
  }

  public boolean validatePassword(String inputPassword) {
    return this.acctHolderInfo.getPassword().equals(inputPassword);
  }

  // ! account --> accountholder information
  // because Account.class can be with method to check AcctHolderInfo.class
  public void add(Transaction newTransaction) {
      Transaction[] transactions = new Transaction[this.transactions.length + 1];
    for (int i = 0; i < this.transactions.length; i++) {
      transactions[i] = this.transactions[i];
    }
    transactions[transactions.length - 1] = newTransaction;
    this.transactions = transactions;
  }

  // Arrays.sort()
  public Transaction[] getTransactions() {
    return this.transactions;
  }

  public String getAcctHolderName() {
    return this.acctHolderInfo.getAcctHolderName();
  }

  public int getAcctId() {
    return this.acctId;
  }

  public double getAcctBalance() {
    return this.acctBalance;
  }

  public void credit(double amount) {
    this.acctBalance = BigDecimal.valueOf(this.acctBalance)
        .add(BigDecimal.valueOf(amount))
        .doubleValue();
  }

  public boolean debit(double amount) {
    if (amount > this.acctBalance) {
      return false;
    } else { 
      this.acctBalance -= amount;
      return true;
    }
  }

  
}
