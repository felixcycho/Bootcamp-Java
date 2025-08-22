package src.Bank;

import java.util.Scanner;

// User can view bank account balance.
    // User can credit / debit his own account.
    // User A fund transfer to User B (generate transactions / history).
    // User can view all account transaction / history.
    // We have only one bank, but many users.
    // A new user comes to open a new bank account.
    // The bank account has its own bank account number.

public class DemoBank {
  
  public static void main(String[] args) {
    
    Bank hsbc = new Bank();
    hsbc.add(new Account(new AcctHolderInfo("John1234", "admin1234")));
    hsbc.add(new Account(new AcctHolderInfo("Lucas9999", "admin9999")));
    System.out.println(hsbc.noOfAccount());
    System.out.println(hsbc.findAccount("Lucas9999").getAcctBalance());       // 0.0

    // credit
    hsbc.findAccount("Lucas9999").credit(12000);
    System.out.println(hsbc.findAccount("Lucas9999").getAcctBalance());       // 12000.0

    // withdrawal (2000)
    // Login (password)
    Scanner scanner = new Scanner(System.in);
    String acctUserName;
    String acctPassword;

    do {
      // Try login
      System.out.println("Please input your username: ");
      acctUserName = scanner.nextLine();
      Account userAccount = hsbc.findAccount(acctUserName);
      if (userAccount == null) {     // ! checking if userAccount is pointing to nothing
        System.out.println("User account is not found.");
        continue;
      }
      System.out.println("Please input your password: ");
      acctPassword = scanner.nextLine();
      if (!userAccount.validatePassword(acctPassword)){
        System.out.println("Password is incorrect.");
        continue;
      } 
      // 2 functions: Withdrawal or Fund transfer (Auto-logout after either transaction)
      System.out.println("Withdrawal or fund transfer? Input 1 for withdrawal; 2 for fund transfer.");

    } while ();









  }
}
