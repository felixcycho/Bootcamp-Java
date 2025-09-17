import java.math.BigDecimal;
import java.time.LocalDateTime;

// Account --> abstract class
// Personal (hkid, User info) / Company (BR No, Company info)
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

  // account --> accountholder information
  // because Account.class can be with method to check AcctHolderInfo.class
  public boolean validatePassword(String inputPassword) {
    return this.acctHolderInfo.getPassword().equals(inputPassword);
  }

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
    if (amount <= 0) 
      return;
    this.acctBalance = BigDecimal.valueOf(this.acctBalance)
        .add(BigDecimal.valueOf(amount))
        .doubleValue();
    this.add(new Transaction(LocalDateTime.now(), this.acctId, -1, amount));
  }

  public boolean debit(double amount) {
    if (amount <= 0 || amount > this.acctBalance) {
      return false;
    } else { 
      this.acctBalance -= amount;
      this.add(new Transaction(LocalDateTime.now(), this.acctId, -1, amount * -1));
      return true;
    }
  }

  // account.fundtransfer (another account)
  public boolean fundTransfer(Account toAccount, double amount) {
    if (amount <= 0 || !this.debit(amount) || toAccount == null)
      return false;
    toAccount.credit(amount);
    return true;
  }

  // public static void main(String[] args) {
    // Account a1 = null;                會導致死機
    // a1.credit(100);                   // java.lang.NullPointerException
  // }
  
}
