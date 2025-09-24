interface Secret10 {
  void show();

  void hide();
}

class Password10 implements Secret10 {           // Class Password10 must implement hide()
  private String password10;

  public String getPassword10() {
    return this.password10;
  }

  // @Override
  // public String show() {        // Compile error: 
                                   // The return type is incompatible with Secret10.show()
  //  System.out.print("123");
  //  System.out.print("***");
  //  System.out.println();
  //  return this.password10;
  // }

  @Override
  public void show() {
    System.out.print("123");
    System.out.print("***");
    System.out.println();
    System.out.println(this.password10);
    // return this.password10;
      // void method cannot return a value.
  }

  Password10(String x) {
    this.password10 = x;
  }
}

public class Quiz0310 {
  public static void main(String[] args) {
    Password10 p1 = new Password10("Start");
    p1.show();                                      // 123***
    System.out.println(p1.getPassword10());          // Start
  }
}
