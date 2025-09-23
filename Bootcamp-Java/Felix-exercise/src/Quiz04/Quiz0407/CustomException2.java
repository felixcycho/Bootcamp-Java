public class CustomException2 extends RuntimeException {
  
  public CustomException2() {

  }

  public CustomException2(String msg, Throwable e) {
    super(msg, e);
  }

  public static int test() {
    throw new CustomException2();       // Runtime error, unhandled exception
  }

  public static void main(String[] args) {        // called by JVM
    test();                             // Runtime error, unhandled exception
  }
  
}
