public class DemoException {
  // public static void main(String[] args) throws Exception {
  public static void main(String[] args) {
    // int result = methodA("Lucas Chan", "Steven Wong");
    // ! try to call methodA
    try {
      int result = methodA(null, "Steven Wong");       // ! You (Method User), handle 死因報告
      System.out.println("result = " + result);
    } catch (RuntimeException e) {                     
      // ! 1. handle 死因報告, e is the exception object.
      // ! 2. Recovery
      System.out.println("The returned exception is well received.");
      System.out.println("The root cause is " + e.getMessage());
    } 
    // Happy flow: line 7, 8 18;    
    //Exception flow: 7, 9, 12, 13
    System.out.println("The end of program.");
        
    // Exception in thread "main" exception in thread "main" 
          // java.lang.NullPointerException: Cannot invoke "String.length()" because "s1" is null
            // at App.methodA(App.java:11)
            // at App.main(App.java:5)    
  }

  // IT logic
  // ! Method Author need to handle all Exception cases
    // 意料之外, method author 未有預料到, 未能兼顧到所有可能情況出現
    // For example, if either s1 or s2 is null or empty
  // ! Method --> either return or throw
  // ! For "throw", it is throwing an exception object
  public static int methodA(String s1, String s2) {      // another author
    if (s1 == null || s2 == null) {
    //  return -1;        // in real cases, cannot always use -1 to represent exception
    //  return new RuntimeException("s1 and s2 should not be null.");       // invalid, exception cannot be returned
      throw new RuntimeException("s1 and s2 should not be null.");   // ! 死因
    }
    // business logic (happy flow), instructed by upper colleagues, (i.e. users)
    if (s1.length() > s2.length()) {
      return methodB(s1);
    } else {
      return methodB(s2);
    }
  }

  public static int methodB(String x) {
    if (x.length() > 3) {
      return "hello".length();
    } else {
      return "goodbye".length();
    }
  }
}
