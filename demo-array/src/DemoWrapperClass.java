public class DemoWrapperClass {
  public static void main(String[] args) {
    // integer, long, double 較為常用
    // byte, short 較為少用
    // Wrapper Class, corresponding to a primitive
    // int (Primitive) --> Integer (Wrapper Class)
    // byte <-> Byte
    // short <-> Short
    // long <-> Long
    // char <-> Character
    // boolean <-> Boolean
    // float <-> Float
    // double <-> Double
    // no matter 大楷 or 細楷, 可儲存的 value type and range 都一樣不變.

    // ! Wrapper Class (More functionalities)
    // ! Primitive (For storing value, comparison, basic Math operation)
    // 將 primitive 形態轉換成 Wrapper class 形態, 就需用到 "Wrapper.valueOf(primitive)" method.

    // Define Wrapper Class Value
    System.out.println(Integer.valueOf(3));       // 3
    // System.out.println(Short.valueOf(3));    invalid, 3 is int value.
    System.out.println(Short.valueOf((short)3));  // 3
    System.out.println(Byte.valueOf((byte)3));    // 3
    System.out.println(Long.valueOf(3));          // 3, int -> long
    System.out.println(Character.valueOf('a'));   // a
    System.out.println(Boolean.valueOf(true));    // true
    System.out.println(Double.valueOf(3.3));      // 3.3

    Integer x = 3;     // Assign int value into Integer variable (Auto-box)
    int x2 = x;     // Assign Integer value into int box (Un-box)

    String s = x.toString();
    long l2 = x;    // Integer -> int -> long
    long l1 = x.longValue();

    Character ch = 'a';    // auto-box
    char ch1 = ch;    // Un-box

    // int --> long (auto-promotion / up-casting)
    // long --> int (explicit / down-casting)
    long l3 = 7;
    // long --> int (explicit down-casting)
    int x3 = (int) l3;

    // int --> long
    // Long l4 = 7;    ! Invalid, Integer has no relationship with Long.
    // 7 is default as int value.
    long l4 = (long) 7;    // int -> long (upcast) -> Long (auto-box)

    // long --> Integer
    // Integer x4 = 4L;    // long value cannot be input to int variable.
    Integer x4 = (int) 4L;    // long -> int (down-cast) -> Integer (auto-box)

    // ! Comparison
    // ! Primitive comparison 一定 (>, <, >=, <=, !=, ==)
    // ! Wrapper Class comparison (use method only, compareTo)
    // ! Only Wrapper Class can be used to compareTo.
    // ! Primitive Class can NOT be used to compareTo.
    Integer i1 = 10;
    Integer i2 = 11;
    System.out.println(i1 > i2);    // false,    int > int
    System.out.println(i1.compareTo(i2));    // -1, means smaller
    // 0 means equal; 1 means larger.
    
    int i3 = 12;
    System.out.println(i1.compareTo(i3));    // -1, means smaller
    // 0 means equal;  1 means larger.
    // i3.compareTo(i1) is invalid.
    // i3 is an int value, which is a primitive, which has no functionality.
    
    // Integer vs Long
    Long l5 = 20L;
    // i1.compareTo(l5)
    System.out.println(i1.longValue() > l5.longValue());    // false
    // 一定上 long, 不會落 int. 落 int 有 risk.

    // Character (ASCII)
    Character ch3 = 'b';
    System.out.println(ch3.charValue() > 97);    // true
    System.out.println(ch3.compareTo(Character.valueOf('a')));     // 1
    // 1 means larger, 0 means equal, -1 means smaller.

    

  }
}
