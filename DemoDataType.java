public class DemoDataType {
  public static void main(String[] args) {
    // int, double, String, char
    // "Hello world" => String value
    // s1 => String variable
    String s1 = "Hello world";
    System.out.println(s1);

    // boolean can only store "true" or "false".
    // variable naming convention --> camel case
    // Never in java: is_male (python), ismale, etc.
    boolean isMale = true;

    int age = 66;
    boolean isElderly = age >= 65;
    // Step 1: age >= 65  =>  true value
    // Step 2: assign true value into boolean variable
    System.out.println(isElderly);    // true

    // char can only store one single character
    // character means any one byte (i.e. 1, e, _, [space], etc.)
    // but character cannot be nothing.
    // ! define char value -> use single quote ''
    // ! define String value -> use double quote ""
    char gender = 'M';
    System.out.println(gender);

    // byte, short, int, long
    // All the above four types can only store integer.
    // int can be limited to 2.1 billion
    // long can even reach to 2 ^ 63
    byte age2 = 100;
    // byte: -128 to 127
    // short: -32768 to 32767
    // int: -2.1 billion to 2.1 billion
    // long: -2^63 to 2^63

    // ! Java: long > int > short > byte (level of type)
    // ! e.g. Long value cannot be assigned to int variable.
    // ! But conversely, int value can be assigned to long variable.
    long l1 = 100;
    // Step 1: assign 100 int value into long type variable (OK)
    // 100 is int value, so 100 can be assigned into long variable.
    System.out.println(l1);    // 100

    long l2 = 100L;
    // assign 100L long value into long type variable (OK)
    // 100L is a long value,  "100L" is a String value.
    // 100L (long value) can be assigned into long variable.
    // Long value can only 
    System.out.println(l2);    //100

    // ! byte type variable can only store an integer between -128 and 127.
    // -129 cannot be assigned into a byte variable
    // 128 cannot be assigned into a byte variable
    // ! byte b1 = -129; is out of range.
    // ! byte b1 = 128;  128 is out of range.
    byte b1 = 127;
    byte b2 = -128;
    
    short s3 = 32767;
    short s4 = -32768;

    int ii1 = b1 + 7;
    // Step 1: byte value + int value => int value
    // Step 2: assign int value into int variable
    System.out.println(ii1);    // 134
    




  }
  
}
