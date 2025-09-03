// ! Class -->  return
// ! Checked Exception Class  -->  throw
// ! Unchecked Exception Class  -->  throw
public class InvalidParameterException extends Exception {           // checked exception
  // new InvalidParameterException("xxx")
  public InvalidParameterException(String message) {
    super(message);
  }
  // 無需 getMessage(), 因為 Exception Class 已經有 super(message)
  
}
