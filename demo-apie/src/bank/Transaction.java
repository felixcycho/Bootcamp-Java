import java.time.LocalDate;
import java.time.LocalDateTime;

// ! Assume we have fund transfer, credit, and debit.
public class Transaction {
  // attribute 不可 looping, e.g. bank 指向 transaction, transaction 再指回 bank.
  // 否則, 有機會出錯, e.g. HSBC transaction 無故指向 恆生.
  // In this case, transaction 指向 Transaction time, 則只可由 transaction 找出 time, 不能用 time 反向找出 transaction.

  // attribute
  private static int acctIdCounter = 0;
  private int acctId;
  private LocalDateTime trxDateTime;
  private int fromAccountId;       // int acctId 其實沒有意思, 因為殊途同歸, 最終亦會取得 account ID.
  private int toAccountId;
  private double trxAmount;

  public Transaction(LocalDateTime trxDateTime, int fromAccountId, int toAccountId, double trxAmount) {
    this.acctId = ++acctIdCounter; 
    this.trxDateTime = LocalDateTime.now();
    this.fromAccountId = fromAccountId;
    this.toAccountId = toAccountId;
    this.trxAmount = trxAmount;
  }

  

}
