class Password2 {
  public static int counter = 2;
  private String password2;

  public Password2(String x) {
    this.password2 = x;
    counter++;
  }

  public String getPassword2() {
    return this.password2;
  }

  public void setPassword2(String password2) {
    this.password2 = password2;
    counter--;
  }
}

public class Quiz0202 {
  public static void main(String[] args) {
    Password2 p1 = new Password2("ABC");             // Password2.counter = 3
    Password2 p2 = new Password2("ABC");             // Password2.counter = 4
    Password2 p3 = new Password2("BCD");             // Password2.counter = 5
    p2.setPassword2("password");                     // Password2.counter = 4
    Password2.counter *= Password2.counter;          // Password2.counter = 16

    System.out.println(Password2.counter);           // 16

  }
  
}
