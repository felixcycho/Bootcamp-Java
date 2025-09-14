public class CustomException extends Exception {

  public CustomException() {

  }

  public CustomException(String msg, Throwable e) {
    super(msg, e);
  }

  public static void test() throws CustomException {
    throw new Exception();            // compile error, unhandled exception
  }

  public static void main(String[] args) throws Exception {
    test();
  }

}
