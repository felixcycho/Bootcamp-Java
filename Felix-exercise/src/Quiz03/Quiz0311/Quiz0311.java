interface Secret11 {
  void show();
  void hide();
}

class Password11 implements Secret11 {
  private String password11;

  public String getPassword11() {
    return this.password11;
  }

  // @Override
  // public String show() {        // Compile error: 
                                   // The return type is incompatible with Secret11.show()
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
    System.out.println(this.password11);
    // return this.password11;
      // void method cannot return a value.
  }

  @Override
  public void hide() {

  }

  Password11(String x) {
    this.password11 = x;
  }
}

public class Quiz0311 {
  public static void main(String[] args) {
    Password11 p1 = new Password11("Start");
    p1.show();                                       // 123***
    System.out.println(p1.getPassword11());          // Start
  }
}

