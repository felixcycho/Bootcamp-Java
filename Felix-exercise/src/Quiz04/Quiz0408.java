import java.util.ArrayList;
import java.util.List;

class Password {
  private String password;

  Password(String x) {
    this.password = x;
  }
}

class Quiz0408 {
  public static void main(String[] args) {
    int counter = 0;
    Password p1 = new Password("ABC");
    Password p2 = new Password("BCD");
    List<Password> passwords = new ArrayList<>();
    passwords.add(p1);   
    passwords.add(p2);

    for (Password password : passwords) {
      for (int i = 0; i < 2; i++) {
        counter++;
      }
    }
    System.out.println(counter);               // 4

    counter = 0;
    Password p3 = new Password("ABC");
    Password p4 = new Password("BCD");
    List<Password> newPasswords = new ArrayList<>();
    // passwords.add(p3);               missing
    // passwords.add(p4);               missing

    for (Password password : newPasswords) {
      for (int i = 0; i < 2; i++) {
        counter++;
      }
    }
    System.out.println(counter);               // 0


  }
}
