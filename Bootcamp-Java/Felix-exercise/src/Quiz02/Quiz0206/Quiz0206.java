class Password6 {
  private String password6;

  public static String concat(String x) {
    return x;
  }

  public Password6(String x) {
    this.password6 = x;
  }

  public String concat(String x, String y) {
    return y.toLowerCase().toUpperCase();
  }
}

class Quiz0206 {
  public static void main(String[] args) {
    int counter = 0;
    Password6 p1 = new Password6("Start");
    System.out.println(p1.concat("XYZ", "abc"));               // ABC
  }
}
