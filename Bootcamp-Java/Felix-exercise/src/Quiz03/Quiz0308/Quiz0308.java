interface Secret8 {
  String show();
}

class Password8 implements Secret8 {
  private String password8;

  public String getPassword8() {
    return this.password8;
  }

  @Override
  public String show() {
    System.out.print("123");
    System.out.print("***");
    System.out.println();
    return this.password8;
    // System.out.println(this.password8);         
      // Compile error: Unreachable code
    // System.out.println(this.password8.getPassword8());
      // Compile error: The method getPassword8() is undefined for the type String.

  }

  Password8(String x) {
    this.password8 = x;
  }
}

public class Quiz0308 {
  public static void main(String[] args) {
    Password8 p1 = new Password8("Start");
    p1.show();                                      // 123***
    System.out.println(p1.getPassword8());          // Start
    // System.out.println(this.password8);          
      // Compile error:  cannot use 'this' in a static context.
  }
}
