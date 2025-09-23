interface Secret9 {
  void show();
}

class Password9 implements Secret9 {
  private String password9;

  public String getPassword9() {
    return this.password9;
  }

  // @Override
  // public String show() {        // Compile error: 
                                   // The return type is incompatible with Secret9.show()
  //  System.out.print("123");
  //  System.out.print("***");
  //  System.out.println();
  //  return this.password11;
  // }

  @Override
  public void show() {
    System.out.print("123");
    System.out.print("***");
    System.out.println();
    System.out.println(this.password9);         
    // return this.password9;
      // void method cannot return a value.
    // System.out.println(this.password9.getPassword9());
      // Compile error: The method getPassword9() is undefined for the type String.
  }

  Password9(String x) {
    this.password9 = x;
  }
}

public class Quiz0309 {
  public static void main(String[] args) {
    Password9 p1 = new Password9("Start");
    p1.show();                                      // 123***
                                                    // Start
    System.out.println(p1.getPassword9());          // Start
    // System.out.println(this.password9);
        // Compile error:  Cannot use this in a static context
  }
}


