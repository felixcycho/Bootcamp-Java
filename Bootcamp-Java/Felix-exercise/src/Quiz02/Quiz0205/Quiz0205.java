class Password5 {
  private String password5;

  public Password5(String x) {
    this.password5 = x;
  }

  public String getPassword5() {
    return this.password5;
  }

  public void setPassword5(String password5) {
    this.password5 = password5;
  }
}

public class Quiz0205 {
  public static void main(String[] args) {
    Password5 p1 = new Password5("ABC");
    Password5 p2 = new Password5("ABC");

    if (p1 == p2 || !p1.getPassword5().equals(p2.getPassword5())) {
      p1.setPassword5("DEF");
    } else if (p1.getPassword5().equals(p2.getPassword5())) {
      p2.setPassword5("IJK");
    } else {
      p1.setPassword5("XYZ");
      p2.setPassword5("XYZ");
    }
    System.out.println(p1.getPassword5() + p2.getPassword5());           // ABCIJK
  }
  
}
