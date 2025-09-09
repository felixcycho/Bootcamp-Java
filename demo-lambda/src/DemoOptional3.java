import java.util.Optional;

public class DemoOptional3 {
  // ! Don't --> method input parameter type
    // ! Input parameter 不可裝 Optional<>
      // ! 會令情況更加惡劣.
  public static char searchChar(Optional<String> source, int index) {
    if (source == null || source.get() == null)
      throw new IllegalArgumentException("The data should not be null.");
    return source.get().charAt(index);
  }

  // ! Correct design of input parameter type
  public static char searchChar(String source, int index) {
    if (source == null)
      throw new IllegalArgumentException("The data should not be null.");
    return source.charAt(index);
  }
  
}
