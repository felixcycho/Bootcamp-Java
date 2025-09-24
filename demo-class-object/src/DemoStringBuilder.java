public class DemoStringBuilder {
  public static void main(String[] args) {
    // Good performance
    StringBuilder sb = new StringBuilder("");
    sb.append(1);      // similar to setter
    sb.append(0.5);    // similar to setter
    sb.append(3L);     // similar to setter
    sb.append('0');    // similar to setter
    sb.append("a");    // similar to setter
    sb.append("b");    // similar to setter
    System.out.println(sb.toString());      // 10.530ab
    System.out.println(sb);                 // 10.530ab

    String str = "";
    String str2 = str + "a";    // return a new object
    String str3 = str2 + "b";    // return a new object
    System.out.println(str3);      // ab

    String url = "https://";
    url = url + "www.apple.com";
    System.out.println(url);        // https://www.apple.com

    long before = System.currentTimeMillis();    // ms
    String s1 = "";
    for (int i = 0; i < 100_000; i++) {
      s1 = s1 + "a";
    }
    long after = System.currentTimeMillis();    // ms
    
    System.out.println("s1 result = " + (after - before));         // range from 500 to 600

    before = System.currentTimeMillis();    // ms
    StringBuilder s2 = new StringBuilder("");
    for (int i = 0; i < 100_000; i++) {
      s2.append("a");
    }
    after = System.currentTimeMillis();    // ms
    
    System.out.println("s2 result = " + (after - before));         // range from 0 to 20

    int x = 10;
    short s = 0;
    // s = x;       invalid, because x is an int variable

    s = 10;     // 10 is an int value, but it is explicit value. Thus, java allows.
    System.out.println(s);                   // 10
    s = -32768;
    System.out.println(s);                   // Max of short = 32767;  Min of short = -32768
    // s = s - 1                             // invalid
    System.out.println(s - 1);               // -32769

    String s3 = "";
    for (int i = 0; i < 10; i++) {
      s3 += "a";
    }
    System.out.println("s3 result = " + s3);  // aaaaaaaaaa

    String s4 = "";
    for (int i = 0; i < 10; i++) {
      s4 = i + "a";
    }
    System.out.println("s3 result = " + s4);  // 9a

    String s5 = "";
    for (int i = 0; i < 10; i++) {
      s5 = s5 + i + "a";
    }
    System.out.println("s3 result = " + s5);  // 0a1a2a3a4a5a6a7a8a9a


  } 
}
