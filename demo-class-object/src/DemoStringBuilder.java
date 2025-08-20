public class DemoStringBuilder {
  public static void main(String[] args) {
    // Good performance
    StringBuilder sb = new StringBuilder("");
    sb.append('0');
    sb.append("a");    // similar to setter
    sb.append("b");    // similar to setter
    System.out.println(sb.toString());      // ab

    String str = "";
    String str2 = str + "a";    // return a new object
    String str3 = str2 + "b";    // return a new object
    System.out.println(str3);      // ab

    String url = "https://";
    url = url + "www.apple.com";

    long before = System.currentTimeMillis();    // ms
    String s1 = "";
    for (int i = 0; i < 100_000; i++) {
      s1 = s1 + "a";
    }
    long after = System.currentTimeMillis();    // ms
    
    System.out.println("s1 result = " + (after - before));

    before = System.currentTimeMillis();    // ms
    StringBuilder s2 = new StringBuilder("");
    for (int i = 0; i < 100_000; i++) {
      s2.append("a");
    }
    after = System.currentTimeMillis();    // ms
    
    System.out.println("s2 result = " + (after - before));

    int x = 10;
    short s = 0;
    // s = x;       invalid, because x is an int variable

    s = 10;     // 10 is an int value, but it is explicit value. Thus, java allows.

  } 
}
