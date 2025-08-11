public class DemoString {
  public static void main(String[] args) {
    // Data types:  8 Primitives, Class (String)
    // Only String variables (Class) can use the following commands (i.e. equals, length, charAt).
    // Otherwise, other 8 Primitives cannot use chain methods (e.g. equals, length, charAt., ...)
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
      System.out.println("Not equal");    // "Not equal"
    }
    
    boolean isEqualsToXXX = s1.equals("HELLO");
    System.out.println(isEqualsToXXX);    // false

    // charAt(int index)
    System.out.println(s1.charAt(0));    // h, index = 0 means the first character of the string

    // print ASCII code of first character of a string
    int s1A = (char)(s1.charAt(0));
    System.out.println(s1A);    // 104 (ASCII of 'a' is 97; ASCII of 'h' is 104.)

    // print the last character of a string
    int lastIndexOfString = s1.length() - 1;
    char lastCharOfString = s1.charAt(lastIndexOfString);
    System.out.println(lastCharOfString);

    // ! index -> out of range (system error)
    // because some Strings may only contain one character.
    // System.out.println(s1.charAt(-1)) -> error
    // System.out.println(s1.charAt(s1.length(A))) 
    // in which the variable A cannot be negative figure.

    // 4. contains()
    System.out.println("apple".contains("ap"));    // true
    System.out.println("apple".contains("AP"));    // false
    System.out.println("apple".contains("apple"));    // true
    System.out.println("apple".contains("apples"));    // false

    // 5. indexOf()
    // input: char, output: index
    System.out.println("halo".indexOf('l'));    // 2, index starting from 0
    System.out.println("hello".indexOf('l'));    // 2, the index of first character
    System.out.println("halo".indexOf('b'));    // -1, means 'b' cannot be found in "halo"
    System.out.println("hello world".indexOf("llo"));    // 2, 
    // the index of first char "l" of the composition "llo"
    
    // 6. equals
    System.out.println("apple".equals("apple"));    // true
    System.out.println("apple".equals("Apple"));    // false
    System.out.println("apple".equalsIgnoreCase("Apple"));    // true
    // Case, in the view of java, means 大小楷. equalsIgnoreCase means ignoring of 大小楷.
    System.out.println("apple".equalsIgnoreCase("Apple "));    // false
    System.out.println("apple".equalsIgnoreCase("appl"));    // false
    
    // 7. toUpperCase / toLowerCase
    System.out.println("apple".toUpperCase());    // APPLE
    System.out.println("Apple".toLowerCase());    // apple

    // 8. startsWith / endsWith
    System.out.println("apple".startsWith("a"));    // true
    System.out.println("apple".startsWith("app"));    // true
    System.out.println("apple".startsWith("A"));    // false
    System.out.println("apple".endsWith("ple"));    // true
    System.out.println("apple".endsWith("PLE"));    // false
    
    // check if a string contains "le" or "LE"
    String StringA = "appLe";
    
    // Primitives, Class
    // Primitives cannot further call methods.
    // But, String is a class, not a primitive,
    // thus String can further call methods, 
    // (e.g. toUpperCase, endsWith, etc.)
    // chain methods, 先將 "apple" 變成 uppercase "APPLE", 
    // 再 check if "APPLE" ends with "LE".
    System.out.println(StringA.toUpperCase().endsWith("LE"));    // true
    System.out.println(StringA.endsWith("le") || StringA.endsWith("LE"));    // false

    boolean resultA = StringA.endsWith("le") || StringA.endsWith("LE");
    System.out.println(resultA);    // false

    // 9. concat
    System.out.println("hello".concat("world"));    // helloworld
    String StringB = "apple";
    // Both String value and String variable can use methods.
    System.out.println(StringB.concat("!!!"));    // apple!!!
    System.out.println(StringB);    // apple

    // Chain method
    System.out.println(StringB.concat("banana").length());    // 11
    System.out.println(StringB.concat("lemon").equals("applelemon"));    // true
    // StringB.concat("lemon").equals("applelemon") is boolean value "true"
    // Boolean value cannot further call method.

    // 10. replace()
    String StringC = "banana";
    String resultC = StringC.replace('a', 'x');
    System.out.println(resultC);    // bxnxnx

    System.out.println(StringC.replace("an", "fuck"));    // bfuckfucka
    System.out.println(StringC.replace("a", ""));    // bnn
    // ! "banana".replace('a', '') --> Not valid
    // ! "banana".replace("a", '') --> Not valid 
    // ('' cannot be no character, but ' ' can be a space.)
    // ! "banana".replace('a', "") --> Not valid
    // ('a' is a char value, StringC is a String value.)

    // 11. isEmpty() / isBlank()
    System.out.println("apple".isEmpty());    // false
    System.out.println("".isEmpty());    // true

    String StringD = null;    // null value (cannot be regarded as String value)
    // System.out.println(StringD.length());    invalid
    // System.out.println(StringD.isEmpty());    invalid
    // System.out.println(StringD.isBlank());     invalid

    String StringE = "";    // empty String value
    // System.out.println(StringD.length());  is not valid, system error 
    // null value is not a String value
    System.out.println(StringE.length());    // 0
    System.out.println(StringE.isEmpty());    // true
    System.out.println(StringE.isBlank());    // true

    String StringF = "       ";
    System.out.println(StringF.length());    // 7
    System.out.println(StringF.isEmpty());    // false
    System.out.println(StringF.isBlank());    // true


    










    // 12. lastIndexOf()




  }
}
