import java.util.Scanner;

public class ExceptionExercise4a {
    // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    // scanner.close();
    
    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."
    
    // try, catch
    try {
      registerUser(username, password, email);
      System.out.println("User Registration is success.");
    } catch (UserRegistrationException e) {
        System.out.println("User Registration is fail.");
    }
  }

  public static class UserRegistrationException extends RuntimeException {
    // code here ...
    public UserRegistrationException(String message) {
      super(message);
    }
  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password, String email) {
    // code here ...
    boolean isValidUsername = true;
    boolean isValidPassword = true;
    boolean isValidEmail = true;
    try {
      validateUsername(username);
    } catch (InvalidUsernameException e) {
        System.out.println("Send an email to somebody.");
        isValidUsername = false;
    } 
    try {
      validatePassword(password);
    } catch (InvalidPasswordException e) {
        System.out.println("Send a SMS to somebody.");
        isValidPassword = false;
    } 
    try {
      validateEmail(email);
    } catch (InvalidEmailException e) {
        System.out.println("Make a call by phone to somebody.");
        isValidEmail = false;
    }
    if (!isValidUsername || !isValidPassword || !isValidEmail) {
      String message = "";
      if (!isValidUsername) 
        message += "Invalid username. ";
      if (!isValidPassword)
        message += "Invalid password. ";
      if (!isValidEmail)
        message += "Invalid email.";
      throw new UserRegistrationException(message);
    }
  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    // code here ...
    if (username == null || username.trim().isEmpty()) {
      throw new IllegalArgumentException("Invalid username. Username cannot be null nor empty.");
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    // code here ...
    boolean containsSpecialCharacter 
      = password.contains("!") || password.contains("@") || password.contains("#") 
        || password.contains("$") || password.contains("&") || password.contains("_");
    if (password == null || password.length() < 8 || !containsSpecialCharacter) {
      throw new IllegalArgumentException("Invalid password. Password must be at least 8 characters long, "
        + "and contain at least one special character (!@#$&_)");
    }
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {
    // code here ...
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException("Invalid email. Email must contain '@' character.");
    }
  }
}
