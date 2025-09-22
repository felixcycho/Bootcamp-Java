class Password1 {
  private String password1;

  public Password1(String x) {
    this.password1 = x;
  }

  public String getPassword1() {
    return this.password1;
  }
}

public class Quiz0201 {
  public static void main(String[] args) {
    Password1 p1 = new Password1("ABC");
    Password1 p2 = new Password1("ABC");
    Password1 p3 = new Password1("BCD");
    String s1 = new String("abc");

    System.out.println(p1 == p2);                                            // false
    System.out.println(p2 == p3);                                            // false
    System.out.println(p1.getPassword1().equals(p2.getPassword1()));         // true
    System.out.println("abc".equals(s1));                                    // true
  }
  
}
