public class DemoRegex {
  public static void main(String[] args) {
    // String Regular Expression
        String codeRule = "^[A-Za-z0-9]+$";
        String s = "SAVE1234";
        String s2 = "SAVE_1234";
        String s3 = "";
        String s4 = "saVE$23";
        System.out.println(s.matches(codeRule));                                       // true
        System.out.println(s2.matches(codeRule));                                      // false
        System.out.println(s3.matches(codeRule));                                      // false
        System.out.println(s4.matches(codeRule));                                      // false

        String emailAddressRule = "^[A-Za-z0-9]+@[A-Za-z]+\\.com$";
        System.out.println("felixcycho@yahoo.com".matches(emailAddressRule));          // true
        System.out.println("felixcycho@yahoo.com.hk".matches(emailAddressRule));       // false
        System.out.println("felixcycho@yahoocom".matches(emailAddressRule));           // false
        System.out.println("felixcycho@yahoo.co".matches(emailAddressRule));           // false
  }
}
