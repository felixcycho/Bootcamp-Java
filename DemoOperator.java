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
    boolean isElderly = age > 65;
    // Approach 2:
    if (age > 65) {
      isElderly = true;
    }
    char ch = 'a';
    boolean isCharEqualsToA = ch == 65;
    System.out.println(isCharEqualsToA);    // true

    char grade = 'R';    // A, B, C, D, E, F
    // Approach 1: use "or"
    boolean isGradeValid = ( grade == 'A' || grade == 'B' || grade == 'C' 
        || grade == 'D' || grade == 'E' || grade == 'F' );
    // Approach 2: use "if"
    if ( grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'
        || grade == 'E' || grade == 'F') {
          isGradeValid = true;
    }
    // Approach 3:  ASCII value range check
    isGradeValid = grade >= 'A' && grade <= 'F';
    // ! because we are using comparison operator (>=, <=, >, <),
    // ! convert char value to int value before comparison

    // +1
    int u = 1;
    u++;    // Only +1 can use ++
    System.out.println(u);    // 2
    u = u + 1;
    u += 1;
    System.out.println(u);    // 4
    
    // -1
    int uu = 5;
    uu--;    // Only -1 can us --
    System.out.println(uu);    // 4
    uu = uu - 1;
    uu -= 1;
    System.out.println(uu);    // 2

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
    
    }
  
}
