class Password4 {
  private String password4;
  
  public Password4(String x) {
    this.password4 = x;
  }

  public String getPassword4() {
    return this.password4;
  }

  public void setPassword4(String password4) {
    this.password4 = password4;
  }

  public void append(Password4 password4) {
    password4.setPassword4("XYZ");               // p2
    this.password4 = "BCD";                      // p1
  }
}

public class Quiz0204 {
  public static void main(String[] args) {
    Password4 p1 = new Password4("ABC");
    Password4 p2 = new Password4("IJK");
    p1.append(p2);
    // System.out.println(p1 + p2);                                       // Compile error
    System.out.println(p1.getPassword4() + p2.getPassword4());            // BCDXYZ
  }
  
}
