public class DemoString {
  public static void main(String[] args) {
    // Data types:  8 Primitives, Class (String)
    // Only String variables can use the following commands (i.e. equals, length, charAt).
    // Otherwise, other 8 Primitives cannot use equals, length, charAt.
    String s1 = "hello";
    // Press "Control" on the word "String" above.
    // Click the link appeared, to see the code of String.
    System.out.println(s1);    // hello

    // length
    System.out.println(s1.length());    // 5

    // short l1 = s1.length(); is not valid, 
    // because s1.length() (=5) is an int value
    // int value cannot be assigned to short valuable
    int length = s1.length();

    // equals()
    // to check whether String s1 (="hello") is equal to the word "HELLO"
    if(s1.equals("HELLO")) {    // ! Java: case sensitive
      System.out.println("equals");
    } else {
      System.out.println("Not equal");    // print
    }
    
    boolean isEqualsToXXX = s1.equals("HELLO");
    System.out.println(isEqualsToXXX);

    // charAt(int index)
    System.out.println(s1.charAt(0));    // h, index = 0 means the first character of the string

    // print ASCII code of first character of a string
    int s1A = (char)(s1.charAt(0));
    System.out.println(s1A);

    // print the last character of a string
    int lastIndexOfString = s1.length() - 1;
    char lastCharOfString = s1.charAt(lastIndexOfString);
    System.out.println(lastCharOfString);

    // ! index -> out of range (system error)
    // because some Strings may only contain one character.
    // System.out.println(s1.charAt(-1)) -> error
    // System.out.println(s1.charAt(s1.length(A))) 
    // in which the variable A cannot be negative figure.

    

  }
}
