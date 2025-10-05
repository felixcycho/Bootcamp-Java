public class DemoOperator {
  public static void main(String[] args) {
    //  Math operators: +=, -=, *=, /=

    int x = 3;
    x += 4;    // x = x + 4
    System.out.println(x);    // 7

    int y = 9;
    y -= 8;    // y = y - 8
    System.out.println(y);    // 1

    int z = 8;
    z *= 9;    // z = z * 9
    System.out.println(z);    // 72

    int zz = 72;
    zz /= 6;    // zz = zz / 6
    System.out.println(zz);    // 12

    int zzz = 72;
    zzz %= 7;    // zzz = zzz % 7
    System.out.println(zzz);    // 2

    // Comparison operators: >, <, >=, <=, !=, ==
    int age = 70;
    // Approach 1:
    // because, age = 70 > 65
    // so, isElderly = (age > 65) => true
    // Otherwise, if age changes to ie. 60 < 65
    // isElderly = (age > 65) => false
    boolean isElderly = (age > 65);
    // Approach 2:
    if (age > 65) {
      isElderly = true;
    }
    System.out.println(isElderly);    // true

    char ch = 'a';
    boolean isCharEqualsToA = (ch == 65);    // 'A' is 65, 'a' is 97.
    System.out.println(isCharEqualsToA);    // false

    char grade = 'R';    // A, B, C, D, E, F
    // Approach 1: use "or"
    boolean isGradeValid = ( grade == 'A' || grade == 'B' || grade == 'C' 
        || grade == 'D' || grade == 'E' || grade == 'F' );
    System.out.println(isGradeValid);    // false
    // Approach 2: use "if"
    if ( grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'
        || grade == 'E' || grade == 'F') {
          isGradeValid = true;
    }
    System.out.println(isGradeValid);    // false
    // Approach 3:  ASCII value range check
    isGradeValid = ( grade >= 'A' && grade <= 'F');
    System.out.println(isGradeValid);    // false
    // ! because we are using comparison operator (>=, <=, >, <),
    // ! convert char value to int value before comparison

    // +1
    int u = 1;
    u++;    // Only +1 can use ++
    System.out.println(u);    // 2
    u = u + 1;
    u += 1;
    System.out.println(u);    // 4

    ++u;
    System.out.println(u);    // 5
    
    // -1
    int uu = 5;
    uu--;    // Only -1 can us --
    System.out.println(uu);    // 4
    uu = uu - 1;
    uu -= 1;
    System.out.println(uu);    // 2

    --uu;
    System.out.println(uu);    // 1

    // Odd / Even number
    int number = 23;
    boolean isOdd = (number % 2 == 1);
    if (isOdd) {    // default if isOdd is true
      System.out.println("Hello");
    }
    if (number % 2 == 1) {
      System.out.println("Hello");
    }
    
    int a = 7;
    int b = 4;
    int c = 9;
    int d = 10;
    int maxNumber = a;
    if (b > maxNumber) {
      maxNumber = b;
    }
    if (c > maxNumber) {
      maxNumber = c;
    }
    if (d > maxNumber) {
      maxNumber = d;
    }
    System.out.println("Max value = " + maxNumber );    // Max value = 10

    // leap year
    // the number of leap year can be divided by 4
    // But, if the number of a year can be divided by 100 -> Not a leap year (i.e. 2100)
    // Next, if the number of a year can be divided by 400 -> Leap year (i.e. 2000)
    int year = 2024;
    // "boolean isLeapYear = false" defaults isLeapYear is defined as false.
    boolean isLeapYear = false;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true;
        } else {
          isLeapYear = false;
        }
      } else {
        isLeapYear = true;
      }
    } // else {
      // isLeapYear = false;
    // because isLeapYear has already been designated as "false", in line 103,
    // just need to define in which situation isLeapYear would be "true", up to line 113,
    // Otherwise, if isLeapYear has not already been designated as "false",
    // The programming from line 114 to 115 should be written.
    // !false = true
    // !true = false
    
    System.out.println("Leap year? " + isLeapYear);

    isLeapYear = (year % 4) == 0 && (year % 100 == 0) && (year % 400 == 0)
        || (year % 4 == 0) && (year % 100 != 0);

    System.out.println("Leap year? " + isLeapYear);

  }
  
}
