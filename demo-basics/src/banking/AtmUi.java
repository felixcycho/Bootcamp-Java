package banking;
import java.util.Scanner;

public class AtmUi {
    static Scanner keyboard = new Scanner (System.in);
    static Atm atm = new Atm();
    static BankAccount loginAccount;        //default null

    public static void main(String[] args) {

        do{
            printLoginMenu();
        } while (loginAccount == null);

        while(loginAccount != null){
            printMainMenu();
        }
    }

    public static void printLoginMenu(){
        System.out.println("=== ABC Bank ATM ===");
        System.out.print("Account Number: ");
        long accountNumber = keyboard.nextLong();
        keyboard.nextLine();
        System.out.print("Password: ");
        String password = keyboard.nextLine();
        System.out.println();

        if(login(accountNumber, password)){
            System.out.println("Login success.");
        } else {
            System.out.println("Login failed. Please try again.");
        }

    }

    public static void printMainMenu(){
        System.out.println("=== Main Menu ===");
        System.out.printf("Account Holder: %s\n", loginAccount.getHolderName());
        System.out.printf("Account Number: %d\n", loginAccount.getAccountNumber());
        System.out.printf("Account Available Balance: $%,.2f\n",loginAccount.getBalance());
        System.out.println();
        System.out.println("1. Withdraw Cash");
        System.out.println();

        if(loginAccount instanceof PremiumBankAccount){
            System.out.println("2. Request Loan");
            System.out.println();
        }

        System.out.println("0. Logout");
        System.out.print("Select a feature: ");
        int selection = keyboard.nextInt();
        keyboard.nextLine();

        if (selection == 1){
            printWithdraw();
        } else if (selection == 0){
            logout();
        } else if (selection == 2 && loginAccount instanceof PremiumBankAccount){
            printRequestLoan();
        }
    }

    public static void printWithdraw(){
        System.out.println("=== Cash Withdrawal ===");
        System.out.print("Input an amount: $");
        int amount = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println();

        if(atm.withdraw(amount)){
            System.out.printf("Cash Withdrawal success! Your available balance: $%,.2f.\n",loginAccount.getBalance());
        } else {
            System.out.println("Invalid amount! Withdrawal failed!");
        }
    }

    public static void printRequestLoan(){
        System.out.println("=== Request Loan ===");
        System.out.print("Input the requested loan amount: $");
        double amount = keyboard.nextDouble();
        keyboard.nextLine();

        if(atm.requestLoan(amount)){
            System.out.printf("Loan Request success! Your current loan: $%,.2f, available balance: $%,.2f\n",
             ((PremiumBankAccount)loginAccount).getOutStandingLoan(),loginAccount.getBalance());
        } else {
            System.out.printf("Loan Request failed!");
        }
        System.out.println();
    }

    public static boolean login(long accountNumber, String password){
            BankAccount result = atm.login(accountNumber, password);
            if (result == null){
                return false;
            } else {
                loginAccount = result;
                return true;
            }
    }

    public static void logout(){
        loginAccount = null;
        atm.logout();
    }
}

// public class Atm {

//     private BankAccount[] bankAccounts;
//     private BankAccount loginAccount;   //default null

//     public Atm(){
//         bankAccounts = new BankAccount[] {
//                 new BankAccount(1111,"1111", "Chan Tai Man",12345),
//                 new BankAccount(2222,"2222","Lee Siu Fai",34567),
//                 new PremiumBankAccount(3333,"3333","Lin Wai Chung",999999)
//         };
//     }

//     public BankAccount login(long accountNumber, String password){
//         for(int i=0; i< bankAccounts.length; i++){
//             if(bankAccounts[i] == null){
//                 continue;
//             }
//             if(bankAccounts[i].getAccountNumber() != accountNumber){
//                 continue;
//             }
//             if(!bankAccounts[i].getPassword().equals(password)){
//                 continue;
//             }

//             loginAccount = bankAccounts[i];
//             return loginAccount;
//         }
//         return null;
//     }

//     public boolean withdraw (double amount){
//         return loginAccount.withdraw(amount);
//     }

//     public boolean requestLoan(double amount){
//         if (loginAccount instanceof PremiumBankAccount) {
//             return ((PremiumBankAccount)loginAccount).loan(amount);
//         }
//         return false;
//     }

//     public void logout(){
//         loginAccount = null;
//     }
// }

// public class BankAccount {
//     private long accountNumber;
//     private String password;
//     private String holderName;
//     private double balance;

//     public BankAccount(long accountNumber, String password, String holderName, double balance){
//         this.accountNumber = accountNumber;
//         this.password = password;
//         this.holderName = holderName;
//         this.balance = balance;
//     }

//     public double getBalance(){
//         return balance;
//     }

//     public void setBalance(double balance){
//         this.balance = balance;
//     }

//     public String getHolderName(){
//         return holderName;
//     }

//     public long getAccountNumber(){
//         return accountNumber;
//     }

//     public String getPassword(){
//         return password;
//     }

//     public boolean withdraw(double withdrawAmount){
//         if(withdrawAmount<= 0 || withdrawAmount > 10000){
//             return false;
//         }
//         if(withdrawAmount % 100 != 0){
//             return false;
//         }
//         if (withdrawAmount > balance){
//             return false;
//         }

//         balance -= withdrawAmount;
//         return true;
//     }

//     @Override
//     public String toString(){
//         return String.format("[Normal Account] Holder: %s, Account Balance: $%,.2f", holderName, balance);
//     }
// }


// public class PremiumBankAccount extends BankAccount {

//     private double outStandingLoan;

//     public PremiumBankAccount (long accountNumber, String password, String holderName, double balance){
//         super(accountNumber,password,holderName,balance);
//         this.outStandingLoan = 0;
//     }

//     public double getOutStandingLoan(){
//         return outStandingLoan;
//     }

//     public boolean withdraw(double withdrawAmount){
//         if(withdrawAmount<= 0){
//             return false;
//         }
//         if(withdrawAmount % 100 != 0){
//             return false;
//         }
//         if (withdrawAmount > getBalance()){
//             return false;
//         }

// //        balance -= withdrawAmount;
//         setBalance(getBalance() - withdrawAmount);

//         return true;
//     }

//     public boolean loan (double amount){
//         if (amount <= 0){
//             return false;
//         }

//         outStandingLoan += amount;
//         setBalance(getBalance()+amount);
//         return true;
//     }

//     @Override
//     public String toString(){
//         return String.format("[Premium Account] Holder: %s, Account Balance: $%,.2f", getHolderName(), getBalance());
//     }

// }
