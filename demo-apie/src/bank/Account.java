package src.bank;

import java.math.BigDecimal;

public class Account {
  private static int acctIdCounter = 0;
  private int acctId;
  private double acctBalance;
  private AcctHolder acctHolder;
  private Transaction[] transactions;

  // Fund transfer -> transaction

  public Account(AcctHolder acctHolder) {
    this.acctId = ++acctIdCounter;
    this.acctBalance = 0.0;
    this.acctHolder = acctHolder;
  }

  public int getAccountId() {
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
