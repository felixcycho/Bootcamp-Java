public class AcctHolderInfo {
  // Account holder name -> bank.getAccount(this.name)
  private String acctHolderName;
  private String password;

  public AcctHolderInfo(String acctHolderName, String password) {
    this.acctHolderName = acctHolderName;
    this.password = password;
  }
  
  public String getAcctHolderName() {
    return this.acctHolderName;
  }

  public String getPassword() {
    return this.password;
  }
}
