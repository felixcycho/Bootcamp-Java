// ! Class -->  return
// ! Checked Exception Class  -->  throw
// ! Unchecked Exception Class  -->  throw
public class InvalidParameterException extends Exception {         // checked exception,  extends Exception 逼 caller 去 fix.
                                                                     // 然而, RuntimeException 可以 not extend Exception Class.
  // new InvalidParameterException("xxx")
  public InvalidParameterException(String message) {
    super(message);
  }
  // 無需 getMessage(), 因為 Exception Class 已經有 super(message)
  
}
