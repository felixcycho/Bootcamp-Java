public class DemoMath {
  public static void main(String[] args) {
    int x = 5;
    int y = 9;

    System.out.println(x + y); // 14 (int) -> "14"

    double a = 0.2;
    double b = 0.4;
    double c = a - b;

    System.out.println(c);    // -0.2


    int g = 40;
    int h = 3;
    int j = g * h;

    System.out.println(j);    // 120

    int k = 40;
    int l = 3;
    int m = k / l;

    System.out.println(m);    // 13

    double n = 40;
    double o = 3;
    double p = n / o;

    System.out.println(p);    // 13.333333333........

    // 9 / 3
    j = 9 / 3;
    System.out.println(j);    // 3

    // 9 / 2
    j = 9 / 2;   // 4
    System.out.println(j);    // 4

    double d1 = 9 / 2;
    // Step 1: 9 / 2 (int value / int valud --> int value) => 4
    // Step 2: put 4 (int value) into double type variable => 4.0
    System.out.println(d1);    // 4.0

    // 4.5
    // Approach 1;
    double d2 = 9.0 / 2;
    // Step 1: 9.0 / 2 (double value / int value --> double value) => 4.5
    // Step 2: put 4.5 (double value) into double type variable => 4.5
    System.out.println(d2);    // 4.5

    double d3 = 9 /  2.0;
    System.out.println(d3);    // 4.5

    double d4 = 9.0 / 2.0;
    System.out.println(d4);    // 4.5

    // 9.0 / 2.0 -> double value
    // ! Java: double type is higher than int type
    // ! We cannot assign a higher level type into a lower level type of variable
    // ! int d5 = 9.0 / 2.0;    cannot assign double value into int variable

    double d5 = 2;    
    // 2 is int value, and int type is lower than double type, 
    // so we can assign int value into double variable
    // auto-convert (auto-upgrade from int to double for the value)
    System.out.println(d5);    // 2.0

    // ! double d6 = 9 / 0
    // ! any figure is not allowed to be divided by 0.
    // Not only for java, but also for all languages.

    // remainder
    int i2 = 10 / 3;
    System.out.println(i2);    // 3

    int i3 = 10 % 3;
    System.out.println(i3);    // 1 (remainder)

    int i4 = 6 + 8 * 3;
    System.out.println(i4);    // 30

    int i5 = (6 + 8) * 3;
    System.out.println(i5);    // 42

    int i6 = (9 + 7) * ((8 - 3) * 9 - 3);
    System.out.println(i6);    //672

    



    // try +,-,*,/
  }
}