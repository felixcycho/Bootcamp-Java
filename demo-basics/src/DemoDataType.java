package src;

public class DemoDataType {
  public static void main(String[] args) {
    // int, double, String, char, boolean, byte, short, long, float (Primitive)
    // "Hello world" => String value
    // s1 => String variable
    String s1 = "Hello world";
    System.out.println(s1);

    // boolean can only store "true" or "false".
    // variable naming convention --> camel case
    // Never in java: is_male (python), ismale, etc.
    boolean isMale = true;

    int age = 66;
    boolean isElderly = (age >= 65);
    // Step 1: age >= 65  =>  true value
    // Step 2: assign true value into boolean variable
    System.out.println(isElderly);    // true

    // char can only store one single character
    // character means any one byte (i.e. 1, e, _, [space], etc.)
    // but character cannot be nothing.
    // ! define char value -> use single quote ''
    // ! define String value -> use double quote ""
    // ! range of char: 0 - 65530
    char gender = 'M';
    System.out.println(gender);
    char ch = 'の';
    int chAscii = ch;
    System.out.println(chAscii);
    char ch2 = '我';
    int ch2Ascii = ch2;
    System.out.println(ch2Ascii);
    char ch3 = '体';
    int ch3Ascii = ch3;
    System.out.println(ch3Ascii);

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

    String s2 = "100L";
    System.out.println(s2);
    
    // short r1 = b1 + s3; // byte value + short value --> int + int --> int
    // cannot assign int value to short variable
    int r1 = b1 + s3;
    System.out.println(r1);    // 32894

    // b1 is byte value, 1 is int value
    // byte + int => int value
    // byte b10 = b1 + 1; is not valid
    // int value cannot be assigned into byte variable.
    int b10 = b1 + 1;
    System.out.println(b10);

    // lower limit of int = -2,147,483,648
    // Upper limit of int = 2,147,483,647
    // 2,147,483,647 + 1 = 2,147,483,648
    // over the upper limit of int
    // 2,147,483,647 + 1 => -2,147,483,648
    // Overflow
    // int i11 = -2,147,483,648
    int i10 = 2_147_483_647;
    int i11 = i10 + 1;
    System.out.println(i11);     // -2,147,483,648

    // 2,100,000,000 + 100,000,000 = 2,200,000,000
    // Over the upper limit of int
    // Overflow
    // 2,100,000,000 + 100,000,000 => -2,000,000,000
    int i12 = 2_100_000_000 + 100_000_000;
    System.out.println(i12);     // -2,094,967,296

    // by default, 7.84 is a double value
    // by default, 7 is a int value
    // 7.84 cannot be assigned into float variable
    // Instead, 7.84f can be assigned into float variable
    // Similarly, 100L can be assigned into long variable
    float width = 7.84f;
    System.out.println(width);    // 7.84
    long kkkkk = 10L;
    System.out.println(kkkkk);    // 10
    double ddddd = 9.89d;
    System.out.println(ddddd);    // 9.89

    // As 7.77 is double value, we cannot assign double value into float variable
    // ! double > float
    // float f1 = 7.77; is not valid

    // float value * float value => float value
    float length = 5.3f;
    float area = length * width;
    System.out.println(area);    // 41.552002

    float area2 = length * 7.84f;  
    // float value * double value => double value,
    // double value cannot be assigned into float variable
    // float area2 = length * 7.84;  is not valid
    // By default, 7.84 is a double value.
    System.out.println(area2);

    // ASCII Code
    // a,b,c,d,...,1,2,3,4,...,!,@,#,$,%,^,...
    // ASCII Code, e.g.'0'= 48, 'A'= 65, 'a'=97, etc.
    // char is sized 16 bits, ranged from 0 to 65530
    
    char letter1 = 97;     // ASCII Code, 'a' is 97.
    System.out.println(letter1);    // a

    int letter2 = letter1 + 1;
    System.out.println(letter2);    // 98

    // Step 1: char value + int value => int value
    // int value cannot be assigned into char variable
    // char letter2 = letter + 1;  is not valid
    char letter3 = (char) (letter1 + 1);    // downcast (int -> char)
    System.out.println(letter3);    // b

    int asciiForZero = 48;
    char letter4 = (char)(asciiForZero);
    System.out.println(letter4);    // '0'

    int asciiForA = 'A';
    // Step 2: assign char value into int variable
    // Step 3: auto-convert char value to ascii code
    System.out.println(asciiForA);    // 65

    char letterForZ = 'A' + 25;    // ! explicit char value + explicit int value
    System.out.println(letterForZ);    // Z

    int distance = 2;
    // char letterForC = 'A' + distance;
    // explicit char value + int variable
    // ! risk that letterForC may be over limit of 65530
    char letterForC = (char)('A' + distance);
    System.out.println(letterForC);    // 'C'


    
  }
  
}
