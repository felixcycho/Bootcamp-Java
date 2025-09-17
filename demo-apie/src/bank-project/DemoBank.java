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
    hsbc.add(new Account(new AccountHolder("John1234", "admin1234")));
    hsbc.add(new Account(new AccountHolder("Lucas9999", "admin9999")));
    System.out.println(hsbc.noOfAccounts());
    System.out.println(hsbc.findAccount("Lucas9999").getAcctBalance());       // 0.0

    // credit
    hsbc.findAccount("Lucas9999").credit(12_000);
    System.out.println(hsbc.findAccount("Lucas9999").getAcctBalance());       // 12000.0

    // withdrawal (2000)
    // Login (password)
    Scanner scanner = new Scanner(System.in);
    String acctUserName;
    String acctPassword;
    boolean isUserAccountValid = false;
    boolean isPasswordValid = false;
    boolean isFunctionValid = false;
    Account userAccount = null;

    do {
      // Try login
      
      // Step 1
      if (!isUserAccountValid) {
        System.out.println("Please input your username: ");
        acctUserName = scanner.nextLine();
        userAccount = hsbc.findAccount(acctUserName);
        if (userAccount == null) {     // ! checking if userAccount is pointing to nothing
          System.out.println("User account is not found.");
          continue;
        } else {
        isUserAccountValid = true;
        }
      }
      // Step 2
      if (!isPasswordValid) {
        System.out.println("Please input your password: ");
        acctPassword = scanner.nextLine();
        if (!userAccount.validatePassword(acctPassword)){
          System.out.println("Password is incorrect.");
          continue;
        } else {
          isPasswordValid = true;
        }
      }
      // Step 3
      // 2 functions: Withdrawal or Fund transfer (Auto-logout after either transaction)
      if (!isFunctionValid) {
      System.out.println("Withdrawal or fund transfer?  Input 1 for withdrawal; 2 for fund transfer; 3 for log out.");
      String function = scanner.nextLine();
      int functionInteger = Integer.valueOf(function);
      // if (functionInteger != 1 && functionInteger != 2 && functionInteger != 3) {
      //  System.out.println("Wrong option selected.");
      //  continue;
      // }     因為已經 continue, 所以無須寫 else.
      if (functionInteger == 1) {
        System.out.println("Please input an amount: ");
        String amount = scanner.nextLine();
        try {
          int amountToWithdraw = Integer.valueOf(amount);
          if (!userAccount.debit(amountToWithdraw)) {       // !userAccount, means userAccount 已自我修改.
            System.out.println("Insufficient balance.");
            break;
           } 
          System.out.println("Withdrawal success. Outstanding balance = " + userAccount.getAcctBalance());
        } catch (NumberFormatException e) {
          System.out.println("Invalid amount entered.");
          continue;
        }
        isFunctionValid = true;
      } else if (functionInteger == 2) {
          System.out.println("Please input an account number for fund transfer: ");
          String toAcctNumStr = scanner.nextLine();
          int toAcctNum = Integer.valueOf(toAcctNumStr);
          Account toAcct = hsbc.findAccount(toAcctNum);
          if (toAcct == null) {
            System.out.println("Invalid account number.");
            continue;
          } 
          System.out.println("Input the fund transfer amount: ");
          String amount = scanner.nextLine();
          int amountToTransfer = Integer.valueOf(amount);
          if(!userAccount.fundTransfer(toAcct, amountToTransfer)) {
            System.out.println("Error. Please try again later.");
            break;
          }
          System.out.println("Fund transfer success. Outstanding balance = " + userAccount.getAcctBalance());
          isFunctionValid = true;
          break;
        } else if (functionInteger == 3) {
            System.out.println("Log out success.");
            isFunctionValid = true;
            break;
        } else {
            System.out.println("Wrong option selected.");
            continue;
        }
      }
   } while (true);
   System.out.println("Thank you for using our service.");
   scanner.close();

   System.out.println(hsbc.findAccount("Lucas9999").getAcctBalance());
   System.out.println(hsbc.findAccount("John1334").getAcctBalance());
  }
}
