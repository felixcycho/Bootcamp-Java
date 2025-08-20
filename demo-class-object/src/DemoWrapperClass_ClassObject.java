public class DemoWrapperClass_ClassObject {
  public static void main(String[] args) {

    // Logically, for example of hero game, an object (e.g. Hero h1) can be copied
    // by using NEW object method (i.e. Hero h2 = new hero()),
    // but both are the same objects.
    // in this case, h1.equals(h2) is true.  But, h1 == h2 is false.

    int x = 3;
    Integer x2 = new Integer(3);
    System.out.println(x2);         // 3

    // x2 -> object
    // x -> value

    x2 = 4;
    long l1 = x2.longValue();       // longValue() is a presentation of 3

    System.out.println(x2 > 3);    // true (wrong coding, but fixed digit is allowed)
    
    int x3 = 1;
    System.out.println(x2 > x3);    // true (wrong coding, high risk)

    Integer another = 10;
    System.out.println(x2.compareTo(another));     // -1
    System.out.println(x2.compareTo(4));           // 0 (int 4 -> Integer 4, auto-box)

    System.out.println(x2.equals(another));        // false

    // Another example
    // 有 new 出現, 就有 object 誕生.
    Integer x10 = new Integer(100);
    Integer x11 = new Integer(100);
    System.out.println(x10.equals(x11));    // true
    // x10.equals(x11) is checking if the value of x10 is equal to the value of x11.

    // ! because "==" is checking object address for objects
    System.out.println(x10 == x11);         // false

    // In this case, x12 is directed to the address of x10.
    Integer x12 = x10;
    System.out.println(x12 == x10);         // true

    // Wrapper Class (Internal Cache)
    // Integer -> -128 to 127
    Integer x13 = 100;
    Integer x14 = 100;
    System.out.println(x13.equals(x14));    // true

    // ! because "= 100" -> within internal cache
    // Java determines whether to create new object or not.
    // In this case, Java decides to reuse the same object.
    System.out.println(x13 == x14);         // true

    Integer x15 = 128;
    Integer x16 = 128;
    // 128 is out of the internal cache range.
    // Thus, Java decides to create a new object.
    System.out.println(x15.equals(x16));    // true
    System.out.println(x15.equals(x16));    // false

    Integer x17 = new Integer(100);
    Integer x18 = 100;    // within internal cache, reuse same object
    System.out.println(x17.equals(x18));    // true
    System.out.println(x17 == x18);         // false

    // ! The above cache theory applies to Byte, Short, Long, Integer.
    // ! Character (Only Cache 0 - 127) 英文字母
    // ! Boolean (true, false)
    // ! The above cache theory NOT applicable to Float, Double.

    Boolean isAdult = true;
    Boolean isElderly = new Boolean(true);     // 開新 object, but meaningless, thus not recommended
    System.out.println(isAdult.equals(isElderly));     // true

    // String has no range/cache criteria.
    // String -> literial pool
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2);           // true
    System.out.println(s1.equals(s2));      // true

    String inputPassword = "abcd1234";
    System.out.println(inputPassword.equals("abcd1234"));                       // true
    System.out.println(inputPassword.equals(new String("abcd1234")));           // true

    String s3 = new String("hello");
    String s4 = "hello2";
    System.out.println(s1 == s4);      // false
    System.out.println(s1 == s3);      // false

    // "+" operation in String
    String str1 = "hello";
    String str2 = str1 + "world";     // return new String object
    System.out.println(str1 == str2);       // false

    StringBuilder sb1 = new StringBuilder("hello");
    StringBuilder sb2 = sb1.append("world");
    System.out.println(sb1 == sb2);    // true
    // sb1.append(String) 只是用作更換 address 連接, address 依然不變.
    // 8 primitives 可修改自己 value, address 不變.
    // But, except for sb1.append(String), otherwise 若要修改 String, 一定要開 new Object.

    






  }
}
