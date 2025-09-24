public class CustomException extends Exception {

  public CustomException() {

  }

  public CustomException(String msg, Throwable e) {
    super(msg, e);
  }

  public static void test() throws CustomException {
    throw new Exception();            // Compile error: unhandled exception
  }

  public static void main(String[] args) throws Exception {
    test();
  }

}
